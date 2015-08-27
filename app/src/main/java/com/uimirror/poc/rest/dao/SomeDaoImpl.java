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

package com.uimirror.poc.rest.dao;

import com.uimirror.poc.rest.bean.Hello;

/**
 * {@link SomeDaoImpl}
 * @author Jay
 **/
public class SomeDaoImpl implements SomeDao{

    @Override
    public Hello findMessage () {
        Hello hello = new Hello();
        hello.setMessage("Hello Boy!!!");
        return hello;
    }
}
