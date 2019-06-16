package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE: String = "com.example.myfirstapp.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* Sendボタン押下時 */
    fun sendMessage(view: View) {
        val intent: Intent = Intent(this@MainActivity,
            DisplayMessageActivity::class.java)
        val editText: EditText = findViewById(R.id.editText) as EditText
        val message: String = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}
