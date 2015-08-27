/*******************************************************************************
 * Copyright (c) 2015 Uimirror.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Uimirror license
 * which accompanies this distribution, and is available at
 * http://www.uimirror.com/legal
 * <p>
 * Contributors: Jay
 * Uimirror Team
 *******************************************************************************/

package com.uimirror.poc.rest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link SomeAspectCostlyServiceImpl}
 * @author Jay
 **/
public class SomeAspectCostlyServiceImpl implements SomeAspectCostlyService{
    private static final Logger LOG = LoggerFactory.getLogger(SomeAspectCostlyServiceImpl.class);

    @Override
    public void doSomeExpensiveJob () {
        LOG.info("I am happy to be Expensive!!! Sad I will be mocked always :) ");
    }
}
