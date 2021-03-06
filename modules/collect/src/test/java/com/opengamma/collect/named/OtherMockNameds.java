/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.collect.named;

/**
 * Mock named object.
 */
class OtherMockNameds implements MockNamed {

  public static final OtherMockNameds OTHER = new OtherMockNameds();

  @Override
  public String getName() {
    return "Other";
  }

}
