plugins {
    application
    kotlin("jvm") version "1.3.21"
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