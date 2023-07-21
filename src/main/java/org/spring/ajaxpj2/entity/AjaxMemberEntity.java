package org.spring.ajaxpj2.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.spring.ajaxpj2.dto.AjaxMemberDto;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ajax_tb_01")
public class AjaxMemberEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ajax_member_id")
  private Long id;

  @Column(name = "member_name", nullable = false)
  private String name;

  @Column(name = "member_email", nullable = false)
  private String email;

  @CreationTimestamp
  @Column(updatable = false)
  private LocalDateTime createTime;// create_time

  @UpdateTimestamp
  @Column(insertable = false)
  private LocalDateTime updateTime;

  // Dto-> Entity
  public static AjaxMemberEntity toAjaxMemberEntity(AjaxMemberDto ajaxMemberDto) {
    AjaxMemberEntity ajaxMemberEntity=new AjaxMemberEntity();
    ajaxMemberEntity.setName(ajaxMemberDto.getName());
    ajaxMemberEntity.setEmail(ajaxMemberDto.getEmail());
    return ajaxMemberEntity;

  }
}
