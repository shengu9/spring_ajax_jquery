package org.spring.ajaxpj2.service;

import lombok.RequiredArgsConstructor;
import org.spring.ajaxpj2.dto.AjaxMemberDto;
import org.spring.ajaxpj2.entity.AjaxMemberEntity;
import org.spring.ajaxpj2.repository.AjaxMemberRepository;
import org.springframework.stereotype.Service;

import java.io.IOError;
import java.io.IOException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AjaxMemberService {
  private  final AjaxMemberRepository ajaxMemberRepository;

  public String emailChecked(String email) throws IOException {
  // 이메일 확인 -> 조회한 이메일이 있는 레코드를 조회
   Optional<AjaxMemberEntity> optionalAjaxMemberEntity
           = ajaxMemberRepository.findByEmail(email);
   if(!optionalAjaxMemberEntity.isPresent()){
     //이메일이 존재 하지 않으면 "0"
     return "0";
   }
     //이메일이 존재 하지 않으면 "1"
     return "1";
  }

  public String memberInsert(AjaxMemberDto ajaxMemberDto) {

   Long memberId= ajaxMemberRepository.save(AjaxMemberEntity.toAjaxMemberEntity(ajaxMemberDto)).getId();
   Optional<AjaxMemberEntity> optionalAjaxMemberEntity= ajaxMemberRepository.findById(memberId);

   if(!optionalAjaxMemberEntity.isPresent()){
     return "0";
   }
    return "1";
  }
}
