package com.vip.yll.service.impl;

import com.vip.yll.domain.entity.Order;
import com.vip.yll.domain.entity.OrderDetail;
import com.vip.yll.domain.vo.OrderVo;
import com.vip.yll.mapper.OrderDetailMapper;
import com.vip.yll.mapper.OrderMapper;
import com.vip.yll.mapper.ShopcartMapper;
import com.vip.yll.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Resource
    ShopcartMapper shopcartMapper;
    @Resource
    OrderMapper orderMapper;
    @Resource
    OrderDetailMapper orderDetailMapper;

    @Override
    public Order insertAndShow(OrderVo orderVo) {
        int updateStatus = shopcartMapper.updateStatus(orderVo.getShopcartIds());
        if (updateStatus > 0) {
            int insertOrder = orderMapper.insert(orderVo);
            List<OrderDetail> orderDetails = shopcartMapper.selectOrderShop(orderVo.getShopcartIds());
            int insertOrderDetail = orderDetailMapper.insert(orderVo.getOrderId(),orderDetails);
            if (insertOrder > 0 && insertOrderDetail>0) {
                Order order = show(orderVo);
            }
        }
        return null;
    }

    public Order show(OrderVo orderVo) {
        return orderMapper.select(orderVo.getOrderId());
    }
}
