<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>案件信息</title>
<script type="text/javascript"
	src="./resources/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="./resources/js/validate.js"></script>
<link rel="stylesheet" type="text/css"
	href="./resources/css/auction.css">
</head>
<body>
	<!-- <input type="text" onClick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})"> -->
	<h1>案件信息</h1>

	<form action="save.do">
	   <input type="hidden" name="xlh" value="${auction.xlh }">
		<table>
			<tr>
				<td colspan="3"><h3>--对外委托立案基本信息--</h3></td>
			</tr>
			<tr>
				<td width="5%"><label>案由:</label></td>
				<td><input type="text" name="ay" value="${auction.ay }"></td>
				<td align="right"><label>委托号:<font color="red">*</font></label></td>
				<td><input type="text" id="weituohao" name="jdh" value="${auction.jdh }"></td>
			</tr>
			<tr>
				<td><label>移送部门:</label></td>
				<td><input type="text" name="ysbm" value="${auction.ysbm }"></td>
				<td align="right"><label>移送人:</label></td>
				<td><input type="text" name="ysr" value="${auction.ysr }"></td>
				<td align="right"><label>电话:</label></td>
				<td><input type="text" name="dh" value="${auction.dh }"></td>
			</tr>
			<tr>
				<td nowrap="false"><label>相关卷号:<font color="red">*</font></label></td>
				<td colspan="2"><input type="text" style="width: 300px"
					id="xiangguanjuanhao" name="ysajxgajh" value="${auction.ysajxgajh }"></td>
				<td align="right"><label>合议庭合议日期:<font color="red">*</font></label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()"
					id="heyitingheyiriqi" name="hyzspsj" value="${fn:substring(auction.hyzspsj,0,10) }"></td>
			</tr>
			<tr>
				<td><label>案件名称:</label></td>
				<td colspan="10"><textarea name="ajmc">${auction.ajmc }</textarea></td>
			</tr>
			<tr>
				<td nowrap="false"><label>一方当事人:</label></td>
				<td><input type="text" name="sqfdsrmc" value="${auction.sqfdsrmc }"></td>
				<td align="right"><label>联系方式:</label></td>
				<td><input type="text" name="sqfdsrlxr" value="${auction.sqfdsrlxr }"></td>
			</tr>
			<tr>
				<td nowrap="false"><label>另一方当事人:</label></td>
				<td><input type="text" name="lyfdsrmc" value="${auction.lyfdsrmc }"></td>
				<td align="right"><label>联系方式:</label></td>
				<td><input type="text" name="lyfdsrlxr" value="${auction.lyfdsrlxr }"></td>
			</tr>
			<tr>
				<td><label>案情摘要:</label></td>
				<td colspan="10"><textarea name="aqzy">${auction.aqzy }</textarea></td>
			</tr>
			<tr>
				<td><label>送检材料:</label></td>
				<td colspan="10"><textarea name="sjcl">${auction.sjcl }</textarea></td>
			</tr>
			<tr>
				<td><label>委托事项:</label></td>
				<td colspan="10"><textarea name="wtsx">${auction.wtsx }</textarea></td>
			</tr>
			<tr>
				<td><label>涉案标的:</label></td>
				<td><input type="text" name="sabd" value="${auction.sabd }">万元</td>
				<td align="right"><label>鉴定基准日:</label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()" name="jdjzr" value="${fn:substring(auction.jdjzr,0,10) }"></td>
				<td align="right"><label>移送日期:</label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()" name="ysrq" value="${fn:substring(auction.ysrq,0,10) }"></td>
			</tr>
		</table>
		<br />
		<table>
			<tr>
				<td colspan="3">
					<h3>--结案信息--&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp--注意：以是否结案作为结案标志--</h3>
				</td>
			</tr>
			<tr>
				<td><label>案件性质:<font color="red">*</font></label></td>
				<td><input type="text" id="anjianxingzhi" name="ajxz" value="${auction.ajxz }"></td>
				<td align="right"><label>是否重新鉴定:</label></td>
				<td><input type="text" name="sfcx" value="${auction.sfcx }"></td>
				<td align="right"><label>成交价:</label></td>
				<td><input type="text" name="cjj" value="${auction.cjj }">万元</td>
			</tr>
			<tr>
				<td><label>评估拍卖价值:</label></td>
				<td><input type="text" name="pgpmjz" value="${auction.pgpmjz }">万元</td>
				<td align="right"><label>鉴定或拍卖结果:</label></td>
				<td><input type="text" name="jdhpmjg" value="${auction.jdhpmjg }"></td>
			</tr>
			<tr>
				<td><label>结案日期:<font color="red">*</font></label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()"
					id="jieanriqi" name="jarq" value="${fn:substring(auction.jarq,0,10) }"></td>
					<td align="right"><label>是否结案:</label></td>
					<td><input type="text"readonly="readonly" id="SFJA" name="sfja" value="${auction.sfja }"></td>
				<td><button type="button" onclick="jieAn()">点击结案</button></td>
				<td><button type="button">著录卡信息</button></td>
			</tr>
		</table>
		<br />
		<table>
			<tr>
				<td colspan="3"><h3>--结案后相关信息记录--</h3></td>
			</tr>
			<tr>
				<td nowrap="false"><label>庭审采信：</label></td>
				<td><input type="text" name="tscx" value="${auction.tscx }"></td>
				<td align="right" nowrap="false"><label>服务态度:</label></td>
				<td><input type="text" name="fwtd" value="${auction.fwtd }"></td>
				<td align="right" nowrap="false"><label>违规执业:</label></td>
				<td><input type="text" name="wgzy" value="${auction.wgzy }"></td>
				<td align="right" nowrap="false"><label>违规执业更换机构:</label></td>
				<td><input type="text" name="wgzyghjg" value="${auction.wgzyghjg }"></td>
			</tr>
			<tr>
				<td><label>委托事项备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注:</label></td>
				<td colspan="10"><textarea name="wtsxbz">${auction.wtsxbz }</textarea></td>
			</tr>
		</table>
		<!-- <button type="submit" onclick="validateJieAnForm()" formaction="save.do">保存</button> -->
		<input type="hidden" name="sfla" value="是" />
		<input type="hidden" name="jbrq" value="${auction.jbrq }" />
		<input type="hidden" name="laspr" value="${auction.laspr }" />
		<input type="hidden" name="sprq" value="${auction.sprq }" />
		<button type="submit">保存</button>
		<button type="button" onClick="location.href='main'">返回</button>
	</form>
<script>
function jieAn(){
	var jiean = document.getElementById("SFJA");
	jiean.value = "是";
}

</script>
</body>
</html>