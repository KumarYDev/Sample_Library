package com.usermindarchive.h.samplelibrary

import android.content.Context
import android.widget.Toast

object Toster {

     fun success(c: Context, message: String) {
        Toast.makeText(c, message, Toast.LENGTH_LONG).show()
    }
}