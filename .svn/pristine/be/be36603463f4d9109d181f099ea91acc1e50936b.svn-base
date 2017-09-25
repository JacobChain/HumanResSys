<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ include file="common/header.jsp" %>
	<div >
	<form action="${pageContext.request.contextPath }/train/trainlist" method="post">
	<input type="hidden" name="pageIndex" value="1"/>
	<table border="1" align="center">
	<tr>
	<td>培训名称</td>
	<td>培训讲师</td>
	<td>培训时间</td>
	<td>培训反馈</td>
	<td>审核状态</td>
	<td>操作</td>
	</tr>
	<c:forEach items="${training}" var="train">
	<tr>
	<td>${train.trainname}</td>
	<td>${train.trainteacher}</td>
	<td>${train.starttime}</td>
	<td>${train.valuenames}</td>
	<td>${train.valuename}</td>
	<c:if test="${train.check_status==1}">
	<td><a href="${pageContext.request.contextPath }/train/updateTrain?idd=${train.id}">修改</a>&nbsp<a href="${pageContext.request.contextPath }/train/trainDetail?idd=${train.id}">明细</a>&nbsp<a href="${pageContext.request.contextPath }/train/deletedetail?idd=${train.id}">删除</a></td>
	</c:if>
	<c:if test="${train.check_status==2}">
	<td><a href="${pageContext.request.contextPath }/train/traincheck?idd=${train.id}">复核</a>&nbsp<a href="${pageContext.request.contextPath }/train/trainDetail?idd=${train.id}">明细</a></td>
	</c:if>
	<c:if test="${train.check_status==3}">
	<td><a href="${pageContext.request.contextPath }/train/trainfeedback?idd=${train.id}">培训反馈</a></td>
	</c:if>
	</tr>
	</c:forEach>
	</table>
		<div class="row" align="center">
					<div class="col-sm-5">
						<div class="dataTables_info" id="datatable-responsive_info"
							role="status" aria-live="polite">共${page.totalCount }条记录
							${page.currentPageNo }/${page.totalPageCount }页</div>
					</div>
					<div class="col-sm-7">
	<div class="dataTables_paginate paging_simple_numbers"
							id="datatable-responsive_paginate" >
							<ul class="pagination">
								<c:if test="${page.currentPageNo > 1}">
									<li class="paginate_button previous"><a
										href="javascript:page_nav(document.forms[0],1);"
										aria-controls="datatable-responsive" data-dt-idx="0"
										tabindex="0">首页</a>
									</li>
									<li class="paginate_button "><a
										href="javascript:page_nav(document.forms[0],${page.currentPageNo-1});"
										aria-controls="datatable-responsive" data-dt-idx="1"
										tabindex="0">上一页</a>
									</li>
								</c:if>
								<c:if test="${page.currentPageNo < page.totalPageCount }">
									<li class="paginate_button "><a
										href="javascript:page_nav(document.forms[0],${page.currentPageNo+1 });"
										aria-controls="datatable-responsive" data-dt-idx="1"
										tabindex="0">下一页</a>
									</li>
									<li class="paginate_button next"><a
										href="javascript:page_nav(document.forms[0],${page.totalPageCount });"
										aria-controls="datatable-responsive" data-dt-idx="7"
										tabindex="0">最后一页</a>
									</li>
								</c:if>
							</ul>
						</div>
							</div>
					</div>
	</form>
	</div>
<%@ include file="common/footer.jsp" %>
<script src="${pageContext.request.contextPath }/static/js/trainrollpage.js"></script>