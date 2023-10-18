package com.example.mod31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var tv_onpause: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_onpause = findViewById(R.id.textView4)
        tv_onpause.text = "Activity is active!"

        findViewById<TextView>(R.id.textView).setText("Ini bukan hello world")
        Toast.makeText(applicationContext, "LANGKAH onCreate()", Toast.LENGTH_LONG).show()
    }
    override fun onStart(){
        super.onStart()
        findViewById<TextView>(R.id.textView2).setText("Activity sudah pernah melewati onStart()")
        Toast.makeText(applicationContext, "LANGKAH onStart()", Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "onStart()")
    }
    override fun onResume(){
        super.onResume()
        findViewById<TextView>(R.id.textView3).setText("Activity sudah pernah melewati onResume()")
        Toast.makeText(applicationContext, "onResume() in progres", Toast.LENGTH_SHORT).show()
        Log.i("MainActivity", "onResume()")
    }
    override fun onPause() {
        super.onPause()
        tv_onpause.text = "Activity sudah pernah melewati onPause()"
        Toast.makeText(applicationContext, "LANGKAH onPause()", Toast.LENGTH_SHORT).show()
        Log.i("MainActivity", "onPause()")
    }
    override fun onStop() {
        super.onStop()
        findViewById<TextView>(R.id.textView5).setText("Activity sudah pernah melewati onStop()")
        Log.i("MainActivity", "onStop()")
    }
    override fun onDestroy() {
        super.onDestroy()
        findViewById<TextView>(R.id.textView6).text = "Telah Melewati onDestroy()"
        Log.i("MainActivity", "onDestroy()")
    }

}