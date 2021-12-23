package com.example.tiketta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.facebook.stetho.Stetho

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Stetho.initializeWithDefaults(this);
        Stetho.initialize(
            Stetho.newInitializerBuilder(this)
                .enableDumpapp(
                    Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(
                    Stetho.defaultInspectorModulesProvider(this))
                .build());

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, BaseActivity::class.java)
            startActivity(intent)
        }, 1500)
    }
}