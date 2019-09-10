package com.vip.yll.service;

import com.vip.yll.domain.entity.Order;
import com.vip.yll.domain.vo.OrderVo;


public interface OrderService {

    public Order insertAndShow(OrderVo orderVo);

    public Order show(OrderVo orderVo);

}
