package top.yn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.yn.common.BaseContext;
import top.yn.entity.ShoppingCart;
import top.yn.mapper.ShoppingCartMapper;
import top.yn.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/5  16:49
 */
@Service
@Slf4j
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
    @Override
    public void clean() {
        //sql:delete from shopping_cart where userId =？
        LambdaQueryWrapper<ShoppingCart> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ShoppingCart::getUserId, BaseContext.getCurrentId());
        //如果直接注入ShoppingCartService是有可能报循环依赖的
        this.remove(queryWrapper);
    }
}
