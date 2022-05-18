package com.example.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {

    val presenter : DomainPresenter by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, presenter.presentDomain(),Toast.LENGTH_LONG).show()
    }
}