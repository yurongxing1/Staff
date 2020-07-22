package com.pojo;

import java.util.List;

/**
 * user表实体类
 * @author Yu rongxing
 *
 */
public class User {

	private Integer id;
	private String name;
	private String sex;
	private Integer depar_id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getDepar_id() {
		return depar_id;
	}
	public void setDepar_id(Integer depar_id) {
		this.depar_id = depar_id;
	}
}
