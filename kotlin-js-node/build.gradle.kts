plugins {
    kotlin("js") version "1.4.0"
}
group = "me.florian"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
}
dependencies {
    testImplementation(kotlin("test-js"))
    implementation("com.github.fwilhe.inzell:Inzell-js:0.1.0-SNAPSHOT")
}
kotlin {
    js(IR) {
        nodejs()
        binaries.executable()
    }
}