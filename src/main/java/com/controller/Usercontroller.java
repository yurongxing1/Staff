package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Depar;
import com.pojo.User;
import com.service.UserService;

@Controller
public class Usercontroller {

	@Resource
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	//查询全部
	@RequestMapping("/all")
	public String findUser(Model model) {
		List<Depar> list = service.finduser();
		model.addAttribute("list",list);
		return "homepage";
	}
	
	//模糊查询
	@RequestMapping("/mohu")
	public String findMohu(String name,Integer depar_id,Model model) {
		List<Depar> list = service.findMohu(name, depar_id);
		model.addAttribute("list",list);
		return"homepage";
	}
	
	//删除数据
	@RequestMapping("del")
	public void deluser(int id,HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int row = service.deluser(id);
		boolean result;
		if(row>0) {
			result = true;
		}else {
			result = false;
		}
		out.print(result);
	}
	
	//跳转添加页面
	@RequestMapping("/add")
	public String add() {
		return"adduser";
	}
	
	//添加数据
	@RequestMapping("/adduser")
	public void adduser(User user,HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int row = service.adduser(user);
		boolean result;
		if(row>0) {
			result = true;
		}else {
			result = false;
		}
		out.print(result);
	}
	
	//回显信息
	@RequestMapping("/findid")
	public String findid(int id,Model model) {
		User user = new User();
		user = service.findid(id);
		List<Depar> list = service.finddep();
		model.addAttribute("list", list);
		model.addAttribute("user", user);
		return "update";
	}
	
	//修改信息
	@RequestMapping("/update")
	public void update(User user,HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		System.out.println("=================================="+user.getSex());
		int row = service.updateUser(user);
		boolean result;
		if(row>0) {
			result = true;
		}else {
			result = false;
		}
		out.print(result);
	}
}
