package com.foolchen.kotlin.examples.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * 扩展自[Fragment]的基类
 * 此处在定义该类时，必须将类生命为open（或者abstract），否则其他类无法继承该类
 * @author chenchong
 * 2017/5/29
 * 下午4:29
 */
open class BaseFragment : Fragment() {

  var mContentView: View? = null

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    return mContentView
  }

  fun setContentView(view: View): View? {
    mContentView = view
    return mContentView
  }

  fun setContentView(layoutResId: Int, lf: LayoutInflater?, container: ViewGroup?): View? {
    return setContentView(lf!!.inflate(layoutResId, container, false))
  }

  fun findViewById(id: Int): View? {
    return mContentView?.findViewById(id)
  }
}
