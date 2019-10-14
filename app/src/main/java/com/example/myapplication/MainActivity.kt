package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //onCreate = main function to android device
        super.onCreate(savedInstanceState)
        //Display the UI. R = resources
        setContentView(R.layout.activity_main)
        //val = value(final) , var = variable
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener(showName())
    }

    private fun showName(): View.OnClickListener? {
        textViewName.setText("Emmett")
        return null
    }
}
