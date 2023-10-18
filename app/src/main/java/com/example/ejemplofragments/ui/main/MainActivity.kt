package com.example.ejemplofragments.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.ejemplofragments.ui.master_detail.MasterDetailActivity
import com.example.ejemplofragments.databinding.ActivityMainBinding
import com.example.ejemplofragments.ui.button.ButtonNavigationActivity
import com.example.ejemplofragments.ui.navdrawer.NavigationDrawerActivity
import com.example.ejemplofragments.ui.tabbed.TabbedActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)


        mainBinding.buttonBottomNavigation.setOnClickListener {
            val intent: Intent = Intent(this, ButtonNavigationActivity::class.java)
            startActivity(intent)
        }

        mainBinding.buttonSwipeTabs.setOnClickListener {
            val intent: Intent = Intent(this, TabbedActivity::class.java)
            startActivity(intent)
        }

        mainBinding.buttonNavigationDrawer.setOnClickListener {
            val intent: Intent = Intent(this, NavigationDrawerActivity::class.java)
            startActivity(intent)
        }

        mainBinding.buttonMasterDetail.setOnClickListener {
            val intent: Intent = Intent(this, MasterDetailActivity::class.java)
            startActivity(intent)
        }
    }
}