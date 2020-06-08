package com.yey.kotlin2

import org.junit.Test

class `51-闭包` {
    // 函数式编程,函数可以作为方法的返回值,方法可以作为函数的参数.
    // 函数不保存状态, 闭包可以让函数携带状态
    // 闭包定义: 一个函数返回了该函数的内部函数,该内部函数引用了外部函数的相关参数或者变量,把该返回的内部函数称为闭包
    @Test
    fun 测试闭包() {
        val 内部函数引用 = 闭包()
        内部函数引用()
        内部函数引用()
        内部函数引用()
        内部函数引用()

    }

    fun 闭包(): () -> Unit {
        // 函数的变量
        var index = 10
        // return {} 其实返回的就是一个函数
        return {
            println(index)
            // 函数的内部函数引用了该函数的变量或者参数
            index++
        }
    }
}