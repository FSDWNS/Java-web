<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录验证</title>
</head>
<body>
<%
 String name=request.getParameter("name");//获取name的参数值
 String password=request.getParameter("password");//获取password的参数值
%>


<%
 Class.forName("com.mysql.jdbc.Driver");//加载mysql驱动
 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ui_store", "root", "root");//localhost是本机地址，3306是端口号，最后是用户名和密码
 Statement stmt=conn.createStatement();//实例化Statement对象
 String queryNumberSQL="SELECT * from login where username='"+name+"' and password='"+password+"'";
 ResultSet rs=stmt.executeQuery(queryNumberSQL);//执行数据库查询操作并获取结果集
 boolean flag=false;//初始化flag
 if(rs.next()){//判断结果
 flag=true;
 session.setAttribute("UserName", name);//将name的内容赋值给UserName
 }else{
 flag=false;
 }

%>
<%
 if(flag){
%>
<jsp:forward page="login_success.jsp"></jsp:forward>//跳转页面
<%
 }else{

%>
<jsp:forward page="login_failed.jsp"></jsp:forward>//跳转页面
<%
 }
//关闭上面的几个对象，注意关闭顺序，最后使用的先关闭
rs.close();
stmt.close();
conn.close();

%>
</body>
</html>