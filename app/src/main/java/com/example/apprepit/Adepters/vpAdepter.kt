package com.example.apprepit.Adepters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.apprepit.Pages.FirstFragment
import com.example.apprepit.Pages.SecondFragment

class vpAdepter(fm:FragmentManager): FragmentStatePagerAdapter(fm) {

    val titles= listOf<String>("Первый","Второй")
    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0->FirstFragment()
            1->SecondFragment()
            else ->FirstFragment()
        }
    }
}