package cn.humanResSys.service.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.humanResSys.dao.user.UserMapper;
import cn.humanResSys.pojo.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public List<User> getUserList(String userName, long roleId,
			long departmentId, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return userMapper.getUserList(userName, roleId, departmentId, (pageIndex-1)*pageSize, pageSize);
	}

	@Override
	public int getTotalCount(String userName, long roleId, long departmentId) {
		// TODO Auto-generated method stub
		return userMapper.getTotalCount(userName, roleId, departmentId);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

	@Override
	public int modifyUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.modifyUser(user);
	}

	@Override
	public int delUser(long id) {
		// TODO Auto-generated method stub
		return userMapper.delUser(id);
	}

	@Override
	public boolean login(String userCode, String userPassword) {
		User user = userMapper.getUserByCode(userCode);
		System.out.println("user================="+userCode+userPassword);
		System.out.println("user2================"+user.getUsername()+user.getUsercode());
		boolean flag=false;
		if(user!=null&&user.getUserpassword().equals(userPassword)){
			flag=true;
		}
		 return flag;
	}

	
	

	


}
