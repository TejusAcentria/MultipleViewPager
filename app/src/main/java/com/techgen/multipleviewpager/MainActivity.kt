package com.techgen.multipleviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private var adapter: SampleAdapter? = null
    private var tabs: TabLayout? = null
    private var pager: ViewPager? = null
    private val category = arrayOf("a", "b", "50", "d", "e", "f", "g")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager = findViewById(R.id.pager) as ViewPager
        adapter = SampleAdapter(supportFragmentManager, category)
        pager!!.adapter = adapter

        tabs = findViewById(R.id.tabs) as TabLayout
        tabs!!.setupWithViewPager(pager)
        if (category.size > 4) {
            tabs!!.tabMode = TabLayout.MODE_SCROLLABLE
        } else {
            tabs!!.tabMode = TabLayout.MODE_FIXED
        }

        adapter!!.setPageCount(category.size)
        adapter!!.notifyDataSetChanged()
    }

}
