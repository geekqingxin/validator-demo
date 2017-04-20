<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<%@ page language="Java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String ctxPath = request.getContextPath();
%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="<%=ctxPath %>/js/jquery-1.11.1.min.js"></script>
</head>
===========================*实验和简单的表单提交*===============================================
<hr>
${hello}
<body>
<br>
        <input type="text" id="name">姓名
        <input type="password" id="passwrod">密码
        <button type="button" id="myForm">点击提交 </button>
</body>
<script type="text/javascript">
    $("#myForm").on("click",function () {
        var name = $("#name").val();
        var pawd = $("#passwrod").val();
        var data={};
        data.push(name,pawd);
        console.log(data);
        /*需要分两种情况做后台参数映射校验
        * 1，参数绑定在url上
        * 2，参数绑定在对象上
        *    简单的做一下
        * */
        $.ajax(
                {
                    method:"POST",
                    url:"<%=ctxPath %>/user/"+name+"/"+pawd+"",
                    success:function (data) {
                        if (data){
                            console.log(data)
                        }
            },
                    error:function (XMLHttpRequest, textStatus, errorThrown) {
                        console.log("xxxxxxxxxxxxxxxx");
                    }
            
        })
    });
</script>
