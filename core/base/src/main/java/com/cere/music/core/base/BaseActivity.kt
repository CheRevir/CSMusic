package com.cere.music.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.viewbinding.ViewBinding
import com.google.android.material.appbar.MaterialToolbar

abstract class BaseActivity<VB : ViewBinding>() :
    AppCompatActivity() {
    protected lateinit var binding: VB
        private set
    protected lateinit var rootView: CoordinatorLayout
        private set
    protected lateinit var contentView: FrameLayout
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        rootView = findViewById(R.id.root)
        contentView = findViewById(R.id.content)
        binding = onViewBinding(layoutInflater)
        contentView.addView(binding.root)
    }

    abstract fun onViewBinding(inflater: LayoutInflater): VB
}