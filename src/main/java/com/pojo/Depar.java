package com.pojo;

import java.util.List;

/**
 * depar实体类

 * @author Yu rongxing
 *
 */
public class Depar {

	private Integer id;
	private String company;
	private List<User> userList;
	public List<User> getUserlist() {
		return userList;
	}
	public void setUserlist(List<User> userlist) {
		this.userList = userlist;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
