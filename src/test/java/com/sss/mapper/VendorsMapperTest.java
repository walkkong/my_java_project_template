package com.sss.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class VendorsMapperTest {

    @Resource
    private VendorsMapper vendorsMapper;

    @Test
    public void test() {
//        vendorsMapper.insert(Vendors.builder().vendId("57474").vendName("dsadadadsa").vendAddress("dsadadadsa").build());
        vendorsMapper.selectByPrimaryKey("57474");
    }
}