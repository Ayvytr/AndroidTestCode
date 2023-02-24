package com.ayvytr.test.funinterface

import android.content.Context
import android.view.View
import com.ayvytr.test.funinterface.MyView.onCancelListener

/**
 * @author Administrator
 */
class MyView(context: Context): View(context) {
    var listener: onConfirmListener = object: onConfirmListener {
        override fun onConfirm() {
            TODO("Not yet implemented")
        }
    }


    @set:JvmName("setOnCancelListener")
    var cancelListener = onCancelListener { }

    interface onConfirmListener {
        fun onConfirm()
    }

    fun interface onCancelListener {
        fun onCancel()
    }
}