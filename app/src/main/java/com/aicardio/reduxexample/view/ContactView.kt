package com.aicardio.reduxexample.view

import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

interface ContactView {
    val nameTextView: TextView
    val phoneTextView: TextView
    val iconImageView: ImageView
    val followButton: Button
}