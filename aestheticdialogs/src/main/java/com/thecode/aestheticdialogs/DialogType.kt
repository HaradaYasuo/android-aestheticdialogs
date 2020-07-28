package com.thecode.aestheticdialogs

import androidx.annotation.Keep

@Keep
class DialogType {

    companion object {
        const val SUCCESS = "DIALOG_SUCCESS"
        const val ERROR = "DIALOG_ERROR"
        const val WARNING = "DIALOG_WARNING"
        const val INFO = "DIALOG_INFO"
    }
}