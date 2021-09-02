package com.example.alertactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener { alert() }

    }
    fun alert(){
        val dlg = AlertDialog.Builder(this)
        dlg.setTitle("Alert")
        dlg.setMessage("Are you sure you want to exit")
        dlg.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int -> finish()})
        dlg.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> })
        dlg.show()
    }
}