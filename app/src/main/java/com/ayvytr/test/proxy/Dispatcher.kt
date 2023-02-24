package com.ayvytr.test.proxy

import com.ayvytr.test.bean.ArmBean

class Dispatcher constructor() {
  @get:JvmName("executorService")
  val executorService: ArmBean
    get() {
      return ArmBean()
    }

}