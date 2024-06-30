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
    compileOnly("dev.folia:folia-api:1.20.6-R0.1-SNAPSHOT")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.runServer {
    minecraftVersion("1.20.6")
}

runPaper.folia.registerTask()

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
