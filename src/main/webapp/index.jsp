<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
    <div>
        <form action="<%=request.getContextPath()%>/user/login" method="POST">
            <input name="userName" placeholder="用户名/账号/邮箱" type="text"/>
            <input name="userPwd" placeholder="密码" type="password" />
            <input type="submit" value="登录" />
        </form>
    </div>
</body>
</html>
