package com.techgen.multipleviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SampleAdapter(mgr: FragmentManager, private val categories: Array<String>) : FragmentPagerAdapter(mgr) {
    private var pageCount = 0

    override fun getCount(): Int {
        return pageCount
    }

    override fun getItem(position: Int): Fragment {
        return EditorFragment.newInstance(position, categories[position])
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return categories[position]
    }

    internal fun setPageCount(pageCount: Int) {
        this.pageCount = pageCount
    }
}
