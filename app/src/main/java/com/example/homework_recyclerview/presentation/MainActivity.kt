package com.example.homework_recyclerview.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.convertor.R
import com.example.homework_recyclerview.presentation.fragments.converter.Main_Fragment1
import com.example.homework_recyclerview.presentation.fragments.personal_page.Main_Fragment2_firstPage
import com.example.homework_recyclerview.presentation.fragments.movies.Fragment3_Main
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.itemIconTintList = null
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.page_1 -> {
                    true
                }
                R.id.page_2 -> {
                    val transaction = supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, Fragment3_Main(), "MainFragment")
                    transaction.addToBackStack(null)
                    transaction.commit()
                    true
                }
                R.id.page_3 -> {
                    val transaction = supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, Main_Fragment1(), "MainFragment")
                    transaction.addToBackStack(null)
                    transaction.commit()
                    true
                }
                R.id.page_4 -> {
                    true
                }
                R.id.page_5 -> {
                    val transaction = supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, Main_Fragment2_firstPage(), "MainFragment")
                    transaction.addToBackStack(null)
                    transaction.commit()
                    true
                }
                else -> false
            }
        }
    }
}