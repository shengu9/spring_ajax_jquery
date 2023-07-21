package org.spring.ajaxpj2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ajax")
public class ajaxController {
  @GetMapping({"","/index"})
  public String index(){
    return "ajax/index";
  }
  @GetMapping("/ajax1")
  public @ResponseBody String ajax1(){
    return "ajax1반환값 ";
  }

  @GetMapping("/ajax2")
  public @ResponseBody List<String> ajax2(){
    List<String> list=new ArrayList<>();
    list.add("java");
    list.add("html");
    list.add("javascript");
    return list;
  }





















}
