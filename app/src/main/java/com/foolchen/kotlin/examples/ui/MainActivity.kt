package com.foolchen.kotlin.examples.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.foolchen.kotlin.examples.R
import com.foolchen.kotlin.examples.utils.addOrShowFragment

class MainActivity : AppCompatActivity() {


  private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
    when (item.itemId) {
      R.id.navigation_home -> {

        addOrShowFragment(this, supportFragmentManager, R.id.fragment_container,
            HomeFragment::class.java.name)
        return@OnNavigationItemSelectedListener true
      }
      R.id.navigation_dashboard -> {
        return@OnNavigationItemSelectedListener true
      }
      R.id.navigation_notifications -> {
        return@OnNavigationItemSelectedListener true
      }
    }
    false
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val navigation = findViewById(R.id.navigation) as BottomNavigationView
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    navigation.selectedItemId = R.id.navigation_home
  }
}
