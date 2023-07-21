package org.spring.ajaxpj2;

import org.junit.jupiter.api.Test;
import org.spring.ajaxpj2.dto.AjaxMemberDto;
import org.spring.ajaxpj2.entity.AjaxMemberEntity;
import org.spring.ajaxpj2.repository.AjaxMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AjaxTest {

  @Autowired
  private AjaxMemberRepository ajaxMemberRepository;
  @Test
  void insert(){

    AjaxMemberDto ajaxMemberDto=new AjaxMemberDto();
    ajaxMemberDto.setName("m4");
    ajaxMemberDto.setEmail("m4@mai.com");

   AjaxMemberEntity ajaxMemberEntity
           =  AjaxMemberEntity.toAjaxMemberEntity(ajaxMemberDto);

    ajaxMemberRepository.save(ajaxMemberEntity);
  }










}
