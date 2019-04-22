package com.example.cisampleproject

import android.support.v7.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import android.os.Bundle
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // added a dumb comment thing here
        // added microsoft app center secret here. Normally, you don't want to expose this.
        AppCenter.start(
            application, "11f655f9-356e-4083-bbe6-9496354605d9",
            Analytics::class.java, Crashes::class.java
        )
    }
}
