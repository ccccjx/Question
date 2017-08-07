

$(function(){
    var selectedIdList=[];
    $("#tijiao").click(function(e){
        e.preventDefault();
        selectedIdList.push($("input:checked[name=q1]").val());
        selectedIdList.push($("input:checked[name=q2]").val());
        selectedIdList.push($("input:checked[name=q3]").val());
        selectedIdList.push($("input:checked[name=q4]").val());
        selectedIdList.push($("input:checked[name=q5]").val());
        selectedIdList.push($("input:checked[name=q6]").val());

        $('input[name="q7"]:checked').each(function(){
            selectedIdList.push($(this).val());
        });


        $.ajax({
            url:"http://localhost:8080/Return/updateSelectionCount",
            //data: { "selectedIds": _list },
            data:{"selectedIdList":selectedIdList},
            dataType: "json",
            type: "POST",
            traditional: true,
            success:function (responseJSON) {
                console.log(1111);
                alert('Ok');
            }
        })
    })
})