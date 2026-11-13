pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    // Declare plugin versions centrally so versionless plugin IDs can resolve
    // whether the repository has a root build file or a nested app module.
    plugins {
        id("com.android.application") version "8.7.3"
        id("org.jetbrains.kotlin.android") version "2.0.21"
        id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StreamBox"
include(":app")
