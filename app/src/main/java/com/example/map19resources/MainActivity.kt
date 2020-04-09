package com.example.map19resources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingTextViev : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTextViev = findViewById(R.id.textView)
    }

    fun buttonPressed(view : View) {

        greetingTextViev.text = getString(R.string.thank_you)

    }
}


//  1. text i layout
//  2. text i vår kod
//  3. bilder

