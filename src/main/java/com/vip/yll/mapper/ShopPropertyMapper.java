package com.vip.yll.mapper;

import com.vip.yll.domain.vo.ShopPropertyVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ShopPropertyMapper {

    String selectShopSku(@Param("shopPropertyValueIds") String shopPropertyValueIds);

    List<ShopPropertyVo> selectAllValues(@Param("shopId") Integer shopId);

}