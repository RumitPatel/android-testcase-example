package com.rumit.android_testcase_example.utils

import android.text.Editable
import android.text.TextUtils

fun isValidNameValue(nameValue: Editable?): Boolean {
    return !(nameValue == null
            || TextUtils.isEmpty(nameValue)
            || nameValue.length !in 4..9
            )
}

fun reverseString(inputValue: String?): String {
    return if (inputValue != null && !TextUtils.isEmpty(inputValue)) {
        inputValue.reversed()
    } else {
        ""
    }
}