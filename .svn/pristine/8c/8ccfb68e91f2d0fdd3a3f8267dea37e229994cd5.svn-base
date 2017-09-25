<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/header.jsp" %>
	
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css">
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css">
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css">
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin">
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">

	<style type="text/css">
	thead tr th{ text-align: center;
	}
	tbody tr td{text-align: center;}
	
	body {
  /*   background: url(../../static/defaultInput/renLi/static/h-ui.admin/images/loading.gif); */
  background-color: rgb(200,200,169);
}

</style> 
	
  
<section>
	<form method="post" action="${pageContext.request.contextPath }/userlisttest.html">
     <table class="table table-border table-bordered table-hover table-bg table-sort"  >
    <thead style="text-align: center;">
      <tr>
        <th width="50"><input type="checkbox" name="" value=""></th>
        <th width="160">用户编码</th>
        <th width="150">用户名称</th>
        <th width="160">用户角色</th>
        <th width="120">所属部门</th>
        <th width="300">操作</th>
      </tr>
    </thead>
    <tbody style="text-align: center;">
   		<c:forEach var="user" items="${userList }">
      <tr>
        <td><input type="checkbox" value="1" name=""></td>
        <td>${user.usercode }</td>    
        <td>${user.username }</td>
        <td>${user.userrole }</td>
        <td>${user.departmentname }</td>
        <td> <a href="">删除</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="">添加</a>&nbsp;&nbsp;&nbsp;&nbsp; <td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  	 <input type="hidden" name="pageIndex" value="1"/>
  	<input type="hidden" id="totalPageCount" value="${totalPageCount}"/>
		  	<c:import url="rollpage.jsp">
	          	<c:param name="totalCount" value="${totalCount}"/>
	          	<c:param name="currentPageNo" value="${currentPageNo}"/>
	          	<c:param name="totalPageCount" value="${totalPageCount}"/>
          	</c:import>
  	</form>
  
  </section>
  
  
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../bootstrap/js/bootstrap.min.js"></script>
  
  
<%@include file="/WEB-INF/jsp/common/footer.jsp"%>