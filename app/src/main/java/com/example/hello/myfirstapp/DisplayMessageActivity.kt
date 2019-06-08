package com.example.hello.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hello.myfirstapp.R.id.text
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
            val bundle: Bundle? =intent.extras
            val msg = bundle!!.getString("user_message")
            userText.text =  msg
        }
    }

