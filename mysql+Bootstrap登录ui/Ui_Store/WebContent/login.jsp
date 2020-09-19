<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录界面</title>
</head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/Ui_Store.css"/>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
<body>
    <div class="top">
        
    </div>
    
    <div class="container" style="padding-top: 50px;">
        <div class="panel panel-primary" style="width:500px;height:450px;margin: auto;">
            <div class="panel-heading" >
                <h3 style="text-align:center">登录界面</h3>
            </div>
            <div class="panel-body">
                <div style="padding: 50px 80px 10px;">
                    <form action="check_login.jsp" method="post" class="bs-example bs-example-form" role="form">
                        <div class="input-group">
                            <span class="input-group-addon">账号:</span>
                            <input type="text"  name="name" class="form-control" placeholder="请输入账号" >
                        </div>
                       <br><br>
                        <div class="input-group">
                            <span class="input-group-addon">密码:</span>
                            <input type="password" name="password" class="form-control" placeholder="请输入密码" >
                        </div>
                        <br><br>
                     <input type="submit" value="登陆" class="btn btn-primary col-md-12">
                     <br><br><br>
                     <input type="reset" value="重置" class="btn btn-primary col-md-12">
  </div>
        </div>
    </div>
    
</body>
</html>