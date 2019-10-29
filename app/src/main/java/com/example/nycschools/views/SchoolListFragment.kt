package com.example.nycschools.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.nycschools.R
import com.example.nycschools.databinding.FragmentSchoolListBinding

class SchoolListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSchoolListBinding>(
            inflater,
            R.layout.fragment_school_list,
            container,
            false
        )

        return binding.root
    }
}