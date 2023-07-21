//$('*').css('margin','0').css('padding','0');
$('*').css({'margin':'0','padding':'0'});  //전체
$('ul,li').css('list-style','none'); // 다중 선택
$('#parent').css({'width':'800px','border':'1px solid'}); // 아이디
$('#parent .nav').css('background-color','#cccccc');// 클래스, 하위
$('#parent .nav h1').css({'width':'100px','height':'40px','background-color':'#ffff00'});// 태그
$('.gnb').css('width','700px');// 클래스
$('.gnb>ul').css({'display':'flex','justify-content':'space-between'});// 자식
$('.gnb>ul>li').css({'flex':'1', 'background-color':'#ffff00' });// list
$('.gnb>ul>li').eq(0).css('background-color','#ff0000');// 리스트 0
$('.gnb>ul>li').eq(1).css('background-color','#000000');// 리스트1

// 이벤트
// 선택자.on

// 이벤트 구현 1
//$('.gnb>ul>li').eq(0).on('click', function(){  });
// 이벤트 구현 2
//$('.gnb>ul>li').eq(0).on('click', ()=>{   });


// 템플릿 리터널
const data=`
  <div>
    <ul>
      <li>아이디</li>
      <li>비빌번호</li>
      <li>이름</li>
      <li>이메일</li>
    </ul>
   </div>
` ;
$('.box').css({'width':'300px','height':'300px','border':'1px solid #ff0000'});
// 이벤트 구현 3
$('.gnb>ul>li').eq(1).on('click', fn1);
function fn1(){
  $('.box').html(data);

}
 $('.box').html();
$('h1.logo').text("텍스트");
$('h1.logo').text();

//이벤트 태그에 직접 설정
function btn1Fn(){
  alert("btn1Fn ");
}











