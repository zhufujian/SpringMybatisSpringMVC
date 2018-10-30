package com.study.demo.service;

import org.springframework.stereotype.Service;

import com.study.demo.dto.Goods;

@Service
public interface GoodsService {

	Goods getGood(int goodId);
}
