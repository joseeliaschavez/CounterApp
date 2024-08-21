package com.rangerforce.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private var _count: MutableState<Int> = mutableIntStateOf(0)
    val count: Int get() = _count.value

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}