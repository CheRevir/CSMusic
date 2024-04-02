package com.cere.music.feature.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.cere.music.core.base.BaseFragment
import com.cere.music.feature.login.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    private val viewModel: LoginViewModel by viewModels()

    override fun onViewBinding(inflater: LayoutInflater, parent: ViewGroup?): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(inflater, parent, false)
    }

}