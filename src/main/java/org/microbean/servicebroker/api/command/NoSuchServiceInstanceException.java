/* -*- mode: Java; c-basic-offset: 2; indent-tabs-mode: nil; coding: utf-8-unix -*-
 *
 * Copyright © 2017 MicroBean.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.microbean.servicebroker.api.command;

import java.util.Objects;

import org.microbean.servicebroker.api.ServiceBrokerException;

public class NoSuchServiceInstanceException extends ServiceBrokerException {

  private static final long serialVersionUID = 1L;

  private final AbstractResponse response;

  public NoSuchServiceInstanceException(final String message, final Throwable cause) {
    this(message, cause, null);
  }
  
  public NoSuchServiceInstanceException(final String message, final Throwable cause, final AbstractResponse response) {
    super(message, cause);
    this.response = response;
  }

  public final AbstractResponse getResponse() {
    return this.response;
  }
  
}
