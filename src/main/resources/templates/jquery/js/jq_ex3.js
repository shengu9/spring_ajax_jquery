let json1={ 'userId':'m1',
  'userPw':'1111',
  'userAge':11,
  'arr':['java','html','css','javascript'],
  'data':{
      'result':['a1','a2','a2']
    }
};

// userId=111&userPw=22&userEmail=11
// @RequestParam, @ModelAttribute
$('#userId').val();
$('#userPw').val();
$('#userEmail').val();

// { userId:111, userPw:22,userEmail:11}
// @RequestBody

let jsonData={
  'userId':$('#userId').val(),
  'userPw':$('#userPw').val(),
  'userEmail':$('#userEmail').val(),
};

JSON.stringify(jsonData);



















