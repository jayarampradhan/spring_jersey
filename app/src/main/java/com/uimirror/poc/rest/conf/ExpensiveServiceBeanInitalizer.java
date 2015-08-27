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

import com.uimirror.poc.rest.service.SomeAspectCostlyService;
import com.uimirror.poc.rest.service.SomeAspectCostlyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link ExpensiveServiceBeanInitalizer}
 * @author Jay
 **/
@Configuration
public class ExpensiveServiceBeanInitalizer {

    @Bean
    public SomeAspectCostlyService someAspectCostlyService(){
        return new SomeAspectCostlyServiceImpl();
    }

}
