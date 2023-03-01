package top.yn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.yn.entity.Employee;
import top.yn.mapper.EmployeeMapper;
import top.yn.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/4/27  21:30
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
