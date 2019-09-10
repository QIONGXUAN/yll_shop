package com.vip.yll.mapper;

import com.vip.yll.domain.entity.ShopDetail;import org.apache.ibatis.annotations.Param;

public interface ShopDetailMapper {

    Integer selectShopDetailId(@Param("shopDetail") ShopDetail shopDetail);
}