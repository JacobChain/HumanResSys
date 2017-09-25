<!-- 
@创建者 方梓恒
@创建时间 2017-9-21
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="/WEB-INF/jsp/common/header.jsp"%>
   


	<div class="cl pd-5 bg-1 bk-gray mt-20">
		<form method="post" action="${pageContext.request.contextPath }/offerList.html">
	      <div class="text-c"> 职位名称：
	          <input type="text" class="input-text" style="width:250px" placeholder="请输入您要查询的职位名称" id="s_jobname" name="jobname" value="${jobname }" >
	       
	       
           <label>  职位分类：</label> 
           <select id="s_jobcategory"> 
             <b role="presentation"></b>
           </select> 
        
                                         登记日期：
		     <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
		             截止日期：
		     <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
		<button type="submit" class="btn btn-success radius" id="search" name="search"><i class="Hui-iconfont">&#xe665;</i> 查询</button>
	     </div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"> <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 职位发布登记</a></span>  </div>
       </form>
	</div>
	<div class="mt-20">
		<table id="datatable"
			class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="5%" >ID</th>
					<th >职位编码</th>                                  <!-- 显示字段 -->
					<th>职位名称</th>
					<th >职位分类</th>
					<th >所属部门</th>
					<th >招聘人数</th>
					<th >登记日期</th>
					<th >截止日期</th>
					<th >操作</th>
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
	src="${pageContext.request.contextPath }/static/js/offerList.js"></script>