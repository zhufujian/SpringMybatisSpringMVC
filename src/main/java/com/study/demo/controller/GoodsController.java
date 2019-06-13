package com.study.demo.controller;

import io.swagger.annotations.Api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.demo.dao.GoodsDao;
import com.study.demo.dto.Goods;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsDao goodsDao;
	
	@RequestMapping("/good")
	public String getGood(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		int id = Integer.valueOf(request.getParameter("id"));
		
		Goods goods = goodsDao.getGoodByPrimaryKey(id);
		modelAndView.addObject("good", goods);
		return "success";
	}

}
