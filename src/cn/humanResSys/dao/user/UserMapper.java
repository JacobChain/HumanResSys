package cn.humanResSys.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import cn.humanResSys.pojo.User;

@Component("userMapper")
public interface UserMapper {
	public List<User> getUserList(@Param("username")String userName,
	@Param("roleid")long roleId,@Param("departmentid")long departmentId,
	@Param("pageIndex")int pageIndex,@Param("pageSize")int pageSize);
	
	public int getTotalCount(@Param("username")String userName,
	@Param("roleid")long roleId,@Param("departmentid")long departmentId);
	
	public int addUser(User user);
	
	public int modifyUser(User user);
	
	public int delUser(@Param("id")long id);
	
	public User getUserByCode(@Param("usercode")String userCode);
	

}
