package top.yn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.yn.entity.Orders;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/6  21:02
 */
public interface OrderService extends IService<Orders> {


    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
