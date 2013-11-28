/*
 * $filename: BeanModel.java,v $
 * $Date: 2013-11-28  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package edu.njupt.zhb;

import java.util.Date;
import java.util.List;

/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-11-28  Nanjing,njupt,China
 */
public class BeanModel {
	private Integer id;
	private Date date;
	private String name;
	private List<BeanModel> list;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BeanModel> getList() {
		return list;
	}
	public void setList(List<BeanModel> list) {
		this.list = list;
	}
}
