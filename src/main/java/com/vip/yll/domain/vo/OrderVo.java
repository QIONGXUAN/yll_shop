package com.vip.yll.domain.vo;

import com.vip.yll.domain.entity.Order;
import lombok.Data;

import java.util.List;

@Data
public class OrderVo extends Order {

    /**
     * 生成订单的所有shopcartIds
     */
    List<Integer> shopcartIds;

}
