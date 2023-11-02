
plugins {
    `maven-publish`
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    add("implementation", platform(libs.findLibrary("androidx.compose.bom").get()))
    add("implementation", libs.findLibrary("androidx.compose.ui").get())
    add("implementation", libs.findLibrary("androidx.compose.material3").get())
    add("implementation", libs.findLibrary("androidx.annotation").get())
    add("testImplementation", libs.findLibrary("junit").get())
    add("androidTestImplementation", libs.findLibrary("androidx.junit").get())
    add("androidTestImplementation", libs.findLibrary("androidx.espresso.core").get())
//    add("implementation", platform(libs.androidx.compose.bom))
//    add("implementation", libs.androidx.compose.ui)
//    add("implementation", libs.androidx.compose.material3)
//    add("implementation", libs.androidx.annotation)
//    add("testImplementation", libs.junit)
//    add("androidTestImplementation", libs.androidx.junit)
//    add("androidTestImplementation", libs.androidx.espresso.core)
}
