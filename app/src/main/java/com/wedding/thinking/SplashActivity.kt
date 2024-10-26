package com.wedding.thinking

import android.os.Bundle

/**
 * Created by Carine
 */
class SplashActivity : androidx.appcompat.app.AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Add a delay (optional) to show the splash screen for a few seconds
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the main activity and finish the splash activity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000) // Delay for 3 seconds (adjust as needed)
    }
}