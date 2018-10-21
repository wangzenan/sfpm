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
<link type="text/css" rel="stylesheet" href="./resources/css/login.css" />
<script type="text/javascript" src="./resources/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="./resources/js/jquery-ui.min.js"></script>
<link type="text/css" rel="stylesheet" href="./resources/css/jquery-ui.min.css" />
<link type="text/css" rel="stylesheet" href="./resources/css/jquery-ui.theme.min.css" />
<script type="text/javascript" src="./resources/js/validate.js" charset="UTF-8"></script>
<script type="text/javascript" src="./resources/js/select.js" charset="UTF-8"></script>

</head>

<body>

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

					<!-- 查询开始 -->
					<button id="search" style="background:none;border:none">点击查询</button>&nbsp;&nbsp;&nbsp;
					<div id="dialog-form" title="检索">
						<!-- <p class="validateTips">点击选择查询条件</p> -->

						<form id="searchForm" action="search.do" method="post" enctype="multipart/form-data">

							<fieldset id="fieldset">
								<select id="select1Id1">
									<option value="AY">案由</option>
									<option value="YSAJXGAJH">移送案件相关案卷号</option>
									<option value="JDH">委托号</option>
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
								<input id="input1Id1" type="text" readonly="readonly" value="包含" size=1>
								<input id="input2Id1" type="text" size=30 class="text ui-widget-content ui-corner-all">
								<select id="select2Id1">
									<option>且</option>
									<option>或</option>
								</select>
							</fieldset>

						</form>
					</div>
					<!-- 查询结束 -->
					
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
								<th width="20px">已立案</th>
								<th width="20px">已结案</th>
								<th width="80px">案由</th>
								<th width="100px">移送案件相关卷案号</th>
								<th width="30px">移送人</th>
								<th width="30px">移送日期</th>
								<th width="150px">委托号</th>
								<th width="30px">立案审批人</th>
								<th width="30px">立案日期</th>
								<th width="30px">督办员</th>
								<th width="30px">申请方办事人</th>
								<th width="60px">委托类别</th>
								<th width="80px">委托机构名称</th>
								<th width="30px">督办期限</th>
								<th width="30px">涉案标的</th>
								<th width="30px">鉴定费</th>
								<th width="30px">选定方式</th>
								<th width="30px">结案日期</th>
								<th width="20px">是否结案</th>
								<th width="40px" style="border-right: none">操作</th>
							</tr>
						</thead>

						<tbody>
						<c:forEach items="${auctionList }" var="auction"> 
							<tr>
								<td width="20px" class="SFLA">${auction.sfla }</td>
								<td width="20px" class="SFJA">${auction.sfja }</td>
								<td width="80px">${auction.ay }</td>
								<td width="100px">${auction.ysajxgajh }</td>
								<td width="30px">${auction.ysr }</td>
								<td width="30px">${fn:substring(auction.ysrq,0,10) }</td>
								<td width="150px">${auction.jdh }</td>
								<td width="30px">${auction.laspr }</td>
								<td width="30px">${fn:substring(auction.sprq,0,10) }</td><!--审批日期-->
								<td width="30px">${auction.jdry}</td>
								<td width="30px">${auction.sqfdsrmc}</td>
								<td width="60px">委托类别</td>
								<td width="80px">${auction.wtjdjgmc}</td>
								<td width="30px">${auction.dbqx}</td>
								<td width="30px">${auction.sabd}</td>
								<td width="30px">鉴定费</td>
								<td width="30px">选定方式</td>
								<td width="30px">${fn:substring(auction.jarq,0,10) }</td>
								<td width="20px">${auction.sfja }</td>
								<td width="40px" style="border-right: none">
								<a href="showLian?id=${auction.xlh }">立案</a>&nbsp;&nbsp;&nbsp;
								<%--<a href="showJiean?id=${auction.XLH }">结案</a>&nbsp;&nbsp;&nbsp;
								<a href="deleteCase.do?id=${auction.XLH }" onclick="confirmDelete()">删除</a></td> --%>
                                <a href="javascript:void(0)" onclick="isJieAn(${auction.xlh },'${auction.sfla }')">结案</a>&nbsp;&nbsp;&nbsp;
								<a href="javascript:void(0)" onclick="confirmDelete(${auction.xlh })">删除</a></td>
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
                <div style="padding-right: 5px;text-align:center;">
                                                         已立案:${liAnCount }件&nbsp;未立案:${totalCount-liAnCount }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已结案:${jieAnCount }件&nbsp;未结案:${totalCount-jieAnCount }
                </div>
				<%-- <div style="float: right; padding-right: 5px">
				共有&nbsp;${totalCount }&nbsp;条记录
					<input type="button" value="首页" /> <input type="button" value="上页" />
					<input type="button" value="下页" /> <input type="button" value="尾页" />
					跳转到 <input type="text" size="1" /> <input type="button" value="跳转" />
				</div> --%>
			</div>
			<div class="right_bottom"></div>
		</div>
	</div>
	<!-- <div class="loginbm">版权所有 2018 南京大学</div> -->
	<footer><p align="center">版权所有 2018 南京大学</p></footer>
</body>
</html>