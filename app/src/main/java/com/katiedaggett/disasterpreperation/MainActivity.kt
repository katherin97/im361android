package com.katiedaggett.disasterpreperation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)

        val adapter = MainActivityPagerAdapter(this)
        viewPager.adapter = adapter

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            if (position == 0) {
                tab.text = "Tornado"
            }
            if (position == 1) {
                tab.text = "Hurricane"
            }
            if (position == 2) {
                tab.text = "Earthquake"
            }
            if (position == 3) {
                tab.text = "Tsunami"
            }
            if (position == 4) {
                tab.text = "Wildfire"
            }
            if (position == 5) {
                tab.text = "Volcano"
            }
            if (position == 6) {
                tab.text = "Flood"
            }
            if (position == 7) {
                tab.text = "Blizzard"
            }
            if (position == 8) {
                tab.text = "Drought"
            }
        }.attach()
    }

    private inner class MainActivityPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
        override fun getItemCount(): Int {
            return 9
        }

        override fun createFragment(position: Int): Fragment {
            if (position == 0) {
                return TornadoInfoFragment()
            }
            if (position == 1) {
                return HurricaneInfoFragment()
            }
            if (position == 2) {
                return EarthquakeInfoFragment()
            }
            if (position == 3) {
                return TsunamiInfoFragment()
            }
            if (position == 4) {
                return WildfireInfoFragment()
            }
            if (position == 5) {
                return VolcanoInfoFragment()
            }
            if (position == 6) {
                return FloodInfoFragment()
            }
            if (position == 7) {
                return BlizzardInfoFragment()
            }
            return DroughtInfoFragment()
        }

    }

}
