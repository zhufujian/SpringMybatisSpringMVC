package com.study.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.demo.dao.GoodsDao;
import com.study.demo.dto.Goods;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
		GoodsDao goodsDao =  (GoodsDao) context.getBean("goodsDao");
		Goods goods = goodsDao.getGoodByPrimaryKey(1000);
		System.out.println(goods);
		
		
	}

}
