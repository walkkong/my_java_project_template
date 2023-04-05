package directory.nan.quicktemplate.service;

import directory.nan.quicktemplate.entity.User;
import directory.nan.quicktemplate.mapper.UserMapper;
import directory.nan.quicktemplate.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nan
 * @since 2023-04-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
