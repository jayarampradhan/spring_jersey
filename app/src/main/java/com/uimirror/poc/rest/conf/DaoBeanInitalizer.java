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

package com.uimirror.poc.rest.conf;

import com.uimirror.poc.rest.dao.SomeDao;
import com.uimirror.poc.rest.dao.SomeDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link DaoBeanInitalizer}
 * @author Jay
 **/
@Configuration
public class DaoBeanInitalizer {

    @Bean
    public SomeDao someDao(){
        return new SomeDaoImpl();
    }
}
