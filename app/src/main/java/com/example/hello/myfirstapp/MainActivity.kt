package com.example.hello.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View)
    {
//        val message : String =  msgDisplay.text.toString()
//        val intent = Intent(this,DisplayMessageActivity::class.java)
//        intent.putExtra("user_message",message)
//        startActivity(intent)
        val message : String = msgDisplay.text.toString()
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT,message)
        intent.type = "text/plain"
        startActivity(Intent.createChooser(intent,"Share To:"))

   }

}
