plugins {
    `java-library`
}

dependencies {
    api(libs.bundles.logging)
    testImplementation(project(":base-testing"))
}