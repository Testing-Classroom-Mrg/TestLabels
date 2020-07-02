package com.example.testlabels

import android.os.Bundle
import android.view.ActionMode
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //lines

    override fun onActionModeStarted(mode: ActionMode?) {
        super.onActionModeStarted(mode)
    }
}
