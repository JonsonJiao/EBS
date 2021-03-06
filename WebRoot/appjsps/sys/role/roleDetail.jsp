<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.ceit.common.util.StaticSource"%>
<%@ page import="com.ceit.ebs.sys.vo.SysRoleVo"%>
<%
	String path = request.getContextPath();
	SysRoleVo sysRoleVo =(SysRoleVo)request.getAttribute("sysRoleVo");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>角色详情页面</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/resources/easyui-1.3.6/themes/default/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="<%=path %>/resources/easyui-1.3.6/themes/icon.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/resources/css/default.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/resources/css/common.css" />
	
	</head>
    <body class="easyui-layout" style="overflow-y: hidden"  scroll="no">
    	<form id="detailRoleForm" method="post">
			<table class="table_common"  align="center" width="800px">
				<tr>
					<td class="table_td1">角色名:</td>
			        <td class="alt">
			           <input style="height: 20" disabled="true" name="roleName" value="<%=sysRoleVo.getRoleName() == null ? "" : sysRoleVo.getRoleName() %>" class="text w150" type="text" />
			        </td>
				</tr>
				<tr>
					<td class="table_td1">角色别名:</td>
			        <td class="alt">
			           <input style="height: 20" disabled="true" name="roleAlias" value="<%=sysRoleVo.getRoleAlias() == null ? "" : sysRoleVo.getRoleAlias() %>" class="text w150" type="text" />
			        </td>
				</tr>
				<tr>
			    	<td class="table_td1">备注:</td>
			    	<td >
			    		<textarea name="comment" disabled="true" style="height:70px;width:550px;" class="text w150"><%=sysRoleVo.getComment() == null ? " " : sysRoleVo.getComment() %></textarea>
			    	</td>
			    </tr>
			</table>
		</form>
	
	<script type="text/javascript" src="<%=path %>/resources/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<%=path %>/resources/easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="<%=path %>/resources/easyui-1.3.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path %>/resources/js/esourcing.js"></script>
	<script type="text/javascript" src="<%=path %>/resources/js/esourcing.util.js"></script>
	<script type="text/javascript" src="<%=path %>/resources/js/jquery.serializeJSON.js"></script>
	</body>
</html>
