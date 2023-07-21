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













