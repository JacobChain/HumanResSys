package cn.humanResSys.service.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.humanResSys.pojo.User;
  

public interface UserService {  
	
	public List<User> getUserList(String userName,long roleId,long departmentId,
	int pageIndex,int pageSize);
	
	public int getTotalCount(String userName,long roleId,long departmentId);
	
	public int addUser(User user);
	
	public int modifyUser(User user);
	
	public int delUser(long id);
	
	public boolean login(String userCode,String userPassword);
}
