/**
 * @author 陈应豪
 * @since 2017-9-19
 * 
 */

$ (document).ready (function ()
{
	$ ("#datatable").dataTable ().fnDraw (true);
	function getapplist ()
	{
		$.ajax (
		{
		    type : 'get',// 可选get
		    url : 'getUserlist', // 获取数据地址
		    data : {
		    
		    // 输入参数，以json的格式传输
		    },
		    dataType : 'json',// 服务器返回的数据类型 可选XML ,Json jsonp
		    // script
		    // htmltext等
		    success : function (data)
		    {
			    // 重新构建table
			    $ ('#datatable').dataTable ().fnClearTable (); // 将数据清除
			    $ ('#datatable').dataTable ().fnAddData (packagingdatatabledata (data), true); // 数据必须是json对象或json对象数组
			    
		    },
		    error : function ()
		    {
			    alert ('error');
		    }
		});
	}
	
	function reflashlist ()
	{
		console.log ("reflashlist");
		start = $ ("#datatable").dataTable ().fnSettings ()._iDisplayStart;
		total = $ ("#datatable").dataTable ().fnSettings ().fnRecordsDisplay ();
		getapplist ();
		if ((total - start) == 1)
		{
			if (start > 0)
			{
				$ ("#datatable").dataTable ().fnPageChange ('previous', true);
			}
		}
	}
	
	getapplist ();
	
	$ ("#search").on ("click", function ()
	{
		alert("进入");
		$.ajax (
		{
		    type : "post",
		    url : "getUserlist",
		    data :
		    {
		    	username : $ ("#Qusername").val (),
		    	roleid : $ ("#Qroleid").val (),
		        departmentid : $ ("#Qdepartmentid").val (),

		    },
		    dataType : "json",
		    success : function (data)
		    {
			    // 重新构建table
			    $ ('#datatable').dataTable ().fnClearTable (); // 将数据清除
			    $ ('#datatable').dataTable ().fnAddData (packagingdatatabledata (data), true); // 数据必须是json对象或json对象数组
			    
		    },
		    error : function (data)
		    {
			    alert ("查询失败");
		    }
		});
	});
	
	
	
/* examples 	$ ("#datatable > tbody").on ("click", ".verbutton", function (){
		
		layer_show ("主页面", "../", "", "510");
	})*/
	
	
	
	
	$ ("#datatable > tbody").on ("click", ".del", function (){
	    $.ajax({
	    		type:"post",
	    		url:"deluser",
	    		data:{
	    			id:$(this).attr("uid")
	    		},
	    		dataType:"json",
	    		success:function(data){
	    			alert("进入删除");
	    			if(data==true){
	    				alert("删除成功");
	    				$(this).remove();
	    			}else{
	    				alert("删除失败");
	    			}
	    			
	    		}
	    		
	});	
	});
	
	$("#datatable>tbody").on("click","modify",function(){
		$.ajax({
			type:"post",
			url:"modifyuser",
			data:{
				id:$(this).attr("uid")
			},
			dataType:"json",
			success:function(data){
				
			}
		
		
		})	
	})
	
	$("#datatable>tbody")
	
	
	
	
	
	
	
	
	// 把服务器返回的数据转成datatable须要的格式
	function packagingdatatabledata (data)
	{
		var htmlHead1 = "<button class=\" del btn btn-round btn-default \" type=\"button\" uid=" ;
		var htmlFoot1 = ">删除</button>";
		var htmlHead2 = "<button class=\"modify btn btn-round btn-default\" type=\"button\" uid=";
		var htmlFoot2 = ">编辑</button>";
		var htmlHead3 = "<button class=\"add btn btn-round btn-default\" type=\"button\" uid=";
		var htmlFoot3 = ">添加</button>";
		var a = [];
		for (var i = 0; i < data.length; i++)
		{
			var tempObj = [
			        "", "", "", "", "", "", "","",
			];
			tempObj[0] = data[i].id;
			tempObj[1] = data[i].usercode;
			tempObj[2] = data[i].username;
			tempObj[3] = data[i].userrole;
			tempObj[4] = data[i].departmentname;
			tempObj[5] =  htmlHead1 + data[i].id + htmlFoot1;
			tempObj[5] += htmlHead2 + data[i].id + htmlFoot2;
			tempObj[5] += htmlHead3 + data[i].id + htmlFoot3;
			
			a.push (tempObj);
		}
		return a;
	}
	
	function check (object)
	{
		if (object != null && object != "")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
});
