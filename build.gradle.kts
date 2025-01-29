import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile

plugins {
    id("java")
    kotlin("jvm") version ("2.1.0")
    id("fabric-loom") version("1.9-SNAPSHOT")
}

group = "git.dragomordor.cobblemaxer.fabric"
version = "2.0.3+1.21.1"

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://maven.blamejared.com/")
    maven("https://maven.parchmentmc.org")
    maven("https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/")
    maven("https://maven.impactdev.net/repository/development/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    minecraft("net.minecraft:minecraft:${rootProject.property("mc_version")}")
    mappings("net.fabricmc:yarn:1.21.1+build.3:v2")

    modImplementation("net.fabricmc:fabric-loader:0.16.10")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.115.0+1.21.1")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.13.0+kotlin.2.1.0")
    modImplementation("com.cobblemon:fabric:1.6.1+1.21.1")
}

tasks.withType<KotlinJvmCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
        freeCompilerArgs.add("-opt-in=kotlin.RequiresOptIn")
    }
}