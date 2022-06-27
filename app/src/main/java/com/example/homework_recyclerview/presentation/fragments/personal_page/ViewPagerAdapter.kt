package com.example.homework_recyclerview.presentation.fragments.personal_page

import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.homework_recyclerview.presentation.fragments.personal_page.viewPagerFragments.FirstFragment
import com.example.homework_recyclerview.presentation.fragments.personal_page.viewPagerFragments.SecondFragment
import com.example.homework_recyclerview.presentation.fragments.personal_page.viewPagerFragments.ThirdFragment

class ViewPagerAdapter(fm: FragmentActivity): FragmentStateAdapter(fm) {

    private val fragments = mutableListOf(
        FirstFragment(), SecondFragment(), ThirdFragment()
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    fun getPageTitle(position: Int): CharSequence{
         return when(fragments[position]){
            is FirstFragment -> "Основные"
            is SecondFragment -> "Статистика"
            else -> "Еще один таб"
        }
    }
}