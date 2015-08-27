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
import com.uimirror.poc.rest.conf.AppConfig;
import com.uimirror.poc.rest.conf.JerssyApplicationInitializer;
import com.uimirror.poc.rest.conf.ServiceBeanInitalizer;
import com.uimirror.poc.rest.dao.SomeDao;
import com.uimirror.poc.rest.service.SomeServiceTest;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.json.JSONException;
import org.junit.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 * {@link SomeResourceTest}
 * @author Jay
 **/
public class SomeResourceTest extends JerseyTest{
    private SomeDao someDao;
    @Override
    protected Application configure() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, ServiceBeanInitalizer.class, SomeServiceTest.DaoMockBeans.class, SomeServiceTest.ExpensiveMockBeans.class);
        final ResourceConfig config = new JerssyApplicationInitializer();
        config.property("contextConfig", context);
        someDao = (SomeDao)context.getBean("someDao");
        return config;
    }

    @Test
    public void testHello() throws JSONException {
        Hello hello = new Hello();
        hello.setMessage("Hello World");
//        when(someDao.findMessage()).thenReturn(new Hello());
        Mockito.when(someDao.findMessage()).thenReturn(hello);
        final String res = target("/").request().accept(MediaType.APPLICATION_JSON).get(String.class);
        String expected = "{ 'message': 'Hello World'}";
        JSONAssert.assertEquals(expected, res, JSONCompareMode.STRICT);
    }

}
