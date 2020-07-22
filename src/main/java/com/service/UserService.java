package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Depar;
import com.pojo.User;

/**
 * user类service层接口
 * @author Yu rongxing
 *
 */
public interface UserService {

	/**
	 * 查询全部信息
	 * @return
	 */
	public List<Depar> finduser();
	
	/**
	 * 模糊查询
	 * @param depar_id
	 * @param name
	 * @return
	 */
	List<Depar> findMohu(@Param("name")String name,@Param("depar_id")int depar_id);
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 */
	public int deluser(int id);
	
	/**
	 * 添加一条数据
	 * @param user
	 * @return
	 */
	public int adduser(User user);
	
	/**
	 * 数据回显
	 * @param id
	 * @return
	 */
	public User findid(int id);
	
	/**
	 * 查询部门
	 * @return
	 */
	public List<Depar> finddep();
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
}
