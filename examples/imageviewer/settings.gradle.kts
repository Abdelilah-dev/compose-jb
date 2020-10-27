buildscript {
    repositories {
        google()
        jcenter()
        mavenLocal().mavenContent {
            includeModule("org.jetbrains.compose", "compose-desktop-application-gradle-plugin")
        }
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    dependencies {
        classpath("org.jetbrains.compose:compose-gradle-plugin:0.1.0-dev97")
        classpath("org.jetbrains.compose:compose-desktop-application-gradle-plugin:0.1.0-SNAPSHOT")
        classpath("com.android.tools.build:gradle:4.0.1")
        classpath(kotlin("gradle-plugin", version = "1.4.0"))
    }
}

include(":common", ":android", ":desktop")
