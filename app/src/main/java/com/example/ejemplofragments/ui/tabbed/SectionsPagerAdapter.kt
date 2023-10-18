package com.example.ejemplofragments.ui.tabbed

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.ejemplofragments.R
import com.example.ejemplofragments.ui.batman.Fragment1
import com.example.ejemplofragments.ui.flash.Fragment2
import com.example.ejemplofragments.ui.superman.Fragment3
import com.example.ejemplofragments.ui.wonderwoman.Fragment4

private val TAB_TITLES = arrayOf(
    R.string.superhero1,
    R.string.superhero2,
    R.string.superhero3,
    R.string.superhero4
)

class SectionsPagerAdapter (private val context: Context, fm:FragmentManager): FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> Fragment4()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 4
    }
}