package com.foolchen.kotlin.examples

import android.content.Context
import android.widget.Toast

/**
 * 工具类
 * @author chenchong
 * 2017/5/29
 * 下午4:09
 */

val TAG: String = "Kotlin-Samples";

/**
 *自定义的Toast方法，扩展自[Toast]
 * @param message 要打印的日志
 * @param tag 打印日志时使用的tag，可选；如果未指定tag则会默认使用[TAG]
 * @param length 日志持续时长，可选；如果未指定时长则会默认使用[Toast.LENGTH_SHORT]
 *
 * @sample example
 */
fun toast(context: Context, message: String, tag: String = TAG,
    length: Int = Toast.LENGTH_SHORT): Unit {
  Toast.makeText(context, "[$tag]:$message", length).show()
}

/**
 * 使用自定义Toast的示例
 * 其中[context]和[message]为必选参数，其他参数为可选；具体使用可选参数的方式可参考该方法
 */
fun example(context: Context, message: String) {
  // 这种可选参数的使用方式避免了数不清数量的函数重载
  // 并且由于在使用可选参数时指定了参数名，也不会出现传入了错误的参数的问题
  // 只使用必选参数
  toast(context, message)
  // 使用其中某个可选参数
  toast(context, message, length = Toast.LENGTH_LONG)
}
