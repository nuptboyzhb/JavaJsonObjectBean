/*
 * $filename: TestMain.java,v $
 * $Date: 2013-11-28  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package edu.njupt.zhb;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-11-28  Nanjing,njupt,China
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanModel saveBeanModel = getInitBean();
		String clazzType = saveBeanModel.getClass().getName();
		String jsonString = JSONObject.fromObject(saveBeanModel).toString();
		printObject(saveBeanModel);//先打印一下看看
		////////////////我们可以通过clazzType和jsonString，在程序中重新生成saveBeanModel对象
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		try {
			Object object = JSONObject.toBean(jsonObject, Class.forName(clazzType));
			/////////////////////此时的object就是我们由clazzType和jsonString两个属性恢复出的对象
			printObject(object);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static BeanModel getInitBean(){
		List<BeanModel> list = new ArrayList<BeanModel>();
		for(int i = 0;i<10;i++){
			BeanModel beanModel = new BeanModel();
			beanModel.setDate(new java.util.Date());
			beanModel.setId(i);
			beanModel.setName("name"+i);
		}
		BeanModel saveBeanModel = new BeanModel();
		saveBeanModel.setId(11);
		saveBeanModel.setDate(new java.util.Date());
		saveBeanModel.setName("saveBean");
		saveBeanModel.setList(list);
		return saveBeanModel;
	}
	public static void printObject(Object object){
		String result = JSONObject.fromObject(object).toString();
		System.out.println("结果："+result);
	}

}
