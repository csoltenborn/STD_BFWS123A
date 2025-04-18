plugins {
    id("java")
}

group = "de.fhdw.std"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.26.0")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}