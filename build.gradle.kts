plugins {
    application
    kotlin("jvm") version "1.3.41"
}

application {
    mainClassName = "Main"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}