package com.study.demo.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author zhu_f  E-mail: zhu_fujian@163.com
 * @version 创建时间：2019年4月26日 下午1:27:04
 * 类说明
 */
public class Test {

public static void main(String[] args) {
	
	List<Apple> appleList = new ArrayList<>();//存放apple对象集合
	 
/*	Apple apple1 =  new Apple(1,"苹果1",new BigDecimal("3.25"),10);
	Apple apple12 = new Apple(1,"苹果2",new BigDecimal("1.35"),20);
	Apple apple2 =  new Apple(2,"香蕉",new BigDecimal("2.89"),30);
	Apple apple3 =  new Apple(3,"荔枝",new BigDecimal("9.99"),40);
	 
	appleList.add(apple1);
	appleList.add(apple12);
	appleList.add(apple2);
	appleList.add(apple3);
	// 根据id去重
    List<Apple> unique = appleList.stream().collect(
    		Collectors.collectingAndThen(
            		   Collectors.toCollection(() -> new TreeSet<>(Comparator.comparingLong(Apple::getId))), ArrayList::new)
       );*/
}

}
