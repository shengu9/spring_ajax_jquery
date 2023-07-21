package org.spring.ajaxpj2.controller;

import org.spring.ajaxpj2.dto.AjaxMemberDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
  @GetMapping({"","/index"})
  public String index(){
    return "ajax/index";
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
