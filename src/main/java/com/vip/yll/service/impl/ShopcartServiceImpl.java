package com.vip.yll.service.impl;

import com.vip.yll.domain.entity.ShopDetail;
import com.vip.yll.domain.vo.ShopcartVo;
import com.vip.yll.mapper.ShopDetailMapper;
import com.vip.yll.mapper.ShopPropertyMapper;
import com.vip.yll.mapper.ShopcartMapper;
import com.vip.yll.service.ShopcartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopcartServiceImpl implements ShopcartService {

    @Resource
    ShopDetailMapper shopDetailMapper;
    @Resource
    ShopcartMapper shopcartMapper;
    @Resource
    ShopPropertyMapper shopPropertyMapper;

    @Override
    public int insert(ShopcartVo shopcartVo) {
        ShopDetail shopDetail = shopcartVo.getShopDetail();
        Integer shopDetailId = shopDetailMapper.selectShopDetailId(shopDetail);
        shopcartVo.setShopDetailId(shopDetailId);
        Integer shopcartId = shopcartMapper.selectShopcartId(shopcartVo);
        if (shopcartId != null) {
            return shopcartMapper.updateShopNum(shopcartId, null, shopcartVo.getShopNum());
        } else {
            String shopPropertyValueIds = shopDetail.getShopPropertyValueIds();
            String shopSku = shopPropertyMapper.selectShopSku(shopPropertyValueIds);
            shopcartVo.setShopSku(shopSku);
            return shopcartMapper.insert(shopcartVo);
        }
    }

    @Override
    public List<ShopcartVo> show(int userId) {
        return shopcartMapper.selectByUserId(userId);
    }

    @Override
    public int updateShowNum(int shopcartId, int opr, int shopNum) {
        return shopcartMapper.updateShopNum(shopcartId,opr,shopNum);
    }

    @Override
    public int updateShopProperty(ShopcartVo shopcartVo) {
        ShopDetail shopDetail = shopcartVo.getShopDetail();
        shopcartVo.setShopDetailId(shopDetailMapper.selectShopDetailId(shopDetail));
        shopcartVo.setShopSku(shopPropertyMapper.selectShopSku(shopDetail.getShopPropertyValueIds()));
        return shopcartMapper.updateShopDetailId(shopcartVo);
    }

    @Override
    public int delete(int shopcartId) {
        return shopcartMapper.delete(shopcartId);
    }
}
