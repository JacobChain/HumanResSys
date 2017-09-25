package cn.humanResSys.controller;

import java.util.List;

import javax.annotation.Resource;


import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.humanResSys.dao.user.UserMapper;
import cn.humanResSys.pojo.User;
import cn.humanResSys.service.user.UserServiceImpl;
import cn.humanResSys.utils.PageSupport;


@Controller
public class UserController {
	private Logger logger=Logger.getLogger(UserController.class);
	
	@Resource
	private UserServiceImpl userServiceImpl;
	private UserMapper userMapper;
	
/*	@RequestMapping("userlist.html")
	public String userList(){
		
		return "userList";
		
	}*/
	
// 测试的list
	@RequestMapping(value="userlisttest.html")
	public String douserlist(@RequestParam(value="username",required=false)String userName,
			@RequestParam(value="roleid",required=false)String roleId,
			@RequestParam(value="departmentid",required=false)String departmentId,
			@RequestParam(value="pageIndex",required=false)String pageIndex,Model model){
		logger.info("userName================"+pageIndex);
		int currentPageNo=1;
		int pageSize=5;
		long roleid=0;
		long departmentid=0; 
		if(pageIndex!=null){
			currentPageNo=Integer.parseInt(pageIndex);
		}
		
		if(userName==null){
			userName="";
		}
		if(roleId!=null&&roleId!=""){
			roleid = Long.parseLong(roleId);
		}
		if(departmentId!=null&&departmentId!=""){
			 departmentid = Long.parseLong(departmentId);
		}
		int totalCount = userServiceImpl.getTotalCount(userName, roleid, departmentid);
		logger.info("totalCount========================="+totalCount);
		PageSupport page=new PageSupport();
		page.setCurrentPageNo(currentPageNo);
		page.setPageSize(pageSize);
		page.setTotalCount(totalCount);
		int totalPageCount = page.getTotalPageCount();
		if(currentPageNo<0){
			currentPageNo=1;
		}else if(currentPageNo>totalPageCount) {
			currentPageNo=totalPageCount;
		}
		List<User> userList = userServiceImpl.getUserList(userName, roleid, departmentid, currentPageNo, pageSize);
		String jsonString = JSON.toJSONString(userList);
		
		logger.info("jsonString========="+jsonString);
		
		model.addAttribute("userList",userList);
		model.addAttribute("currentPageNo",currentPageNo);
		model.addAttribute("pageIndex",pageIndex);
		model.addAttribute("totalPageCount",totalPageCount);
		model.addAttribute("totalCount",totalCount);
		
		return "test";	
	}
	
	
//	登录
	@RequestMapping(value="login.html")
	public String logins(){
		
		return "login";
		
	}
	
	@RequestMapping(value="frame.html")
	public String frame(){
		return "frame";
	}
	
	@RequestMapping(value="login.html",method=RequestMethod.POST)
	public String login(@Param("usercode")String usercode,@Param("userpassword")String userpassword,Model model){
		System.out.println("userpassword================"+userpassword);
		boolean flag = userServiceImpl.login(usercode, userpassword);
		User user= userMapper.getUserByCode(usercode);
		logger.info("flag==================="+flag);
		model.addAttribute("user",user);
		if(flag){
			return"redirect:frame.html";
		}
		
		return "login";	
	}
	
	
//	用户列表
	@RequestMapping(value="userlist")
	public String list(){
		
		return "userList";
		
	}
	
	
	
	@RequestMapping(value="getUserlist")
	@ResponseBody
	public Object getList(@RequestParam(value="username",required=false)String username,
			@RequestParam(value="roleid",required=false)String roleid,
			@RequestParam(value="departmentid",required=false)String departmentid,
			@RequestParam(value="pageIndex",required=false)String pageIndex,Model model){
			logger.info("user===================================="+username+"\n"+roleid+"\n"+departmentid);
			List<User> userList = userServiceImpl.getUserList(username==null ||"".equals(username)? null :username, roleid==null||"".equals(roleid)?0:Long.parseLong(roleid), departmentid==null||"".equals(departmentid)?0:Long.parseLong(departmentid), 1, 100);

			String jsonString = JSON.toJSONString(userList);
			logger.info("jsonstring============================="+jsonString);
		

		return jsonString;
		
	}
	
	@RequestMapping(value="deluser")
	@ResponseBody
	public Object deluser(@RequestParam(value="id")String id){
		logger.info("id============================="+id);
		boolean flag=false;
		int res = userServiceImpl.delUser(Long.parseLong(id));
		logger.info("res========================"+res);
		if(res>0){
			flag=true;
		}
		
		
		return flag;
		
	}
	
	
	@RequestMapping(value="modifyuser")
	@ResponseBody
	public Object edituser(@RequestParam("id")String id){
		
		
		return "modify";
		
	}
	
	
	@RequestMapping(value="domodifyuser")
	@ResponseBody
	public Object modifyuser(User user){
		boolean flag=false;
		int res = userServiceImpl.modifyUser(user);
		if(res>0){
			flag=true;
		}
		
		return flag;
		
		
	}
	
	
	
	
	@RequestMapping(value="adduser")
	@ResponseBody
	public Object adduser(User user){
		return user;
		
	}
	
	@RequestMapping(value="doadduser")
	@ResponseBody
	public Object doadduser(User user){
		
		
		return user;
		
	}
	
	
	
	
}
