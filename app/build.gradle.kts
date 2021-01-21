plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(Android.compileSdk)
    defaultConfig {
        minSdkVersion(Android.minSdk)
        targetSdkVersion(Android.targetSdk)
        versionCode = Android.versionCode
        versionName = Android.versionName
        multiDexEnabled = true
        applicationId = "com.smallestapp.climbingdiary"
        setProperty("archivesBaseName", "$applicationId-v$versionName($versionCode)")
        resConfigs("ko")
        ndk {
            abiFilters.add("armeabi-v7a")
            abiFilters.add("x86")
            abiFilters.add("arm64-v8a")
            abiFilters.add("x86_64")
        }
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    productFlavors {
        create("alpha") {
            applicationId = "com.smallestapp.climbingdiary.alpha"
        }

        create("production") {
            applicationId = "com.smallestapp.climbingdiary.production"
        }
    }

    buildFeatures {
        dataBinding = true
    }
}


dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.kotlin)
    implementation(Dependencies.appcompat)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.supportDesign)
    implementation(Dependencies.material)

    implementation(Dependencies.timber)

    testImplementation(TestDependencies.junit)
    androidTestImplementation(TestDependencies.junitExt)
    androidTestImplementation(TestDependencies.espressoCore)
}