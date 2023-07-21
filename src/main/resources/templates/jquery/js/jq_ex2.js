$('#userId').val();
$('#userPw').val();
$('#email').val();
$('input[name=userId]');// name=userId

$('#idChecked').on('click',idCheckedFn);

function idCheckedFn(){
  if($('#userId').val()=='m1'){
    alert('아이디가 존재 합니다.')
    const data='아이디가존재합니다';
    $('#result').text(data);
    return false;
  }
}
$('#joinBtn').on('click',joinFn);
function joinFn(event){
  event.preventDefault();

  const userId=$('#userId').val();
  const userPw=$('#userPw').val();
  const userEmail=$('#userEmail').val();
    // tr, td이용, .html()
    const data=`
      <tr>
        <td>${userId}</td>
        <td>${userPw}</td>
        <td>${userEmail}</td>
      </tr>
    `;
  const rs=true;
  if(rs==true){
      alert("OK");
      $('.tbody').html(data);   // reset
//      $('.tbody').append(data);// 추가
  }

}

console.log("=====================================")
// each(function(index,el){}  <-- 리스트 조회
let arr=["java","spring","oracle","mysql","html","css"];
$.each(arr,function(index,el){
  console.log(el);
});

console.log("=====================================")
$('input').each(function(index,el){
  console.log(el);
});



















