package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Role;

public interface RoleService {

	/**
	 * 查询所有岗位
	 * 
	 * @return
	 */
	List<Role> findAll();

	/**
	 * 删除一个岗位信息
	 * 
	 * @param id
	 */
	void delete(Long id);

	void save(Role role);

	Role getById(Long id);

	void update(Role role);

}
