$('#ajax1').on('click',ajax1Fn);
function ajax1Fn(){
  $.ajax({
    type:'GET',
    url:'/ajax/ajax1',
    success:function(res){
      alert('ajax Success!!')
      console.log(res);
    },
    error:function(){
      console.log('Faill');
    }
  });
}

$('#ajax2').on('click',ajax2Fn);

function ajax2Fn(){
  $.ajax({
    type:"POST",
    url:"/ajax/ajax2",
    success:function(res){
      alert("Success!!");
      console.log(res);
    },
    error:function(){
     alert("Faill!!");
    }
  });
}

$('#ajax3').on('click',ajax3Fn);

function ajax3Fn(){
  $.ajax({
     type:"GET",
     url:"/ajax/ajax3",
     data:{ 'name':'m1','email':'m1eamil' },
     success:function(res){
       alert("Success!!");
        console.log(res);
     },
     error:function(){
        alert("Faill!!");
     }
  });
}


$('#ajax4').on('click',ajax4Fn);

function ajax4Fn(){
  $.ajax({
     type:"POST",
     url:"/ajax/ajax4",
     data:{ 'name':'m1','email':'m1eamil' },
     success:function(res){
       alert("Success!!");
        console.log(res);
     },
     error:function(){
        alert("Faill!!");
     }
  });
}

$('#ajax5').on('click',ajax5Fn);

function ajax5Fn(){
  $.ajax({
     type:"POST",
     url:"/ajax/ajax5",
     data:{ 'name':'m1','email':'m1eamil' },
     success:function(res){
       alert("Success!!");
        console.log(res);
     },
     error:function(){
        alert("Faill!!");
     }
  });
}


$('#ajax6').on('click',ajax6Fn);

function ajax6Fn(){
  $.ajax({
     type:"POST",
     url:"/ajax/ajax6",
     data:{ 'name':'m1','email':'m1eamil' },
     success:function(res){
//     {
//         "id": null,
//         "name": "m1",
//         "email": "m1eamil",
//         "createTimme": null,
//         "updateTime": null
//     }
       alert("Success!!");
        console.log(res);
        console.log(res.name);
        console.log(res.email);

        $('.name').text(res.name);
        $('.email').text(res.email);
     },
     error:function(){
        alert("Faill!!");
     }
  });
}

$('#ajax7').on('click',ajax7Fn);

function ajax7Fn(){
  $.ajax({
     type:"GET",
     url:"/ajax/ajax7",
//     data:{ 'name':'m1','email':'m1eamil' },
     success:function(res){
       alert("Success!!");
        console.log(res);
      let data="";
        for(let i in res){
            console.log(res[i]);
            data+="<tr> ";
              data+="<td>"+res[i].id+"</td>";
              data+="<td>"+res[i].name+"</td>";
              data+="<td>"+res[i].email+"</td>";
            data+="</tr>";
        }
        data+="";
        console.log(data);

//        $('.rs2').html(data);
//        $('.rs2').append(data);
      $('.rs3').html(data);
     },
     error:function(){
        alert("Faill!!");
     }
  });
}


$('#ajax8').on('click',ajax8Fn);

function ajax8Fn(){
const data={
'name':'m1','email':'m1eamil'
};
  $.ajax({
     type:"POST",
     url:"/ajax/ajax8",
     data:JSON.stringify(data),   // JSON
     contentType:"application/json",// JSON
     success:function(res){
       alert("Success!!");
        console.log(res);
     },
     error:function(){
        alert("Faill!!");
     }
  });
}


$('#ajax9').on('click',ajax9Fn);

function ajax9Fn(){
const data={
'name':'m1','email':'m1eamil'
};
  $.ajax({
     type:"POST",
     url:"/ajax/ajax9",
     data:JSON.stringify(data),   // JSON
     contentType:"application/json",// JSON
     success:function(res){
       alert("Success!!");
        console.log(res);
     },
     error:function(){
        alert("Faill!!");
     }
  });
}














