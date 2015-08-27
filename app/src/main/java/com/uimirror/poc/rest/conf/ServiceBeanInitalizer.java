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

import com.uimirror.poc.rest.aspect.LoggingAspect;
import com.uimirror.poc.rest.service.SomeService;
import com.uimirror.poc.rest.service.SomeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link ServiceBeanInitalizer}
 * @author Jay
 **/
@Configuration
public class ServiceBeanInitalizer {

    @Bean
    public SomeService someService(){
        return new SomeServiceImpl();
    }

    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }

}
