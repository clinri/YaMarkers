package ru.netology.yamarkers.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import ru.netology.yamarkers.databinding.PlacesFragmentBinding

class PlacesFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = PlacesFragmentBinding.inflate(inflater, container, false)

        binding.empty.isVisible = true

        return binding.root
    }
}