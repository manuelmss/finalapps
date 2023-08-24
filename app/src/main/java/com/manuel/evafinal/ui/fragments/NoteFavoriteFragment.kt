package com.manuel.evafinal.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.manuel.evafinal.R
import com.manuel.evafinal.databinding.FragmentNoteFavoriteBinding


class NoteFavoriteFragment : Fragment() {
    private lateinit var binding: FragmentNoteFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNoteFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

}