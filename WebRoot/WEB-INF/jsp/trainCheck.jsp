<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>
	<form action="${pageContext.request.contextPath }/train/trainChecks">
	<input type="hidden" name="name" value="${train.id}">
	<table >
	
	<tr>
	<td>培训名称:</td>
	<td><input type="text" value="${train.trainname}"></td>
	</tr>
	<tr>
	<td>培训讲师:</td>
	<td><input type="text" value="${train.trainteacher}"></td>
	</tr>
	<tr>
	<td>开始时间:</td>
	<td><input type="text" value="${train.starttime}"></td>
	</tr>
	<tr>
	<td>结束时间:</td>
	<td><input type="text" value="${train.endtime}"></td>
	</tr>
	<tr>
	<td>培训目的:</td>
	<td><input type="text" value="${train.trainpurpose}"></td>
	</tr>
	<tr>
	<td>培训人员:</td>
	<td><input type="text" value="${train.trainees}"></td>
	</tr>
	<tr>
	<td>培训简介:</td>
	<td><input type="text" value="${train.description}"></td>
	</tr>
	
	</table>
	<div>
	<input type="submit" value="审核通过">
	<input type="button" value="驳回">
	<input type="button" value="返回">
	</div>
	</form>
	</div>
