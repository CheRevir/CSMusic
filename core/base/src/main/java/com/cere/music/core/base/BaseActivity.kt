package com.cere.music.core.base

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding>(@LayoutRes private val contentLayoutId: Int) :
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
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        rootView = findViewById(R.id.root)
        contentView = findViewById(R.id.content)
        val content = layoutInflater.inflate(contentLayoutId, null)
        contentView.addView(content)
        binding = onViewBinding(content)
    }

    abstract fun onViewBinding(content: View): VB
}