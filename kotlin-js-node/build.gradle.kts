plugins {
    kotlin("js") version "1.4.0"
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
    implementation("com.github.fwilhe.inzell:Inzell-js")
}
kotlin {
    js(IR) {
        nodejs()
        binaries.executable()
    }
}