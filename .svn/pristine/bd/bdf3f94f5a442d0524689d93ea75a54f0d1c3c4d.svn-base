<!-- 
@创建者 何安迪
@创建时间 2017-9-21
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="/WEB-INF/jsp/common/header.jsp"%>

<nav class="breadcrumb">
	<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
	用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a
		class="btn btn-success radius r"
		style="line-height:1.6em;margin-top:3px"
		href="javascript:location.replace(location.href);" title="刷新"><i
		class="Hui-iconfont">&#xe68f;</i> </a>
</nav>
<div class="pd-20">
	<div class="text-c">
		用户名称<input type="text" name="username" id="Qusername">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
		<select
			name="roleid" id="Qroleid">
			<option value="">请选择--</option>
			<option value="1">系统管理员</option>
			<option value="2">公司领导</option>
			<option value="3">人力资源负责人</option>
			<option value="4">薪酬经理</option>
			<option value="5">薪酬专员</option>
			<option value="6">人事经理</option>
			<option value="7">人事专员</option> 
			<option value="8">招聘专员</option>
		</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="departmentid" id="Qdepartmentid">
			<option value="">请选择--</option>
			<option value="1">人力资源</option>
			<option value="2">Java开发</option>
			<option value="3">产品设计中心</option>
			<option value="4">财务部</option>
		</select>


		<button type="botton" class="btn btn-success" id="search"
			name="search">
			<i class="icon-search"></i> 搜用户
		</button>

	</div>
</div>
<div class="cl pd-5 bg-1 bk-gray mt-20">
	<span class="l"> <a href="javascript:;" onclick="datadel()"
		class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
			批量删除</a> </span> <span class="r">共有数据：<strong>${totalCount}没传入</strong> 条
	</span>
</div>
<div class="mt-20">
	<table id="datatable"
		class="table table-border table-bordered table-bg table-hover table-sort">
		<thead>
			<tr class="text-c">
				<th width=10%>ID</th>
				<th width=15%>用户编码</th>
				<th width=15%>用户名称</th>
				<th width=15%>用户角色</th>
				<th width=15%>所属部门</th>
				<th width=20%>操作</th>
			</tr>
		</thead>
		<tbody align="center">
		</tbody>
	</table>
</div>

<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/js/userList.js"></script>

