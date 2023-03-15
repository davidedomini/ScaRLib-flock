plugins {
    id("java")
    scala
}

group = "io.github.davidedomini"
version = "1.0.0"

repositories {
    mavenCentral()
}

scala {
    zincVersion.set("1.6.1")
}


sourceSets {
    main {
        scala {
            setSrcDirs(listOf("src/main/scala"))
        }
    }
    test {
        scala {
            setSrcDirs(listOf("src/test/scala"))
        }
    }
}

dependencies {
    //implementation("org.scala-lang:scala3-library_3:3.2.2")
    implementation("org.scala-lang:scala-library:2.13.10")
    implementation("io.github.davidedomini:scarlib-core:1.6.0")
    implementation("io.github.davidedomini:alchemist-scafi:1.6.0")
    implementation("it.unibo.alchemist:alchemist:25.7.1")
    implementation("it.unibo.alchemist:alchemist-incarnation-scafi:25.7.1")
    //implementation("io.github.davidedomini:dsl-core:1.5.0")

}
