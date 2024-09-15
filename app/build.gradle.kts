apply(from="./app-properties.kts")

plugins {
    alias(libs.plugins.android.application) 
    alias(libs.plugins.org.jetbrains.kotlin.android) 
    alias(libs.plugins.compose.compiler) 
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation("androidx.appcompat:appcompat:1.6.1")
}

// dependencies {
//     implementation("androidx.core:core-ktx:1.9.0")
//     implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
//     implementation("androidx.activity:activity-compose:1.8.0")
//     implementation("androidx.compose.ui:ui")
//     implementation("androidx.compose.ui:ui-graphics")
//     implementation("androidx.compose.ui:ui-tooling-preview")
//     implementation("androidx.appcompat:appcompat:1.6.1")
//     implementation("androidx.compose.material3:material3:1.1.2")

//     implementation("com.google.accompanist:accompanist-flowlayout:0.26.2-beta")

//     implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
// }

android {
     buildTypes {
        getByName("release") {
            isMinifyEnabled = true // Enables code shrinking for the release build type.
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
        }
    }
    
    buildFeatures {
        compose = true
    }
}
