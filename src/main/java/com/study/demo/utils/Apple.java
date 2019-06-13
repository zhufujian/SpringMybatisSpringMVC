package com.study.demo.utils;

import java.math.BigDecimal;

/**
 * @author zhu_f  E-mail: zhu_fujian@163.com
 * @version 创建时间：2019年4月26日 下午1:27:27
 * 类说明
 */
public class Apple {

	   private Long id;
	    private String name;
	    private BigDecimal money;
	    private Integer num;
	    public Apple(Long id, String name, BigDecimal money, Integer num) {
	        this.id = id;
	        this.name = name;
	        this.money = money;
	        this.num = num;
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public BigDecimal getMoney() {
			return money;
		}
		public void setMoney(BigDecimal money) {
			this.money = money;
		}
		public Integer getNum() {
			return num;
		}
		public void setNum(Integer num) {
			this.num = num;
		}
}
