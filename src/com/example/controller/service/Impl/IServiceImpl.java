package com.example.controller.service.Impl;

import com.example.controller.IDao;
import com.example.controller.service.IService;

public class IServiceImpl implements IService {
private IDao dao;
	@Override
	public void service(String name) {
		// TODO Auto-generated method stub
		System.out.println(dao.sayHello(name));
	}
	public IDao getDao() {
		return dao;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
