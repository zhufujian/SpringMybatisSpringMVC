package com.study.demo.service.transtation;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhu_f  E-mail: zhu_fujian@163.com
 * @version 创建时间：2019年6月13日 下午4:09:34
 * 类说明
 */
public class UserService {

	@Transactional(rollbackFor = Exception.class)
	public void trance() {
	    try {
	        trance1();//调用下一个事务方法。
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void trance1() throws Exception{
	   
	    throw new RuntimeException();
	}
}
