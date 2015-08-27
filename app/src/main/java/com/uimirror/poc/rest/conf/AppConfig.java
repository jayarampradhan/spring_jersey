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

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * {@link AppConfig}
 * @author Jay
 **/
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:application-${env:dev}.properties")
public class AppConfig {

    /**
     * Property Bean Creation
     * @return PropertySourcesPlaceholderConfigurer
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
