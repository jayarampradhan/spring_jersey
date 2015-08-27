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

package com.uimirror.poc.rest.aspect;

import com.uimirror.poc.rest.service.SomeAspectCostlyService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * {@link LoggingAspect}
 * @author Jay
 **/
@Aspect
public class LoggingAspect {

    private static Logger LOG = LoggerFactory.getLogger(LoggingAspect.class);

    @Autowired
    private SomeAspectCostlyService someAspectCostlyService;

    @Before("execution(* com.uimirror.poc.rest.service.SomeService.sayHello(..))")
    public void logBefore(JoinPoint joinPoint) {
        LOG.info("logBefore() is running!");
        LOG.info("hijacked : {}",joinPoint.getSignature().getName());
        someAspectCostlyService.doSomeExpensiveJob();
        LOG.info("******");
    }
}
