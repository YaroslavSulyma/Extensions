package com.example.extensions

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val l = mutableListOf(1, 2, 3)
        l.swap(0, 2)
        Log.d("SWAP", l.toString())

        this.toast("$l")

        val text = null
        val t = text.stringOrNull()
        Log.d("stringOrNull", t.toString())

        textView.underLine()

        imageView.loadFromUrl("https://www.androidhive.info/wp-content/uploads/2016/04/android-working-with-glide-image-library.jpg")

        val width = this.screenWidth().toString()
        this.toast(width)
        val height = this.screenHeight().toString()
        this.toast(height)

        buttonCheck.setOnClickListener {
            val email: String = emailText.text.toString()
            if(email.isValidEmail()) toast("E-mail is correct")
            else toast("invalid E-mail")

            textView.invisible()
        }
    }

}
