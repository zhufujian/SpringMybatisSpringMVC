package com.study.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.demo.dao.GoodsDao;
import com.study.demo.dto.Goods;
import com.study.demo.service.GoodsService;

public class GoodServiceImpl implements GoodsService{
	
	@Autowired
	GoodsDao goodsDao;

	@Override
	public Goods getGood(int goodId) {
		Goods goods = goodsDao.getGoodByPrimaryKey(goodId);
		return goods;
	}

}
