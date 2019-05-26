package com.raleigh.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
const val REQUEST_IMAGE_CAPTURE = 1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when user presses the send button. */
    fun sendMessage(view : View)
    {
        // Do something in response to the button

        // The view for the text box field
        val editText = findViewById<EditText>(R.id.editText2)

        // The message the user typed in the textbox
        val message = editText.text.toString()


        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            // Puts the message the user typed into the extra message variable
            putExtra(EXTRA_MESSAGE, message)
        }

        startActivity(intent)

    }





}
