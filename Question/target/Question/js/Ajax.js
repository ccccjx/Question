window.onload = function () {
    WeForecast();
}

function WeForecast() {
    //document.getElementsByClassName('title')[0] 表示获取一个对象，不是数组
    var oTitle = document.getElementsByClassName('title');
    var oSelection1=document.getElementsByClassName("selection1");
    var oSelection2=document.getElementsByClassName("selection2");
    var oSelection3=document.getElementsByClassName("selection3");
    var oSelection4=document.getElementsByClassName("selection4");
    var oSelection5=document.getElementsByClassName("selection5");
    var oSelection6=document.getElementsByClassName("selection6");
    var oSelection7=document.getElementsByClassName("selection7");
    var oSelection=new Array(oSelection1,oSelection2,oSelection3,oSelection4,oSelection5,oSelection6,oSelection7);

    var q1=document.getElementsByClassName("q1");
    var q2=document.getElementsByClassName("q2");
    var q3=document.getElementsByClassName("q3");
    var q4=document.getElementsByClassName("q4");
    var q5=document.getElementsByClassName("q5");
    var q6=document.getElementsByClassName("q6");
    var q7=document.getElementsByClassName("q7");
    var oQ=new Array(q1,q2,q3,q4,q5,q6,q7);
    function ajax (url, fnSucc, fnFaild) {

        //创建Ajax对象
        var oAjax = new XMLHttpRequest();

        //连接服务器
        oAjax.open('GET', url, true);

        //发送请求
        oAjax.send();

        //接收服务器的返回
        oAjax.onreadystatechange = function () {

            if(oAjax.readyState == 4){

                if(oAjax.status==200){

                    fnSucc(oAjax.responseText);
                }
                else{

                    if(fnFaild)
                        fnFaild(oAjax.status);
                }

            }
        };
    }

    //调用ajax函数
    ajax ('http://127.0.0.1:8080/question/getTotalQuestion',fnSucc,function() {
        return undefined;
    });
    //获取问题
    function fnSucc(str) {
        var data = JSON.parse(str);
        console.log(data);
        var questionList = data.data;

        for (var i = 0;i<oTitle.length; i++) {
            oTitle[i].innerHTML=questionList[i].title.titleContent;
            //console.log(questionList[i].title.titleContent);
            for(var j=0;j<oSelection[i].length;j++){
                oQ[i][j].value=questionList[i].selections[j].selectionId;
                oSelection[i][j].innerHTML=questionList[i].selections[j].selectionsContent;
                //console.log(questionList[i].selections[j].selectionsContent);
            }
        }
    }


}





