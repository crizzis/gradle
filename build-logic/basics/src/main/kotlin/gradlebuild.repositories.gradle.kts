/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

repositories {
    maven {
        name = "Gradle public repository"
        url = uri("https://repo.gradle.org/gradle/public")
        content {
            includeGroup("net.rubygrapefruit")
            includeModule("classycle", "classycle")
            includeModule("flot", "flot")
            includeModule("org.gradle", "gradle-tooling-api")
            includeModuleByRegex("org.gradle", "docs-asciidoctor-extensions(-base)?")
        }
    }
    google {
        content {
            includeGroup("com.android.databinding")
            includeGroupByRegex("com\\.android\\.tools(\\.[a-z.\\-]*)?")
        }
    }
    maven {
        name = "CHAMP libs"
        url = uri("https://releases.usethesource.io/maven/")
        mavenContent {
            includeGroup("io.usethesource")
        }
    }
    maven {
        name = "Kotlin EAP repository"
        url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap/")
        content {
            includeVersionByRegex("org.jetbrains.kotlin", "kotlin-.*", "1.7.0-dev-1904")
        }
    }
    mavenCentral()
}
