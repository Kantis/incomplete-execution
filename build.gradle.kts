plugins {
    kotlin("jvm") version "1.5.30"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(Testing.junit.api)
    testImplementation(Testing.junit.engine)
    testImplementation(Testing.Kotest.runner.junit5)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
