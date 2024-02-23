plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.sliderview.view.pagginationheadquat"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sliderview.view.pagginationheadquat"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures{
        viewBinding = true
    }
    buildFeatures{
        dataBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



    kapt ("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0")
    //1)  Dagger 2
    implementation ("com.google.dagger:dagger-android:2.22")
    implementation("com.google.dagger:dagger-android-support:2.22")
    kapt("com.google.dagger:dagger-android-processor:2.22")
    kapt ("com.google.dagger:dagger-compiler:2.22")

    //2)  ViewModel
    val lifecycle_version = "2.6.0-alpha01"
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    implementation ("androidx.core:core-ktx:1.12.0")

    //3)   Retrofit,rxjava and Okhttp
    val retrofit_version = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.4.0")

    //5) Coroutines
    val coroutines_version  = "1.6.0"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version")



    //    6) Recyclerview And Card view
    implementation("androidx.recyclerview:recyclerview:1.2.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")


    //7)Glide
    implementation("com.github.bumptech.glide:glide:4.13.2")


    //8)android support library
    implementation("com.android.support:appcompat-v7:23.0.0")
    //noinspection GradleCompatible
    implementation("com.android.support:design:28.0.0")


    //9)Okhttp,Okhttp logging interceptor
    implementation("com.squareup.okhttp3:logging-interceptor:3.9.1")

    //10) Navigation Component
    val nav_version = "2.7.6"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    //11) intuit (For resize your view)
    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("com.intuit.ssp:ssp-android:1.0.6")

    //12) gif (animation)
    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.17")
}