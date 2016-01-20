/*
 * Copyright 2016 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.dingwang.jbpm.util;

import javax.annotation.Resource;

import org.jbpm.api.ProcessEngine;
import org.jbpm.api.RepositoryService;

/**
 * 类JBPMUtil.java的实现描述：TODO 类实现描述
 * 
 * @author wangding_91@163.com 2016年1月20日 上午11:48:53
 */
public class JBPMUtil {

    @Resource
    private ProcessEngine processEngine;

    public void deployProcess(String processXml) {
        RepositoryService rs = processEngine.getRepositoryService();
        rs.createDeployment().addResourceFromClasspath(processXml).deploy();
    }

}
