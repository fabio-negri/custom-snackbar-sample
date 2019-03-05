package com.example.customsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.customsnackbar.chef.ChefSnackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.button_chef).setOnClickListener {
            ChefSnackbar
                .make(it)
                .show()
        }
    }
}
