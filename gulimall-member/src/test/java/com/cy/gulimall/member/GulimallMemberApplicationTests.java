package com.cy.gulimall.member;

import com.cy.gulimall.member.entity.MemberEntity;
import com.cy.gulimall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    private MemberService memberService;

    @Test
    void contextLoads() {
        MemberEntity memberEntity=new MemberEntity();
        memberEntity.setUsername("chen");
        memberService.save(memberEntity);
        System.out.println("chenggonh");

    }

}
