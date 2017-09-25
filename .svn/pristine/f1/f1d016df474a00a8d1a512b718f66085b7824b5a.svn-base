<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<meta http-equiv="Cache-Control" content="no-siteapp">
<link rel="Bookmark" href="/favicon.ico">
<link rel="Shortcut Icon" href="/favicon.ico">
<!--[if lt IE 9]>
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/html5shiv.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/static/defaultInput/renLi/static/h-ui/css/H-ui.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/static/defaultInput/renLi/static/h-ui.admin/css/H-ui.admin.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/Hui-iconfont/1.0.8/iconfont.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/static/defaultInput/renLi/static/h-ui.admin/skin/default/skin.css"
	id="skin">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/static/defaultInput/renLi/static/h-ui.admin/css/style.css">
<!--[if IE 6]>
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<style type="text/css">
.menu_dropdown .Hui-iconfont {
	font-size: 20px;
}
</style>

<title>人力资源管理系统</title>

</head>

<body>
	<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl">
			<a class="logo navbar-logo f-l mr-10 hidden-xs"
				href="/aboutHui.shtml">LOGO放置处</a> <a
				class="logo navbar-logo-m f-l mr-10 visible-xs"
				href="/aboutHui.shtml">人力资源管理系统</a> <span
				class="logo navbar-slogan f-l mr-10 hidden-xs">人力资源管理系统</span> <a
				aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs"
				href="javascript:;"></a>
			<nav class="nav navbar-nav">
			<ul class="cl">
				<li class="navbar-levelone current"><a href="javascript:;">一般事项</a></li>
				<li class="navbar-levelone"><a href="javascript:;">管理事项</a></li>
				<li class="navbar-levelone"><a href="javascript:;">系统事项</a></li>

			</ul>
			</nav>
			<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
			<ul class="cl">
				<li>超级管理员</li>
				<li class="dropDown dropDown_hover"><a href="#"
					class="dropDown_A">${user.username} <i class="Hui-iconfont"></i></a>
					<ul class="dropDown-menu menu radius box-shadow"
						style="left: -64px">
						<li class=""><a href="javascript:;" onclick="myselfinfo()">个人信息</a></li>
						<li><a href="#">切换账户</a></li>
						<li><a href="#">退出</a></li>
					</ul></li>
				<li id="Hui-msg"><i class="icon Hui-iconfont"
					style="font-size: 18px">&#xe60a;</i></li>
			</ul>
			</nav>
		</div>
	</div>
	</header>
	<aside class="Hui-aside">
	<div class="menu_dropdown bk_2" style="display: block;">
		<dl id="menu-article">
			<dt>
				<i class="Hui-iconfont">&#xe625;</i> 我的工作平台<i
					class="Hui-iconfont menu_dropdown-arrow"></i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="article-list.html" data-title="资讯管理"
						href="javascript:void(0)">代办列表</a></li>
					<li><a data-href="article-list.html" data-title="资讯管理"
						href="javascript:void(0)">修改密码</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-tongji">
			<dt>
				<i class="Hui-iconfont">&#xe621;</i> 数据分析<i
					class="Hui-iconfont menu_dropdown-arrow"></i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="charts-1.html" data-title="折线图"
						href="javascript:void(0)">职员明细表</a></li>
					<li><a data-href="charts-2.html" data-title="时间轴折线图"
						href="javascript:void(0)">职员数据综合报表</a></li>
					<li><a data-href="charts-3.html" data-title="区域图"
						href="javascript:void(0)">职员异动情况统计分析</a></li>
					<li><a data-href="charts-4.html" data-title="柱状图"
						href="javascript:void(0)">储备人才统计表</a></li>
					<li><a data-href="charts-5.html" data-title="饼状图"
						href="javascript:void(0)">公司各体系结构分析</a></li>
				</ul>
			</dd>
		</dl>

	</div>

	<div class="menu_dropdown bk_2" style="display: none">
		<dl id="menu-comments">
			<dt>
				<i class="Hui-iconfont">&#xe6c6;</i> 人事管理<i
					class="Hui-iconfont menu_dropdown-arrow"></i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="http://h-ui.duoshuo.com/admin/"
						data-title="评论列表" href="javascript:;">人事档案管理</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-member">
			<dt>
				<i class="Hui-iconfont"></i> 招聘管理<i
					class="Hui-iconfont menu_dropdown-arrow"></i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="member-list.html" data-title="会员列表"
						href="javascript:;">职位发布管理</a></li>
					<li><a data-href="member-del.html" data-title="删除的会员"
						href="javascript:;">简历管理</a></li>
					<li><a data-href="member-level.html" data-title="等级管理"
						href="javascript:;">面试管理</a></li>
					<li><a data-href="member-scoreoperation.html"
						data-title="积分管理" href="javascript:;">录用管理</a></li>

				</ul>
			</dd>
		</dl>
		<dl id="menu-admin">
			<dt>
				<i class="Hui-iconfont">&#xe62b;</i> 培训管理<i
					class="Hui-iconfont menu_dropdown-arrow"></i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="admin-role.html" data-title="角色管理"
						href="javascript:void(0)">培训计划</a></li>
					<li><a data-href="admin-permission.html" data-title="权限管理"
						href="javascript:void(0)">培训复核</a></li>
					<li><a data-href="admin-list.html" data-title="管理员列表"
						href="javascript:void(0)">培训考核与反馈</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu-product">
			<dt>
				<i class="Hui-iconfont">&#xe63a;</i> 薪酬管理<i
					class="Hui-iconfont menu_dropdown-arrow"></i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="product-brand.html" data-title="品牌管理"
						href="javascript:void(0)">薪酬标准管理</a></li>
					<li><a data-href="product-category.html" data-title="分类管理"
						href="javascript:void(0)">薪酬发放管理</a></li>

				</ul>
			</dd>
		</dl>
	</div>


	<div class="menu_dropdown bk_3" style="display: none">
		<dl id="menu-picture">
			<dt>
				<i class="Hui-iconfont">&#xe62e;</i> 系统设置<i
					class="Hui-iconfont menu_dropdown-arrow"></i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="picture-list.html" data-title="图片管理"
						href="javascript:void(0)">组织结构设置</a></li>
					<li><a data-href="picture-list.html" data-title="图片管理"
						href="javascript:void(0)">用户管理</a></li>
					<li><a data-href="picture-list.html" data-title="图片管理"
						href="javascript:void(0)">职位设置</a></li>
					<li><a data-href="picture-list.html" data-title="图片管理"
						href="javascript:void(0)">职称设置</a></li>
					<li><a data-href="picture-list.html" data-title="图片管理"
						href="javascript:void(0)">题库管理设置</a></li>
					<li><a data-href="picture-list.html" data-title="图片管理"
						href="javascript:void(0)">公共属性设置</a></li>
					<li><a data-href="picture-list.html" data-title="图片管理"
						href="javascript:void(0)">薪酬项目设置</a></li>
				</ul>
			</dd>
		</dl>
		<!-- <dl id="menu-ccccc">
			<dt>
				<i class="Hui-iconfont"></i> 二级导航3<i
					class="Hui-iconfont menu_dropdown-arrow"></i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="article-list.html" data-title="资讯管理"
						href="javascript:void(0)">三级导航</a></li>
				</ul>
			</dd>
		</dl> -->
	</div>

	</aside>
	<section class="Hui-article-box">