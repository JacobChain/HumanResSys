<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- 	<%@ include file="common/header.jsp" %> --%>
	<div>
	<form action="${pageContext.request.contextPath }/train/updatetrain" method="post">
	<div>
	培训编号:&nbsp<input type="text" name="idd" value="${train.id}">
	</div>
	
	<div>
	培训名称:&nbsp<input type="text" name="trainname" value="${train.trainname}">
	</div>
	<div>
	培训讲师:&nbsp<input type="text" name="trainteacher" value="${train.trainteacher}">
<%-- 	培训时间:&nbsp<input type="text" value="${train.starttime}">至<input type="text" value="${train.endtime}"> --%>
	</div>
	<div>
	培训目的:<textarea rows="10" cols="40" name="trainpurpose" >${train.trainpurpose}</textarea>
	</div>
	<div>
	培训人员:<textarea rows="10" cols="40" name="trainees" >${train.trainees}</textarea>
	</div>
	<div>
	培训简介:<textarea rows="10" cols="40" name="description" >${train.description}</textarea>
	</div>
	<div>
	<input type="submit" value="提交">
	<input type="reset" value="重置">
	</div>
	</form>
</div>
<%@ include file="common/footer.jsp" %>