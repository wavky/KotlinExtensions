package com.wavky.extensions

/**
 * Created on 2018/09/22
 * @author Wavky.Huang
 */

fun <R> Any.mapTo(result: R): R = result

fun <T, R> T.mapBy(transform: T.() -> R): R = transform()
