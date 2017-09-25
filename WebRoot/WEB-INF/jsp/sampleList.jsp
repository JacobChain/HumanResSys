<!-- 
@创建者 陈应豪
@创建时间 2017-9-19
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="/WEB-INF/jsp/common/header.jsp"%>

	<div class="cl pd-5 bg-1 bk-gray mt-20">
		<span class="l"> <a href="javascript:;" onclick="datadel()"
			class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
				批量删除</a>
		</span> <span class="r">共有数据：<strong>54</strong> 条
		</span>
	</div>
	<div class="mt-20">
		<table id="datatable"
			class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="5%" >ID</th>
					<th >职位编号</th>                                  <!-- 显示字段 -->
					<th>招聘岗位</th>
					<th >创建日期</th>
					<th >截止时间</th>
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
	src="${pageContext.request.contextPath }/static/js/sampleList.js"></script>

