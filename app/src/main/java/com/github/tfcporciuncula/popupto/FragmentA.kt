package com.github.tfcporciuncula.popupto

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentA : Fragment(R.layout.fragment_a) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    view.findViewById<View>(R.id.textView).setOnClickListener {
//      findNavController().navigate(FragmentADirections.actionFragmentAToFragmentX())
      findNavController().navigate(FragmentADirections.actionFragmentAToFragmentXWontWork())
    }
  }
}
