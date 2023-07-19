package com.macro.mall.portal.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UmsMemberServiceTest {

    @Resource
    UmsMemberService umsMemberService;
    @Test
    void register() {
        String authCode = umsMemberService.generateAuthCode("18627906289");
        umsMemberService.register("lxc", "lxc", "18627906289", authCode);

    }
}
