/*
 * Copyright 2016 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.dingwang.spring.parser;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * 类ProcessBeanDefinitionParser.java的实现描述：TODO 类实现描述
 * 
 * @author wangding_91@163.com 2016年2月2日 下午6:00:29
 */
public class ProcessBeanDefinitionParser implements BeanDefinitionParser {

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.beans.factory.xml.BeanDefinitionParser#parse(org.w3c.
     * dom.Element, org.springframework.beans.factory.xml.ParserContext)
     */
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        System.out.println(element.getAttribute("process"));
        return null;
    }

}
