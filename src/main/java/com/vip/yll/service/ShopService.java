package com.vip.yll.service;

import com.vip.yll.domain.vo.ShopPropertyVo;

import java.util.List;

public interface ShopService {

    public List<ShopPropertyVo> showAllValues(int shopId);

    public List<Integer> showNextValues(List<Integer> shopPropertyValueIds);

}
