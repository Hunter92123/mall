package com.macro.mall.service;

import cn.hutool.json.JSONUtil;
import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.model.UmsAdmin;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UmsAdminServiceTest {

    @Resource
    private UmsAdminService umsAdminService;
    @Test
    void register() {

        UmsAdminParam umsAdminParam = new UmsAdminParam();
        umsAdminParam.setUsername("lxc").setPassword("lxc").setNickName("lxc");
        UmsAdmin umsAdmin = umsAdminService.register(umsAdminParam);
        log.info(JSONUtil.toJsonPrettyStr(umsAdmin));
    }
}
