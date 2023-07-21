package org.spring.ajaxpj2.repository;

import org.spring.ajaxpj2.entity.AjaxMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AjaxMemberRepository extends JpaRepository<AjaxMemberEntity,Long> {
}
