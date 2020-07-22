<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加数据</title>
   <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
		<!--用百度的静态资源库的cdn安装bootstrap环境-->
		<!-- Bootstrap 核心 CSS 文件 -->
		<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
		<!--font-awesome 核心我CSS 文件-->
		<link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
		<!-- 在bootstrap.min.js 之前引入 -->
		<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
		<!-- Bootstrap 核心 JavaScript 文件 -->
		<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    	<div class="container" style="width: 400px">
		<div class="form row">
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" action="javascript:void(0)">
				<h2 class="form-title">添加信息</h2>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
						<input class="form-control required" type="text" placeholder="姓名" id="name" name="name" maxlength="20"/>
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="年龄" id="sex" name="sex" maxlength="8"/>
					</div>
					<div class="form-group">
							<select name ="depar_id" id="depar_id" class="form-control required">
									 <option value="0">---请选择部门---</option>
									 <option value="1">财务部</option>
									 <option value="2">市场部</option>
									 <option value="3">生产部</option>
							</select>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success pull-left" value="提交" onclick="addus()"/>
						<input type="reset" class="btn btn-success pull-right" value="清空"/>  
					</div>
				</div>
			</form>
			<script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
			<script type="text/javascript">
				function addus(){
					var name = $("#name").val();
					var sex = $("#sex").val();
					var depar_id = $("#depar_id").val();
					if(name==null || name == ""){
						alert("姓名不能为空!");
					}else if(sex==null || sex == ""){
						alert("年龄不能为空!");
					}else if(depar_id==0){
						alert("请选择部门!");
					}else{
							$.ajax({
								url	:	"adduser",
								method : "post",
								data : {
									"name" : name,
									"sex" : sex,
									"depar_id": depar_id
								},
								success : function(ruelt) {
									if (ruelt == "true") {
										alert("添加成功!");
										window.location.href = "all";
									} else {
										alert("添加失败!");
									}
								}
							});
					}
 				}
			</script>
		</div>
	</div>
  </body>
</html>
