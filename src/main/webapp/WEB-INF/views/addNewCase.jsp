<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>立案基本信息</title>
<script type="text/javascript"
	src="./resources/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="./resources/js/validate.js"></script>
<link rel="stylesheet" type="text/css"
	href="./resources/css/auction.css">
</head>
<body>
	<!-- <input type="text" onClick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})"> -->
	<h2>立案基本信息</h2>

	<form action="addNewCase.do">
		<table>
			<tr>
				<td colspan="3"><h3>--对外委托立案基本信息--</h3></td>
			</tr>
			<tr>
				<td><label>案由:</label></td>
				<td><input type="text" name="ay"></td>
				<td align="right"><label>委托号:<font color="red">*</font></label></td>
				<td><input type="text" id="weituohao" name="jdh"></td>
			</tr>
			<tr>
				<td><label>移送部门:</label></td>
				<td><input type="text" name="ysbm"></td>
				<td align="right"><label>移送人:</label></td>
				<td><input type="text" name="ysr"></td>
				<td align="right"><label>电话:</label></td>
				<td><input type="text" name="dh"></td>
			</tr>
			<tr>
				<td><label>相关卷号:<font color="red">*</font></label></td>
				<td><input type="text" id="xiangguanjuanhao" name="ysajxgajh"></td>
				<td align="right"><label>合议庭合议日期:<font color="red">*</font></label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()"
					id="heyitingheyiriqi" name="hyzspsj"></td>
			</tr>
			<tr>
				<td><label>案件名称:</label></td>
				<td colspan="10"><textarea name="ajmc"></textarea></td>
			</tr>
			<tr>
				<td><label>一方当事人:</label></td>
				<td><input type="text" name="sqfdsrmc"></td>
				<td align="right"><label>联系方式:</label></td>
				<td><input type="text" name="sqfdsrlxr"></td>
			</tr>
			<tr>
				<td><label>另一方当事人:</label></td>
				<td><input type="text" name="lyfdsrmc"></td>
				<td align="right"><label>联系方式:</label></td>
				<td><input type="text" name="lyfdsrlxr"></td>
			</tr>
			<tr>
				<td><label>案情摘要:</label></td>
				<td colspan="10"><textarea name="aqzy"></textarea></td>
			</tr>
			<tr>
				<td><label>送检材料:</label></td>
				<td colspan="10"><textarea name="sjcl"></textarea></td>
			</tr>
			<tr>
				<td><label>委托事项:</label></td>
				<td colspan="10"><textarea name="wtsx"></textarea></td>
			</tr>
			<tr>
				<td><label>涉案标的:</label></td>
				<td><input type="text" name="sabd">万元</td>
				<td align="right"><label>鉴定基准日:</label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()" name="jdjzr"></td>
				<td align="right"><label>移送日期:</label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()" name="ysrq"></td>
			</tr>
			<tr>
				<td><label>对外委托备注:</label></td>
				<td colspan="10"><textarea name="bz"></textarea></td>
			</tr>
		</table>
		<br />
		<table>
			<tr>
				<td colspan="4"><h3>--指定督办人和立案--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--注意：以是否有立案审批人作为立案标志--</h3></td>
			</tr>
			<tr>
				<td><label>经办人:<font color="red">*</font></label></td>
				<td width="50px"><input type="text" id="jingbanren" name="jdry"></td>
				<td align="right"><label>交办日期:<font color="red">*</font></label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()"
					id="jiaobanriqi" name="jbrq"></td>
			</tr>
			<tr>
				<td><label>协办人:</label></td>
				<td><input type="text" name="xbr"></td>
				<td align="right"><label>合议组其他人员:</label></td>
				<td colspan="2" width="200px"><input type="text"
					style="width: 340px" name="hyzcy"></td>
			</tr>
			<tr>
				<td><label>立案审批人:<font color="red">*</font></label></td>
				<td colspan="2" width="100px"><input type="text"
					id="lianshenpiren" name="laspr">(点立案自动生成)</td>
				<td align="right" width="50px"><label>立案日期:<font
						color="red">*</font></label></td>
				<td><input class="Wdate" type="text" onClick="WdatePicker()" name="sprq"></td>
			</tr>
		</table>
		<input type="hidden" name="SFLA" value="否" />
		<input type="hidden" name="SFJA" value="否" />
		<button type="submit" >保存</button>
		<button type="button" onClick="location.href='main'">返回</button>
	</form>
</body>
</html>