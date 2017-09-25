/**
 * @author 方梓恒
 * @since 2017-9-21
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
		    url : 'offerList', // 获取数据地址
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
		$.ajax (
		{
		    type : "post",
		    url : "getapplist",
		    data :
		    {
		    	jobname : $ ("#s_jobname").val (),
		    	jobcategory : $ ("#s_jobcategory").val (),
		    	creationdate : $ ("#datemin").val (),
		    	endtime : $ ("#datemax").val ()
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
			    alert ("对不起，查询失败");
		    }
		});
	});
	
	$ ("#datatable > tbody").on ("click", ".verbutton1", function ()
	{
		$.ajax (
		{
		    type : "GET",
		    url : "check",
		    data :
		    {
			    id : $ (this).attr ("offerid")
		    },
		    dataType : "json",
		    success : function (data)
		    {
			    if (data == "true")
			    {
				    reflashlist ();
			    }
			    else if (data == "false")
			    {// 删除失败
				    alert ("对不起，删除失败");
				    
			    }
			    else if (data == "notexist")
			    {
				    alert ("对不起，app不存在");
			    }
		    },
		    error : function (data)
		    {
			    alert ("对不起，删除失败");
		    }
		});
	});
	
	$ ("#datatable > tbody").on ("click", ".verbutton2", function ()
			{
				$.ajax (
				{
				    type : "GET",
				    url : "check",
				    data :
				    {
					    id : $ (this).attr ("offerid")
				    },
				    dataType : "json",
				    success : function (data)
				    {
					    if (data == "true")
					    {
						    reflashlist ();
					    }
					    else if (data == "false")
					    {// 删除失败
						    alert ("对不起，删除失败");
						    
					    }
					    else if (data == "notexist")
					    {
						    alert ("对不起，app不存在");
					    }
				    },
				    error : function (data)
				    {
					    alert ("对不起，删除失败");
				    }
				});
			});
	
	$ ("#datatable > tbody").on ("click", ".verbutton3", function ()
			{
				$.ajax (
				{
				    type : "GET",
				    url : "check",
				    data :
				    {
					    id : $ (this).attr ("offerid")
				    },
				    dataType : "json",
				    success : function (data)
				    {
					    if (data == "true")
					    {
						    reflashlist ();
					    }
					    else if (data == "false")
					    {// 删除失败
						    alert ("对不起，删除失败");
						    
					    }
					    else if (data == "notexist")
					    {
						    alert ("对不起，app不存在");
					    }
				    },
				    error : function (data)
				    {
					    alert ("对不起，删除失败");
				    }
				});
			});
	
	// 把服务器返回的数据转成datatable须要的格式
	function packagingdatatabledata (data)
	{
		var htmlHead1 = "<button class=\"verbutton1 btn btn-round btn-default\" type=\"button\" offerid=";
		var htmlFoot1 = ">修改</button>";
		var htmlHead2 = "<button class=\"verbutton2 btn btn-round btn-default\" type=\"button\" offerid=";
		var htmlFoot2 = ">删除</button>";
		var htmlHead3 = "<button class=\"verbutton3 btn btn-round btn-default\" type=\"button\" offerid=";
		var htmlFoot3 = ">查看</button>";
		var a = [];
		
		for (var i = 0; i < data.length; i++)
		{
			var tempObj = [
			        "", "", "", "","", "", "", "", "", "", ""
			];
			tempObj[0] = data[i].id;
			tempObj[1] = data[i].jobcode;
			tempObj[2] = data[i].jobname;
			tempObj[3] = data[i].jobcategory;
			tempObj[4] = data[i].department;
			tempObj[5] = data[i].hiringnumber;
			tempObj[6] = data[i].creationdate;
			tempObj[7] = data[i].endtime;
			tempObj[8] = htmlHead1 + data[i].id + htmlFoot1;
			tempObj[8] += htmlHead2 + data[i].id + htmlFoot2;
			tempObj[8] += htmlHead3 + data[i].id + htmlFoot3;
			
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