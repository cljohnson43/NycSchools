package com.example.nycschools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.nycschools.utils.Logger
import com.example.nycschools.viewmodels.SchoolsViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: SchoolsViewModel by lazy {
        ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(
            SchoolsViewModel::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.log("${viewModel.loadSchools().size} schools stored")
    }
}
