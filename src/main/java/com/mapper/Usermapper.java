package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Depar;
import com.pojo.User;

/**
 * 用户信息dao层接口
 * @author Yu rongxing
 *
 */
public interface Usermapper {

	/**
	 * 查询全部信息
	 * @return
	 */
	public List<Depar> findUser();
	/**
	 * 模糊查询
	 * @param depar_id
	 * @param name
	 * @return
	 */
	List<Depar> findMohu(@Param("name")String name,@Param("depar_id")int depar_id);
	
	/**
	 * 删除一条信息
	 * @param id
	 * @return
	 */
	public int deluser(@Param("id")int id);
	
	/**
	 * 添加一条信息
	 * @param user
	 * @return
	 */
	public int adduser(User user);
	
	/**
	 * 数据回显
	 */
	public User findid(@Param("id")int id);
	
	/**
	 * 查询部门
	 * @return
	 */
	public List<Depar> finddep();
	
	/**
	 * 根据id修改用户
	 * @param id
	 * @return
	 */
	public int updateUser(User user);
}
