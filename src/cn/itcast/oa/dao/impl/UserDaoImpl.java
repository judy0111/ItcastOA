package cn.itcast.oa.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.oa.base.BaseDaoImpl;
import cn.itcast.oa.dao.UserDao;
import cn.itcast.oa.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	public void sayChanged(){
	System.out.println("here has been changed!!!");
	}
	// public UserDaoImpl(){
	// clazz = User.class;
	// }
}
