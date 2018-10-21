<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>司法拍卖系统</title>
<link type="text/css" rel="stylesheet" href="./resources/css/main.css" />
<link href="./resources/css/login.css" rel="stylesheet" type="text/css" />
<link href="./resources/css/querymain.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./resources/js/querymain.js"></script>
</head>

<body>
检索
    <form action="querymain">
		<select name="queryselect">
			<option value="AY">案由</option>
			<option value="YSAJXGAJH">移送案件相关案卷号</option>
			<option value="WTH">委托号</option>
			<option value="">督办员</option>
			<option value="SQFDSRMC">申请方当事人</option>
			<option value="">督办期限</option>
	        <option value="JARQ">结案日期</option>
	        <option value="SABD">涉案标的</option>
	        <option value="">鉴定费</option>
	        <option value="">选定方式</option>
	        <option value="">审批日期</option>
	        <option value="YSR">移送人</option>
	        <option value="YSRQ">移送日期</option>
	        <option value="LASPR">立案审批人</option>
	        <option value="">委托鉴定机构名称</option>
	        <option value="SFJA">是否结案</option>
	        <option value="">tjflzl</option>
		</select>
		<input type="text" readonly="readonly" value="包含">
		<input type="text" name="select">
		<!-- <button type="button" onclick="querymain()">确定</button> -->
		<button type="submit">确定</button>
		<button type="button" onClick="location.href='main'">返回</button>
	</form>
	
	
	<div class="table_div">
		<div class="div_clear">
			<div class="left_top"></div>
			<div class="center_top">
				<div style="float: left">
					<img src="./tab/images/tb.gif" width="16px" height="16px"
						style="vertical-align: middle" />
				</div>
				<p style="float: left; font-weight: bold; color: red">司法拍卖系统</p>
				<div style="float: right; padding-right: 6px">

					<img width='16' height='16' src="./resources/sfpmImages/add.gif"
						style="vertical-align: middle" /> <a href="addNewCase">新增</a>&nbsp;<!--  <img
						width='16' height='16' src="./resources/sfpmImages/modify.gif"
						style="vertical-align: middle" /> <a href="#">修改</a>&nbsp; <img
						width='16' height='16' src="./resources/sfpmImages/delete.gif"
						style="vertical-align: middle" /> <a href="#">删除</a> -->

				</div>
			</div>
			<div class="right_top"></div>
		</div>
		<div class="div_clear">
			<div class="left_center"></div>
			<div class="center_center">
				<div class="table_content">
					<table cellspacing="0px" cellpadding="0px">
						<thead>
							<tr>
								<th width="4%">已立案</th>
								<th width="4%">已结案</th>
								<th width="8%">案由</th>
								<th width="15%">移送案件相关卷案号</th>
								<th width="4%">移送人</th>
								<th width="8%">移送日期</th>
								<th width="15%">委托号</th>
								<th width="6%">立案审批人</th>
								<th width="6%">立案日期</th>
								<th width="4%">督办员</th>
								<th width="8%">申请方办事人</th>
								<th width="8%">委托类型</th>
								<th width="10%" style="border-right: none">操作</th>
							</tr>
						</thead>

						<tbody>
						<c:forEach items="${auctionList }" var="auction"> 
							<tr>
								<td width="4%">${auction.SFLA }</td>
								<td width="4%">${auction.SFJA }</td>
								<td width="8%">${auction.AY }</td>
								<td width="15%">(2014)津高刑他字第0001号</td>
								<td width="4%">王艳君</td>
								<td width="8%">${fn:substring(auction.YSRQ,0,10) }</td>
								<td width="15%">${auction.WTH }</td>
								<td width="6%">${auction.LASPR }</td>
								<td width="6%">${fn:substring(auction.LARQ,0,10) }</td>
								<td width="4%"></td>
								<td width="8%"></td>
								<td width="8%"></td>
								<td width="10%" style="border-right: none">
								<a href="showLian?id=${auction.XLH }">立案</a>&nbsp;
								<a href="showJiean?id=${auction.XLH }">结案</a>&nbsp;
								<a href="deleteCase.do?id=${auction.XLH }">删除</a></td>
							</tr>
							</c:forEach>


						</tbody>
					</table>
				</div>
			</div>
			<div class="right_center"></div>
		</div>
		<div class="div_clear">
			<div class="left_bottom"></div>
			<div class="center_bottom" style="float: left">
                
				<div style="float: right; padding-right: 5px">
				共有&nbsp;${totalCount }&nbsp;条记录
					<input type="button" value="首页" /> <input type="button" value="上页" />
					<input type="button" value="下页" /> <input type="button" value="尾页" />
					跳转到 <input type="text" size="1" /> <input type="button" value="跳转" />
				</div>
			</div>
			<div class="right_bottom"></div>
		</div>
	</div>
	<!-- <div class="loginbm">版权所有 2018 南京大学</div> -->
	<footer><p align="center">版权所有 2018 南京大学</p></footer>
</body>
</html>