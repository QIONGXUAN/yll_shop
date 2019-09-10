package com.vip.yll.mapper;

import com.vip.yll.domain.entity.Order;
import com.vip.yll.domain.vo.OrderVo;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

    int insert(@Param("orderVo") OrderVo orderVo);

    Order select(@Param("orderId") Integer orderId);

}