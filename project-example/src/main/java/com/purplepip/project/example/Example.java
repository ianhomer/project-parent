/*
 * Copyright (c) 2017 the original author or authors. All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.purplepip.project.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Example {
  private String name;
  private String systemProperty;

  public static void main(String[] args)  {
    new Example("main").run();
  }

  /**
   * Instantiate an Example object.
   *
   * @param name name of example object
   */
  public Example(String name) {
    LOG.debug("Creating validation");
    this.name = name;
    systemProperty = System.getProperty("example.property", "not-set");
  }

  public String getName() {
    return name;
  }

  public String getSystemProperty() {
    return systemProperty;
  }

  void run() {
    LOG.info("Example run : {}", name);
    LOG.debug("Example system property : {}", systemProperty);
    LOG.trace("Trace message");
  }
}
