package top.yn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.yn.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/6  21:00
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
