<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"  %>
<!DOCTYPE html >
<html>
<head>
    <title>SpringMVC+Spring4+Hibernate5+EasyUI-1.51-HMES</title>
    <jsp:include page="inc.jsp"></jsp:include>
    <script type="text/javascript">
        var index_layout;
        $(function(){
            index_layout=$('#index_layout').layout({
                fit:true
            });
        });

    </script>
</head>
<!-- data-options="fit:true" -->
<body >

<div id="index_layout" data-options="fit:true">
    <jsp:include page="user/login.jsp"/>
    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
    <div data-options="region:'east',title:'日历',split:false" style="width:200px;"></div>
    <div data-options="region:'west',title:'功能导航',split:false" style="width:150px;">
        <div class="easyui-accordion" data-options="fit:true,border:false">
            <div title="权限管理" style="padding:10px;">
                权限 重
            </div>
            <div title="混练" data-options="selected:true" style="padding:10px;">
                content2
            </div>
            <div title="其它" style="padding:10px">
                content3
            </div>
        </div>
    </div>
    <div data-options="region:'center',border:false,title:'欢迎使用HMES示例系统'" style="padding:5px;background:#eee;"></div>
</div>
</body>

</html>