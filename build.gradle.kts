plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation(platform("io.cucumber:cucumber-bom:7.18.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.26.0")
    testImplementation("io.cucumber:cucumber-java")
    testImplementation("io.cucumber:cucumber-junit-platform-engine")
    testImplementation("org.junit.platform:junit-platform-suite")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.21.0")
    testImplementation("org.seleniumhq.selenium:selenium-chrome-driver:4.21.0")
    testImplementation("org.seleniumhq.selenium:selenium-devtools-v125:4.21.0")
}

tasks.test {
    useJUnitPlatform()
}