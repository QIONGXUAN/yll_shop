package com.vip.yll.service.impl;

import com.vip.yll.domain.vo.ShopPropertyVo;
import com.vip.yll.mapper.ShopPropertyMapper;
import com.vip.yll.mapper.ShopPropertyValueMapper;
import com.vip.yll.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    ShopPropertyMapper shopPropertyMapper;
    @Resource
    ShopPropertyValueMapper shopPropertyValueMapper;

    @Override
    public List<ShopPropertyVo> showAllValues(int shopId) {
        return shopPropertyMapper.selectAllValues(shopId);
    }

    @Override
    public List<Integer> showNextValues(List<Integer> shopPropertyValueIds) {
        return shopPropertyValueMapper.selectNextValues(shopPropertyValueIds);
    }
}
