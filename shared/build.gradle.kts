plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.compose)
}

dependencies {
    implementation(compose.runtime)
    implementation(compose.foundation)
    implementation(compose.material3)
    implementation(compose.ui)
    implementation(compose.components.resources)
}