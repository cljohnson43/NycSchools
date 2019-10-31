package com.example.nycschools

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nycschools.data.School
import com.example.nycschools.databinding.ListItemSchoolBinding

class SchoolsAdapter : ListAdapter<School, SchoolsAdapter.SchoolsViewHolder>(SchoolsDiff()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolsViewHolder {
        val binding = DataBindingUtil.inflate<ListItemSchoolBinding>(
            LayoutInflater.from(
                parent.context
            ),
            R.layout.list_item_school,
            parent,
            false
        )
        return SchoolsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SchoolsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class SchoolsViewHolder(private val binding: ListItemSchoolBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(schoolItem: School){
            with(binding) {
                school = schoolItem
                executePendingBindings()
            }
        }
    }
}

private class SchoolsDiff : DiffUtil.ItemCallback<School>() {
    override fun areItemsTheSame(oldItem: School, newItem: School): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: School, newItem: School): Boolean {
        return oldItem.dbn == newItem.dbn &&
                oldItem.school_name == newItem.school_name &&
                oldItem.school_email == newItem.school_email
    }
}