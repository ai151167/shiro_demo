<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">

<title>goodsInfo</title>
<base href="${pageContext.request.contextPath}/">
<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.css" rel="stylesheet">

<link href="/css/zTreeStyle/zTreeStyle.css" rel="stylesheet">

</head>
<body>
	<div class="jumbotron" >
		<div class="row">
		<div class="col-md-4 col-md-offset-0">
		<h3>列表信息</h3>
		</div>
		<div class="col-md-4 col-md-offset-10">
		<h4>列表信息</h4>
		</div>
			<div class="col-md-12">
				<table class="table table-hover">
					<thead>
						<th>名称</th>
						<th>描述</th>
						<th>图片</th>
						<th>数量</th>
						<th>价格</th>
						<th>分类</th>
						<th>状态</th>
						<th>操作</th>
					</thead>
					<tbody>
					<c:if test="${not empty goodsInfos}">
						<c:forEach items="${goodsInfos}" var="goods">
							<tr>
								<td>${goods.goodsId}</td>
								<td>${goods.goodsName}</td>
								<td>${goods.goodsDesc}</td>
								<td>${goods.goodsImage}</td>
								<td>${goods.goodsCount}</td>
								<td>${goods.goodsPrice}</td>
								<td>${goods.SortName}</td>
								<td>${goods.goodsState}</td>
								<td>1</td>
							</tr>
						</c:forEach>
					</c:if>
					</tbody>
					<tfoot>
						<tr>
							<td>1</td>
							
						</tr>
					</tfoot>
				</table>
				<input type="text" id="count" value="${count}">
				<input type="text" id="pages" value="${pages}">
			</div>

		</div>

		<p>
			<a class="btn btn-lg btn-success" href="#" role="button">Get
				started today</a>
		</p>
	</div>

	<script src="/js/jquery-3.2.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
</body>
</html>