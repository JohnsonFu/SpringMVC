package com.example.controller.Impl;

import com.example.controller.IDao;

public class DaoImpl implements IDao {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "晚上好"+name;
	}

}
