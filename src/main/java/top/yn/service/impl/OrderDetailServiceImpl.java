package top.yn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.yn.entity.OrderDetail;
import top.yn.mapper.OrderDetailMapper;
import top.yn.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/6  21:06
 */
@Slf4j
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService{
}
