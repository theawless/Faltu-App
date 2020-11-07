package com.gobbledygook.theawless.faltuapp

import android.app.Activity
import android.content.Intent
import android.net.Uri

class UninstallActivity : Activity() {
    override fun onResume() {
        super.onResume()
        val uri = Uri.parse("package:$packageName")
        val intent = Intent(Intent.ACTION_DELETE, uri)
        startActivity(intent)
    }
}