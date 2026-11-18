package com.example.mysdk

import android.content.Context
import android.util.Log

public object MySdk {

    private var isInitialized: Boolean = false
    private var apiKey: String? = null

    public fun initialize(context: Context, apiKey: String) {
        isInitialized = true
        this.apiKey = apiKey
        Log.d("MySdk", "SDK uğurla işə salındı! API Key: $apiKey")
    }

    public fun doSomething(): String {
        check(isInitialized) { "SDK istifadə edilməzdən əvvəl MySdk.initialize(...) çağırılmalıdır!" }
        return "SDK uğurla işləyir!"
    }

}