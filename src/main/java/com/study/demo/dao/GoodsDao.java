package com.study.demo.dao;

import com.study.demo.dto.Goods;

public interface GoodsDao {

	Goods getGoodByPrimaryKey(int goodId);
	
}
