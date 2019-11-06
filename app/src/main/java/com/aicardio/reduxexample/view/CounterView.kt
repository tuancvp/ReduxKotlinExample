package com.aicardio.reduxexample.view

import android.widget.Button
import android.widget.TextView

interface CounterView {
    val counterText: TextView
    val incrementButton: Button
    val decrementButton: Button
}