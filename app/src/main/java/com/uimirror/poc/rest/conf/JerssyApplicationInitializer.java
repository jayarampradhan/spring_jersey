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

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.filter.UriConnegFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link JerssyApplicationInitializer}
 * @author Jay
 **/
public class JerssyApplicationInitializer extends ResourceConfig {

    protected static final Logger LOG = LoggerFactory.getLogger(JerssyApplicationInitializer.class);


    public JerssyApplicationInitializer(){
        // Register resources and providers using package-scanning.
        packages(true, "com.uimirror.poc.rest.endpoint");
        //Gson Converter
        register(JacksonJsonProvider.class);
        //Swagger Configuration
        register(ApiListingResource.class);
        register(SwaggerSerializers.class);
        register(UriConnegFilter.class);

        //Custom filters
        //register(PreMatchingVersionFilter.class);
//        register(PatchingInterceptor.class);
//        register(OptionsAcceptHeader.class);
//        register(UimCORSFilter.class);

        property(ServerProperties.LANGUAGE_MAPPINGS, "english : en");
        property(ServerProperties.APPLICATION_NAME, "jersey Sample");
        // Register an instance of LoggingFilter.
        register(new LoggingFilter());
        // Enable Tracing support.
        property(ServerProperties.TRACING, "ALL");
//        property(ServerProperties.TRACING, "ALL");
    }
}
