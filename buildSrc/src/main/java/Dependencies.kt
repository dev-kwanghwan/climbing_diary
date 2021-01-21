object Android {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Version {
    const val gradle = "4.1.1"
    const val kotlin = "1.4.21"
    const val appcompat = "1.2.0"
    const val timber = "4.7.1"
    const val constraintLayout = "2.0.4"
    const val supportDesign = "28.0.0"
    const val material = "1.2.1"
}

object TestVersion {
    const val junit = "4.13.1"
    const val junitExt = "1.1.2"
    const val espressoCore = "3.3.0"
}

object Dependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val timber = "com.jakewharton.timber:timber:${Version.timber}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val supportDesign = "com.android.support:design:${Version.supportDesign}"
    const val material = "com.google.android.material:material:${Version.material}"
}

object TestDependencies {
    const val junit = "junit:junit:${TestVersion.junit}"
    const val junitExt = "androidx.test.ext:junit:${TestVersion.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${TestVersion.espressoCore}"
}
