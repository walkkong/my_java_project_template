package directory.nan.quicktemplate.mapper;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import directory.nan.quicktemplate.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
     /*   List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(5, userList.size());
        userList.forEach(System.out::println);*/

        List<User> records = userMapper
                .selectPage(Page.of(2, 1), null).getRecords();

        records.forEach(System.out::println);
    }
}