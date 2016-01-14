/*
 * Copyright 2016 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.dingwang.bean;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dingwang.dao.PolicyDTOMapper;
import com.dingwang.model.PolicyDTO;

/**
 * 类SqlBean.java的实现描述：TODO 类实现描述
 * 
 * @author wangding_91@163.com 2016年1月14日 下午5:43:35
 */
public class SqlBean {
    private static final Logger log = LoggerFactory.getLogger(SqlBean.class);

    @Resource
    private PolicyDTOMapper     policyDAO;

    private Runnable            runner;

    public void init() {
        runner = new Runnable() {

            public void run() {
                while (true) {
                    PolicyDTO dto = new PolicyDTO();
                    dto = SqlBean.this.policyDAO.selectByPrimaryKey(5l);
                    log.info(dto.toString());
                    try {
                        Thread.sleep(2 * 1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };

        log.info("---------------start  SqlBean-------------");

        Thread t = new Thread(runner);
        t.start();

    }

}
