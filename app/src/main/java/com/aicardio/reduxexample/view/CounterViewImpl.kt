package com.aicardio.reduxexample.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import com.aicardio.reduxexample.R

class CounterViewImpl(context: Context?, attrs: AttributeSet? = null): RelativeLayout(context, attrs), CounterView {
    override val decrementButton by lazy { findViewById<Button>(R.id.bt_decrease) }
    override val incrementButton by lazy { findViewById<Button>(R.id.bt_increase) }
    override val counterText by lazy { findViewById<TextView>(R.id.tvCounter) }

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_counter, this, true)
    }
}