package com.study.demo.service.transtation;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhu_f  E-mail: zhu_fujian@163.com
 * @version 创建时间：2019年6月13日 下午4:10:29
 * 类说明
 */
@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    private UserService userService;

    @org.junit.Test
    public void trance(){
        userService.trance();
    }
}