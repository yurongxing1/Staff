package com.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.Usermapper;
import com.pojo.Depar;
import com.pojo.User;
import com.service.UserService;

@Transactional
@Service("userservice")
public class UserServiceImpl implements UserService {

	@Autowired
	private Usermapper usermapper;
	
	public Usermapper getUsermapper() {
		return usermapper;
	}

	public void setUsermapper(Usermapper usermapper) {
		this.usermapper = usermapper;
	}

	//查询全部
	@Override
	public List<Depar> finduser() {
		return usermapper.findUser();
	}

	//模糊查询
	@Override
	public List<Depar> findMohu(String name,int depar_id) {
		return usermapper.findMohu(name, depar_id);
	}

	//删除信息
	@Override
	public int deluser(int id) {
		return usermapper.deluser(id);
	}

	//添加数据
	@Override
	public int adduser(User user) {
		return usermapper.adduser(user);
	}

	//数据回显
	@Override
	public User findid(int id) {
		return usermapper.findid(id);
	}

	//查询部门
	@Override
	public List<Depar> finddep() {
		return usermapper.finddep();
	}

	//修改用户信息
	@Override
	public int updateUser(User user) {
		return usermapper.updateUser(user);
	}

}
