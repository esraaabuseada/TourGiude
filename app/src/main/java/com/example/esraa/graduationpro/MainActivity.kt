package com.example.esraa.graduationpro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  textView =findViewById<TextView>(R.id.textView)
        val  button =findViewById<Button>(R.id.button)

        button.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                textView.text="Tour Guid"
                //  Log.v("yorick",presenterObj.modelCounterIncrement().toString());

            }

        } )

    }
}
