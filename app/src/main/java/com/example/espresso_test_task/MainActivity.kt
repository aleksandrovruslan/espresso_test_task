package com.example.espresso_test_task

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var stageTV: TextView
    private lateinit var continueBTN: Button

    private lateinit var countViewModel: CountViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        stageTV = findViewById(R.id.stage_tv)
        countViewModel = ViewModelProvider(this).get(CountViewModel::class.java)
        countViewModel.result.observe(this) {
            stageTV.text = it
        }

        continueBTN = findViewById(R.id.continue_btn)
        continueBTN.setOnClickListener {
            countViewModel.countIncrease()
        }
    }

}