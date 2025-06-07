plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.gobbledygook.theawless.faltuapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.gobbledygook.theawless.faltuapp"
        minSdk = 21
        targetSdk = 35
        versionCode = 11
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}