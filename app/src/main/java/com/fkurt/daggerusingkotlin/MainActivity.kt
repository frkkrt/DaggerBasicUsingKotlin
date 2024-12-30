package com.fkurt.daggerusingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    internal lateinit var cargo:Cargo
    @Inject
    internal lateinit var internet: Internet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)
        //cargo=Cargo()
        cargo.send()
        //internet=Internet()
        internet.makeApplication()
    }
}