plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
    id("jacoco")
}

jacoco {
    toolVersion = "[0.8.14-SNAPSHOT,)"
}

repositories {
    maven {
        url = uri("https://central.sonatype.com/repository/maven-snapshots/")
        mavenContent {
            snapshotsOnly()
            includeGroup("org.jacoco")
        }
    }
    google()
    mavenCentral()
}

dependencies {
    implementation(compose.desktop.currentOs)
    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(libs.junit.api)
    testRuntimeOnly(libs.junit.engine)
}

composeCompiler {
    includeTraceMarkers = true
    includeSourceInformation = true
}
