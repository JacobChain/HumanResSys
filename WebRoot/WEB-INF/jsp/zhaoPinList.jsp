<%@ page language="java" import="java.util.*"  pageEncoding="utf-8"%>
<%@include file="/WEB-INF/jsp/common/header.jsp"%>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 招聘管理 <span class="c-gray en">&gt;</span> 职位发布管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>

<div class="page-container">
  <form method="post" action="${pageContext.request.contextPath }/zhaoPinList.html">
	<div class="text-c"> 职位名称：
	    <input type="text" class="input-text" style="width:250px" placeholder="请输入您要查询的职位名称" id="" name="" value="${jobname }" >
	    
           <label>  职位分类：</label> 
           <select name=""> 
             <option value="0">--请选择--</option> 
             <option value="1">管理</option>
             <option value="2">技术</option> 
             <option value="3">销售</option> 
           </select> 
        
                            登记日期：
		<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
		截止日期：
		<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 查询</button>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 职位发布登记</a></span> <span class="r">共有数据：<strong>88</strong> 条</span> </div>
  </form>
	
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="80">职位编码</th>
				<th width="80">职位名称</th>
				<th width="80">职位分类</th>
				<th width="100">所属部门</th>
				<th width="80">招聘人数</th>
				<th width="100">登记日期</th>
				<th width="100">截止日期</th>
				<th width="100">操作</th>
			</tr>
		
		    <c:forEach var="offer" items="${offerList }" varStatus="status">
					<tr>
						<td>
						   <span>${offer.jobcode }</span>
						</td>
						<td>
						  <span>${offer.jobname }</span>
						</td>
						<td>
							<span>${offer.jobcategory }</span>
						</td>
						<td>
						   <span>${offer.departmentstatus}</span>
						</td>
						<td>
						  <span>${offer.hiringnumber}</span>
						</td>
						<td>
							<span>${offer.creationDate}</span>
						</td>
						<td>
							<span>${offer.endtime}</span>
						</td>
						<td>
						<span><a class="viewOffer" href="viewOffer.html?id=${offer.id }" >查看</a></span>
						<span><a class="updateOffer" href="updateOffer.html?id=${offer.id }" >修改</a></span>
						<span><a class="deleteOffer" href="${pageContext.request.contextPath }/delOffer?id=${offer.id }" >删除</a></span>
						</td>
					</tr>
				</c:forEach>
	</table>
	  
	</div>
</div>

<%@include file="/WEB-INF/jsp/common/footer.jsp"%>

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/laypage/1.2/laypage.js"></script>

<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,8]}// 制定列不参与排序
		]
	});
	
});
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
				$(obj).remove();
				layer.msg('已停用!',{icon: 5,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
				$(obj).remove();
				layer.msg('已启用!',{icon: 6,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});
	});
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}
</script>