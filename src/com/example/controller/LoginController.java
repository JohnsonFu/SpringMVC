package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.example.entity.User;

public class LoginController extends AbstractController {
	//成功与失败字段
	private String successView;
	private String failView;
	
	public String getSuccessView() {
		return successView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	public String getFailView() {
		return failView;
	}

	public void setFailView(String failView) {
		this.failView = failView;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//不应该是这样写，但是这样看起来比较容易理解
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = getUser(username, password);
		//保存相应的参数，通过ModelAndView返回
		Map<String ,Object> model=new HashMap<String,Object>();
		if(user !=null){
			model.put("user", user);
			return new ModelAndView(getSuccessView(),model);
		}else{
			model.put("error", "用户名或密码输入错误！！！");
			return new ModelAndView(getFailView(),model);
		}		
	}
	//为了方便直接写的验证方法
	public User getUser(String username,String password){
		if(username.equals("test") && password.equals("test")){
			return new User(username,password);
		}else{
			return null;
		}
	}
}