package com.krish.texttospeach

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.speech.tts.TextToSpeech
import android.os.Bundle
import com.krish.texttospeach.R
import android.speech.tts.TextToSpeech.OnInitListener
import android.view.View
import java.util.*

class MainActivity : AppCompatActivity() {
var e1: EditText? = null
var t1: TextToSpeech? = null
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    e1 = findViewById<View>(R.id.editTextTextPersonName) as EditText
    t1 = TextToSpeech(applicationContext) { i ->
        if (i != TextToSpeech.ERROR) {
            t1!!.language = Locale.UK
        }
    }
}

fun convert(V: View?) {
    val tospeak = e1!!.text.toString()
    t1!!.speak(tospeak, TextToSpeech.QUEUE_FLUSH, null)
}
}