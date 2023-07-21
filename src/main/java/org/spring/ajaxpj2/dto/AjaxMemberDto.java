package org.spring.ajaxpj2.dto;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AjaxMemberDto {

  private Long id;

  private String name;

  private String email;

  private LocalDateTime createTimme;

  private LocalDateTime updateTime;


}
