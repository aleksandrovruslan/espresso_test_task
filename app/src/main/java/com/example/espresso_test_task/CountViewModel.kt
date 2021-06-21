package com.example.espresso_test_task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private var _count = 1

    private var _result = MutableLiveData<String>().apply {
        value = "1 stage"
    }

    val result: LiveData<String> = _result

    fun countIncrease() {
        _result.value = if (_count < 3) {
            _count++
            "$_count stage"
        } else "Done"
    }

}