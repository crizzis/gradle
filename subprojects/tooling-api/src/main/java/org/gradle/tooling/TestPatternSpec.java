/*
 * Copyright 2022 the original author or authors.
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

package org.gradle.tooling;

import org.gradle.api.Incubating;

/**
 * Specifies a test pattern.
 *
 * @since 7.5
 */
@Incubating
public interface TestPatternSpec {
    // TODO I think using a collection instead a vararg would be more beneficial here as clients are IDE plugins and they will want to pass a collection in all cases
    TestPatternSpec includePackage(String pkg);
    TestPatternSpec includePackages(String... packages);
    TestPatternSpec includeClass(String clazz);
    TestPatternSpec includeClasses(String... classes);
    TestPatternSpec includeMethod(String clazz, String method);
    TestPatternSpec includeMethods(String clazz, String... methods);
    TestPatternSpec include(String pattern); // TODO includePattern() is more consistent
    TestPatternSpec include(String... pattern);
}
