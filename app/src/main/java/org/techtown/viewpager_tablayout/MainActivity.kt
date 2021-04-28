package org.techtown.viewpager_tablayout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import org.techtown.viewpager_tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var context: Context
    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PagerAdapter(supportFragmentManager)
        adapter.addFragment(Fragment1(), "안녕")
        adapter.addFragment(Fragment2(), "검색")
        adapter.addFragment(Fragment3(), "내 서재")
        adapter.addFragment(Fragment4(), "마이페이지")
        binding.afterLoginViewpager.adapter = adapter
        binding.afterLoginTablayout.setupWithViewPager(binding.afterLoginViewpager)
    }
}