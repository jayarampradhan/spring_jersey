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

import com.uimirror.poc.rest.bean.Hello;
import com.uimirror.poc.rest.dao.SomeDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * {@link SomeServiceImpl}
 * @author Jay
 **/
public class SomeServiceImpl implements SomeService{

    @Autowired
    private SomeDao someDao;

    @Override
    public Hello sayHello () {
        return someDao.findMessage();
    }
}
