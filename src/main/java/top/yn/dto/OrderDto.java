package top.yn.dto;

import top.yn.entity.OrderDetail;
import top.yn.entity.Orders;
import lombok.Data;

import java.util.List;

/**
 * @author frx
 * @version 1.0
 * @date 2022/7/15  20:06
 */
@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;
}
