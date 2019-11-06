package com.aicardio.reduxexample.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.aicardio.reduxexample.R

class ContactViewImpl(context: Context?, attrs: AttributeSet? = null): RelativeLayout(context, attrs), ContactView {
    override val nameTextView by lazy { findViewById<TextView>(R.id.tvName) }
    override val phoneTextView by lazy { findViewById<TextView>(R.id.tvPhone) }
    override val iconImageView by lazy { findViewById<ImageView>(R.id.ivContact) }
    override val followButton by lazy { findViewById<Button>(R.id.btFollow) }

    init {
        LayoutInflater.from(context).inflate(R.layout.view_contact, this, true)
    }

}