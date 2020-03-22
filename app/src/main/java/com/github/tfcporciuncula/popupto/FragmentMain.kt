package com.github.tfcporciuncula.popupto

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentMain : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    if (true) {
      findNavController().navigate(FragmentMainDirections.actionFragmentMainToFragmentA())
    } else {
      findNavController().navigate(FragmentMainDirections.actionFragmentMainToFragmentB())
    }
  }
}
