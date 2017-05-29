package com.foolchen.kotlin.examples.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foolchen.kotlin.examples.R

class HomeFragment : BaseFragment() {
  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    return setContentView(R.layout.fragment_home, inflater, container)
  }
}