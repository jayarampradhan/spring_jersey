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

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * {@link BeanInitalizer}
 * @author Jay
 **/
@Configuration
@Import({ServiceBeanInitalizer.class, DaoBeanInitalizer.class, ExpensiveServiceBeanInitalizer.class})
public class BeanInitalizer {

}
