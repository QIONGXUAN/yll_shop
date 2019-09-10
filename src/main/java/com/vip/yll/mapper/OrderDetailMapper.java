package com.vip.yll.mapper;

import com.vip.yll.domain.entity.OrderDetail;import org.apache.ibatis.annotations.Param;import java.util.List;

public interface OrderDetailMapper {

    int insert(@Param("orderId") Integer orderId,
               @Param("orderDetails") List<OrderDetail> orderDetails);
}