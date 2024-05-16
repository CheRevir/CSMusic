
pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/nexus/content/repositories/gradle-plugin")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://maven.aliyun.com/repository/public/")
        google()
        mavenCentral()
    }
}

rootProject.name = "CSMusic"
include(":app")
include(":core:base")
include(":feature:login")
