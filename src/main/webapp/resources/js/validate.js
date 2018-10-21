/*function validateLiAnForm(){
	var weituohao = document.getElementById("weituohao").value;
	var xiangguanjuanhao = document.getElementById("xiangguanjuanhao").value;
	var heyitingheyiriqi = document.getElementById("heyitingheyiriqi").value;
	var jingbanren = document.getElementById("jingbanren").value;
	var jiaobanriqi = document.getElementById("jiaobanriqi").value;
	var lianshenpiren = document.getElementById("lianshenpiren").value;
	if(weituohao == ""){
		alert("请输入委托号");
	}
	if(xiangguanjuanhao == ""){
		alert("请输入相关卷号");
	}
	if(heyitingheyiriqi == ""){
		alert("请输入合议庭合议日期");
	}
	if(jingbanren == ""){
		alert("请输入经办人");
	}
	if(jiaobanriqi == ""){
		alert("请输入交办日期");
	}
	if(lianshenpiren == ""){
		alert("请输入立案审批人");
	}
}

function validateJieAnForm(){
	var weituohao = document.getElementById("weituohao").value;
	var xiangguanjuanhao = document.getElementById("xiangguanjuanhao").value;
	var heyitingheyiriqi = document.getElementById("heyitingheyiriqi").value;
	var anjianxingzhi = document.getElementById("anjianxingzhi").value;
	var jieanriqi = document.getElementById("jieanriqi").value;
	if(weituohao == ""){
		alert("请输入委托号");
	}
	if(xiangguanjuanhao == ""){
		alert("请输入相关卷号");
	}
	if(heyitingheyiriqi == ""){
		alert("请输入合议庭合议日期");
	}
	if(anjianxingzhi == ""){
		alert("请输入案件性质");
	}
	if(jieanriqi == ""){
		alert("请输入结案日期");
	}
}*/


/*确保在立案的前提下，打开结案界面*/
function isJieAn(XLH,SFLA){
	if(SFLA=="是"){
		window.location.href = "showJiean?id="+XLH;
	}else{
		alert("未立案，不能结案");
	}
}
/*确认是否删除*/
function confirmDelete(XLH){
	var r=confirm("是否删除？");
	if(r==true){
        alert("删除成功！")
		window.location.href = "deleteCase.do?id="+XLH;

	}else{
		return false;
	}
}
/*
function dateFormat(longTypeDate){
    var dateType = "";
    var date = new Date();
    date.setTime(longTypeDate);
    dateType = date.getFullYear()+"-"+getMonth(date)+"-"+getDay(date);//yyyy-MM-dd格式日期
    return dateType;
}
*/
function isNull(date){
	if (date==null){
		return "";
	}
	else return date;
}
