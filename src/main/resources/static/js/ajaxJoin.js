//이메일 체크 중보이면-> 이메일 다시 작성

$('#emailCheckedBtn').on('click',emailCheckedFn);
function emailCheckedFn(){
const data={
  'email':$('#email').val()
};
  $.ajax({
    type:"GET",
    url:"/ajax/emailChecked",
    data:data,
    success:function(res){
      alert("Ajax정상 실행 ")
        if(res==1){
          alert("중복이메일 입니다. 다시 이메일을 입력하세요")
          $('#email').focus();
          return false;
        }
         alert("등록가능한 이메일 입니다.")
     },
    error:function(){
             alert("Faill!!");
     }

  });
}

$('#joinBtn').on('click',joinBtnFn);

function joinBtnFn(event){
event.preventDefault();

const data={
  'email':$('#email').val(),
  'name':$('#name').val(),
};
  $.ajax({
    type:"Post",
    url:"/ajax/join",
    data:data,
    success:function(res){
      alert("Ajax정상 실행 ")
        if(res==1){
          alert("회원가입 성공")
        }else{
         alert("회원가입 실패")
        }
     },
    error:function(){
             alert("Faill!!");
     }
  });
}













