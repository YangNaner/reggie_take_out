package top.yn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.yn.entity.User;
import top.yn.mapper.UserMapper;
import top.yn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/30  15:11
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
