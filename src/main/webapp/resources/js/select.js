//  查询界面的第一列select的id计数器
var select1IdCount=2;
var input1IdCount=2;
//查询界面的查询框的id计数器
var input2IdCount=2;
//查询界面的第四列select(and || or)的id计数器
var select2IdCount=2;
$(function() {
    var name = $( "#name" ),
      email = $( "#email" ),
      password = $( "#password" ),
      allFields = $( [] ).add( name ).add( email ).add( password ),
      tips = $( ".validateTips" );
 
 
    $( "#dialog-form" ).dialog({
      autoOpen: false,
      height: 300,
      width: 520,
      resizable:false,
      modal: true,
      buttons: {
          "增加": function() {

              var cont = document.getElementById("fieldset");
              var space = document.createTextNode(" ");
              var newSelect1 = document.createElement("select");
              var newInput1 = document.createElement("input");
              var newInput2 = document.createElement("input");
              var newSelect2 = document.createElement("select");

              newSelect1.setAttribute("id","select1Id"+select1IdCount++);
              /*为新建的<select>添加option*/
              newSelect1.add(new Option("案由","AY"));
              newSelect1.add(new Option("移送案件相关案卷号","YSAJXGAJH"));
              newSelect1.add(new Option("委托号","JDH"));
              newSelect1.add(new Option("督办员","JDRY"));
              newSelect1.add(new Option("申请方当事人","SQFDSRMC"));
              newSelect1.add(new Option("督办期限","DBQX"));
              newSelect1.add(new Option("结案日期","JARQ"));
              newSelect1.add(new Option("涉案标的","SABD"));
              newSelect1.add(new Option("鉴定费",""));
              newSelect1.add(new Option("选定方式",""));
              newSelect1.add(new Option("审批日期","SPRQ"));
              newSelect1.add(new Option("移送人","YSR"));
              newSelect1.add(new Option("移送日期","YSRQ"));
              newSelect1.add(new Option("立案审批人","LASPR"));
              newSelect1.add(new Option("委托鉴定机构名称","WTJDJGMC"));
              newSelect1.add(new Option("是否结案","SFJA"));
              newSelect1.add(new Option("tjflzl",""));

              newInput1.setAttribute("id","input1Id"+input1IdCount++);
              newInput1.setAttribute("type","text");
              newInput1.setAttribute("size",2);
              newInput1.setAttribute("readonly","readonly");
              newInput1.setAttribute("value"," 包含");

              newInput2.setAttribute("id","input2Id"+input2IdCount++);
              newInput2.setAttribute("size",30);
              newInput2.setAttribute("type","text");
              newInput2.setAttribute("class","text ui-widget-content ui-corner-all");

              newSelect2.setAttribute("id","select2Id"+select2IdCount++);
              newSelect2.add(new Option("且","且"));
              newSelect2.add(new Option("或","或"));

              cont.appendChild(newSelect1);
              cont.appendChild(newInput1);
              cont.appendChild(space);
              cont.appendChild(newInput2);
              cont.appendChild(space);
              cont.appendChild(newSelect2);

    	},
    	"删除": function() {
            while(select1IdCount>2 && input1IdCount>2 && input2IdCount>2 && select2IdCount>2){
                var select1 = document.getElementById('select1Id'+(--select1IdCount));
                var input1 = document.getElementById('input1Id'+(--input1IdCount));
                var input2 = document.getElementById('input2Id'+(--input2IdCount));
                var select2 = document.getElementById('select2Id'+(--select2IdCount));
                select1.parentNode.removeChild(select1);
                input1.parentNode.removeChild(input1);
                input2.parentNode.removeChild(input2);
                select2.parentNode.removeChild(select2);
                break;
            }
    		
    	},
        "确定": function() {
            /*$( "#searchForm" ).submit(function(){
                alert("submitted");
            });*/

          	var count=select1IdCount-1;
          	var list=new Array();
          	for (var i=1;i<=count;i++){
                var obj={
                    select1:$("#select1Id"+i).val(),
                    input2:$("#input2Id"+i).val(),
                    select2:$("#select2Id"+i).val()
                }
                list.push(obj)
            }
          	$.ajax({
				type:"POST",
				url:"search.do",
				data:JSON.stringify(list),
                //data:{list:list},
                contentType:"application/json",
                dataType : "json",
                success : function(data) {
                    console.log(data);
                    $("tbody").empty();

                    $.each(data, function(idx, obj) {

                        var trs="";
                        trs="<tr><td width=\"20px\">"+obj.sfla+"</td><td width=\"20px\">"+obj.sfja+"</td><td width=\"80px\">"+obj.ay+
                            "</td><td width=\"100px\">"+obj.ysajxgajh+"</td><td  width=\"30px\">"+obj.ysr+"</td><td width=\"30px\">"+
                            isNull(obj.ysrq)+"</td><td width=\"150px\">"+obj.jdh+"</td><td width=\"30px\">"+obj.laspr+"</td><td width=\"30px\">"+
                            isNull(obj.sprq)+"</td><td width=\"30px\">"+isNull(obj.jdry)+"</td><td width=\"30px\">"+obj.sqfdsrmc+"</td><td width=\"60px\">"+
                            isNull(obj.wtlb)+"</td><td width=\"80px\">"+isNull(obj.wtjdjgmc)+"</td><td width=\"30px\">"+isNull(obj.dbqx)+"</td><td width=\"30px\">"+
                            isNull(obj.sabd)+"</td><td width=\"30px\">"+obj.jdf+"</td><td width=\"30px\">"+isNull(obj.xdfs)+"</td><td width=\"30px\">"+
                            isNull(obj.jarq)+"</td><td width=\"20px\">"+obj.sfja+"</td><td width=\"40px\" style=\"border-right: none\">"+
                            "<a href=\"showLian?id="+obj.xlh+"\">立案</a>&nbsp;&nbsp;&nbsp;"+
                            "<a href=\"javascript:void(0)\" onclick=\"isJieAn("+obj.xlh+","+"\'"+obj.sfla+"\'"+")\">结案</a>&nbsp;&nbsp;&nbsp;"+
                            "<a href=\"javascript:void(0)\" onclick=\"confirmDelete("+obj.xlh+")\">删除</a></td></tr>";
                        $("tbody").append(trs);


                    });



                },
                error:function () {
                    alert("error")
                }

			})
            $( this ).dialog( "close" );



        },
        "取消": function() {
          $( this ).dialog( "close" );
        }
      },
      /*close: function() {
        allFields.val( "" ).removeClass( "ui-state-error" );
      }*/
    });
 
    $( "#search" )
      .button()
      .click(function() {
        $( "#dialog-form" ).dialog( "open" );
      });
  });