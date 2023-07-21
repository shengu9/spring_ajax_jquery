package org.spring.ajaxpj2.controller;

import lombok.RequiredArgsConstructor;
import org.spring.ajaxpj2.dto.AjaxMemberDto;
import org.spring.ajaxpj2.service.AjaxMemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ajax")
@RequiredArgsConstructor
public class AjaxController {

  private final AjaxMemberService ajaxMemberService;


  @GetMapping({"","/index"})
  public String index(){
    return "ajax/index";
  }
  @GetMapping({"","/join"})
  public String join(){
    return "ajax/join";
  }


  @GetMapping("/emailChecked")
  public @ResponseBody String emailChecked(
          @RequestParam("email") String email) throws IOException {

     String rs= ajaxMemberService.emailChecked(email);

     return rs;
  }

  @PostMapping("/join")
  public @ResponseBody String joinPost(
          @ModelAttribute AjaxMemberDto ajaxMemberDto){
    String rs= ajaxMemberService.memberInsert(ajaxMemberDto);

    return rs;
  }

  @GetMapping("/test")
  public String test(){
    return "ajax/ajaxTest";
  }
  @GetMapping("/ajax1")
  public @ResponseBody String ajax1(){
    return "ajax1반환값 ";
  }
  @PostMapping("/ajax2")
  public @ResponseBody String ajax2(){
    return "ajax2반환값";
  }
  @GetMapping("/ajax3")
  public @ResponseBody String ajax3(
                      @RequestParam("name") String name,
                      @RequestParam("email") String email ){
          String rs="이름: "+name+", 이메일 : "+ email;
    return rs;
  }
  @PostMapping("/ajax4")
  public @ResponseBody String ajax4(
          @RequestParam("name") String name,
          @RequestParam("email") String email ){
    String rs="이름: "+name+", 이메일 : "+ email;
    return rs;
  }
  @PostMapping("/ajax5")
  public @ResponseBody String ajax5(
          @ModelAttribute AjaxMemberDto ajaxMemberDto){
    // 회원가입 , 글쓰기, 상품등록 -> 성공, 실패
    return ajaxMemberDto.getEmail()+", "+ajaxMemberDto.getName();
  }
  @PostMapping("/ajax6")
  public @ResponseBody AjaxMemberDto ajax6(
          @ModelAttribute AjaxMemberDto ajaxMemberDto){
    // 회원, 상품, 게시글 조회
    return ajaxMemberDto;

  }

  @GetMapping("/ajax7")
  public @ResponseBody List<AjaxMemberDto> ajax7(){
    // 회원목록, 게시글목록, 상품목록...
    List<AjaxMemberDto> list=new ArrayList<>();
//    list.add(AjaxMemberDto.builder().name("m1").email("m1@mmddd").build() );
    AjaxMemberDto ajaxMemberDto=new AjaxMemberDto();
    ajaxMemberDto.setEmail("m1@mmddd");
    ajaxMemberDto.setName("m1");

    AjaxMemberDto ajaxMemberDto2=new AjaxMemberDto();
    ajaxMemberDto2.setEmail("m2@mmddd");
    ajaxMemberDto2.setName("m2");

    list.add(ajaxMemberDto);
    list.add(ajaxMemberDto2);
    return list;
  }

  @PostMapping("/ajax8")
  public @ResponseBody AjaxMemberDto ajax8(
                        @RequestBody AjaxMemberDto ajaxMemberDto){
    System.out.println(ajaxMemberDto);
    System.out.println(ajaxMemberDto.getName());
    System.out.println(ajaxMemberDto.getEmail());

    return ajaxMemberDto;
  }

  @PostMapping("/ajax9")
  public ResponseEntity ajax9(@RequestBody AjaxMemberDto ajaxMemberDto){
    // return타입+HTTP상태
    return new ResponseEntity<>(ajaxMemberDto,HttpStatus.OK);
  }


/*  @GetMapping("/ajax2")
  public @ResponseBody List<String> ajax2(){
    List<String> list=new ArrayList<>();
    list.add("java");
    list.add("html");
    list.add("javascript");
    return list;
  }
  @GetMapping("/ajax3")
  public @ResponseBody Map<String,String> ajx3(){

    Map<String,String> map=new HashMap<>();

    map.put("1","map1");
    map.put("2","map2");
    map.put("3","map3");
    return map;
  }*/





















}
