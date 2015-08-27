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
import com.uimirror.poc.rest.dao.SomeDaoImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * {@link SomeServiceTest}
 * @author Jay
 **/
//@ContextConfiguration(classes = { AppConfig.class, ServiceBeanInitalizer.class, SomeServiceTest.DaoMockBeans.class, SomeServiceTest.ExpensiveMockBeans.class})
@RunWith(MockitoJUnitRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
public class SomeServiceTest {

    @InjectMocks
    @Autowired
    private SomeServiceImpl someService;

//    @Autowired
//    private SomeService someService;

//    @Autowired
//    private SomeDao someDao;

    @Mock
    private SomeDao someDao;

    @Mock
    private SomeAspectCostlyService someAspectCostlyService;

    @Before
    public void setUp() {
        //MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testSayHello () {
        //Do you know you can rely on existing app conext and inject mock ??
        //Do you know you can inject mock which is relevant to you only...to make run test much faster ??
        // specify mock behave when method called
        when(someDao.findMessage()).thenReturn(new Hello());

        assertThat(someService).isNotNull();
        assertThat(someService.sayHello().getMessage()).isEqualTo(new Hello().getMessage());
    }

    @Configuration
    public static class DaoMockBeans{

        @Bean
        public SomeDao someDao(){
            return Mockito.mock(SomeDaoImpl.class);
        }

    }
    @Configuration
    public static class ExpensiveMockBeans{

        @Bean
        public SomeAspectCostlyService someAspectCostlyService(){
            return Mockito.mock(SomeAspectCostlyServiceImpl.class);
        }

    }

}
