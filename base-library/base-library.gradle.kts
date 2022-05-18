plugins {
    `java-library`
    `groovy`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

dependencies {
    api(libs.bundles.logging)
    testImplementation(project(":base-testing"))
}