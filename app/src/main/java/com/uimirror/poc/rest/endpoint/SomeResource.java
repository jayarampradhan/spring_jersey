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

package com.uimirror.poc.rest.endpoint;
import com.uimirror.poc.rest.bean.Hello;
import com.uimirror.poc.rest.service.SomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

/**
 * {@link SomeResource}
 * @author Jay
 **/
@Path("/")
@Singleton
@Produces({ APPLICATION_JSON,  APPLICATION_XML})
@Consumes({  APPLICATION_XML, APPLICATION_JSON})
@Api(value = "/", description = "Some Sample Resource")
public class SomeResource {

    private static Logger LOG = LoggerFactory.getLogger(SomeResource.class);

    @Autowired
    private SomeService someService;

    @GET
    @ApiOperation(value = "Hello Resource.", response = Hello.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "If Some Test Hello. ")
    })
    public Hello sayHello(){
        return someService.sayHello();
    }

}
