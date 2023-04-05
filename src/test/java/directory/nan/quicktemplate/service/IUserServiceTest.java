package directory.nan.quicktemplate.service;

import directory.nan.quicktemplate.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IUserServiceTest {

    @Resource
    private IUserService iUserService;

    @Test
    public void test() {
        List<User> list = iUserService.list();
        list.forEach(System.out::println);
    }
}