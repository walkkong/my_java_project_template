package com.sss.web.service;

import com.sss.ormbase.autogenerator.model.Vendors;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VendorsServiceTest {

    @Resource
    private VendorsService vendorsService;

    @Test
    public void test() {
        vendorsService.insert(Vendors.builder().vendId("3444").vendName("dsadadadsa").vendAddress("dsadadadsa").build());
    }
}