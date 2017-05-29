package com.foolchen.kotlin.examples.utils

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

/**
 * @author chenchong
 * 2017/5/29
 * 下午4:32
 */
fun addOrShowFragment(context: Context, fm: FragmentManager, layoutId: Int, name: String) {

  val ft = fm.beginTransaction()
  val tag = name
  var f = fm.findFragmentByTag(tag)
  if (f == null) {
    f = createFragment(context, name);
    ft.add(layoutId, f, tag);
  } else {
    val old = fm.findFragmentById(layoutId)
    if (old != null && old != f && !old.isHidden) {
      ft.hide(old)
    }
    ft.show(f)
  }
  ft.commit()
}

/**
 * 根据Fragment的名字创建对应的Fragment
 */
fun createFragment(context: Context, name: String): Fragment {
  return Fragment.instantiate(context, name)
}