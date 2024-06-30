import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("xyz.jpenilla.run-paper") version "2.3.0"
    id("io.github.goooler.shadow") version "8.1.7"
    kotlin("jvm") version "2.0.0"
}

group = "studio.genbu.mc"
version = "0.1.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.runServer {
    minecraftVersion("1.21")
}

tasks.compileKotlin {}

tasks.shadowJar {
    mergeServiceFiles()
    minimize {
        exclude(dependency("org.jetbrains.kotlin:.*"))
    }
}

kotlin {
    jvmToolchain(21)
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}
