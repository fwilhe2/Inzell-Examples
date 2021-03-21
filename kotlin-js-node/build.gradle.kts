plugins {
    kotlin("js") version "1.4.31"
}
group = "me.florian"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
    maven(url = "https://kotlin.bintray.com/kotlinx")
}
dependencies {
    testImplementation(kotlin("test-js"))
    implementation("com.github.fwilhe.inzell:inzell-js:0.0.3.norelease")
}
kotlin {
    js(IR) {
        nodejs()
        binaries.executable()
    }
}