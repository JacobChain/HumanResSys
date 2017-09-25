var departmentstatus=null;
var offertype=null;
var hiringnumber=null;
var jobname=null;
var jobcode=null;
var jobcategory=null;
var offerName=null;
$(function(){
	departmentstatus = $("#departmentstatus");
	offertype = $("#offertype");
	hiringnumber = $("#hiringnumber");
	jobname = $("#jobname");
	jobcode = $("#jobcode");
	jobcategory = $("#jobcategory");
	offerName = $("#offerName");
	
	departmentstatus.on("blur",function(){
		if(departmentstatus.val() != null && departmentstatus.val() != ""){
			validateTip(departmentstatus.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(departmentstatus.next(),{"color":"red"},imgNo+" 编码不能为空，请重新输入",false);
		}
	}).on("focus",function(){
		//显示友情提示
		validateTip(departmentstatus.next(),{"color":"#666666"},"* 请输入部门",false);
	}).focus();
	
	offertype.on("focus",function(){
		validateTip(offertype.next(),{"color":"#666666"},"* 请输入招聘类型",false);
	}).on("blur",function(){
		if(offertype.val() != null && offertype.val() != ""){
			validateTip(offertype.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(offertype.next(),{"color":"red"},imgNo+" 招聘类型不能为空，请重新输入",false);
		}
		
	});
	
	hiringnumber.on("focus",function(){
		validateTip(hiringnumber.next(),{"color":"#666666"},"* 请输入招聘人数",false);
	}).on("blur",function(){
		if(hiringnumber.val() != null && hiringnumber.val() != 0){
			validateTip(hiringnumber.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(hiringnumber.next(),{"color":"red"},imgNo+" 招聘人数不能为空，请重新输入",false);
		}
		
	});
	
	jobname.on("focus",function(){
		validateTip(jobname.next(),{"color":"#666666"},"* 请输入职位名称",false);
	}).on("blur",function(){
		if(jobname.val() != null && jobname.val() != ''){
			validateTip(jobname.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(jobname.next(),{"color":"red"},imgNo + " 职位名称不能为空，请重新输入",false);
		}
	});
	
	jobcode.on("focus",function(){
		validateTip(jobcode.next(),{"color":"#666666"},"* 请输入职位编码",false);
	}).on("blur",function(){
		if(jobcode.val() != null && jobcode.val() != ''){
			validateTip(jobcode.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(jobcode.next(),{"color":"red"},imgNo + " 职位编码不能为空，请重新输入",false);
		}
	});
	
	jobcategory.on("focus",function(){
		validateTip(jobcategory.next(),{"color":"#666666"},"* 请输入职位分类",false);
	}).on("blur",function(){
		if(jobcategory.val() != null && jobcategory.val() != ''){
			validateTip(jobcategory.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(jobcategory.next(),{"color":"red"},imgNo + " 职位分类不能为空，请重新输入",false);
		}
	});
	
	offerName.on("focus",function(){
		validateTip(offerName.next(),{"color":"#666666"},"* 请输入登记人",false);
	}).on("blur",function(){
		if(offerName.val() != null && offerName.val() != ''){
			validateTip(offerName.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(offerName.next(),{"color":"red"},imgNo + " 登记人不能为空，请重新输入",false);
		}
	});
	
	
	$("#add").on("click",function(){
		if(proCode.attr("validateStatus") != "true"){
			proCode.blur();
		}else if(proName.attr("validateStatus") != "true"){
			proName.blur();
		}else if(proContact.attr("validateStatus") != "true"){
			proContact.blur();
		}else if(proPhone.attr("validateStatus") != "true"){
			proPhone.blur();
		}else{
			if(confirm("是否确认提交数据")){
				$("#providerForm").submit();
			}
		}
	});
	
	backBtn.on("click",function(){
		if(referer != undefined 
			&& null != referer 
			&& "" != referer
			&& "null" != referer
			&& referer.length > 4){
		 window.location.href = referer;
		}else{
			history.back(-1);
		}
	});
});