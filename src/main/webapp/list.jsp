<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>电影列表展示</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="jquery-1.8.3.js"></script>
<script type="text/javascript">
	var orderMethod ='${vo.orderMethod=="asc"?"desc":"asc"}';
	function myOrder(orderColumn) {
		location.href="list?orderColumn="+orderColumn+"&orderMethod="+orderMethod+"&"+$("#form1").serialize();
	}
</script>
</head>
<body>
<form action="list" method="post" id="form1">
   	电影名称:<input type="text" name="name" value="${vo.name }"><br>
  	电影导演:<input type="text" name="actor"  value="${vo.actor}"><br>
  	电影价格:<input type="text" name="p1" value="${vo.p1}">--<input type="text" name="p2" value="${vo.p2}"><br>
  	电影时长:<input type="text" name="l1" value="${vo.l1}">--<input type="text" name="l2" value="${vo.l2}"><br>
  	上映时间:<input type="text" name="up1" value="${vo.up1}">--<input type="text" name="up2" value="${vo.up2}"><br>
  	<button>查询</button>
</form>
<table>
	<tr>
		<td></td>
		<td>编号</td>
		<td>名称</td>
		<td>作者</td>
		<td><a href="javascript:myOrder('price')">价格</a></td>
		<td><a href="javascript:myOrder('uptime')">上映时间</a></td>
		<td><a href="javascript:myOrder('longtime')">时长</a></td>
		<td>地区</td>
		<td>状态</td>
		<td>年份</td>
		<td>操作
			<button onclick="add()">添加</button>
		</td>
	</tr>
	<c:forEach items="${list}" var="m">
	<tr>
		<td></td>
		<td>${m.id}</td>
		<td>${m.name}</td>
		<td>${m.actor}</td>
		<td>${m.price}</td>
		<td>${m.uptime}</td>
		<td>${m.longtime}</td>
		<td>${m.area}</td>
		<td>${m.status=='1'?'即将上映':m.status=='2'?'正在热映':'已经下架'}</td>
		<td>${m.year}</td>
		<td>
			<button>修改</button>
			<button>删除</button>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>