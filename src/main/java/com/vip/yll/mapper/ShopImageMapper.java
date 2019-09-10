package com.vip.yll.mapper;

import com.vip.yll.domain.entity.ShopImage;

public interface ShopImageMapper {
    int deleteByPrimaryKey(Integer shopImageId);

    int insert(ShopImage record);

    int insertSelective(ShopImage record);

    ShopImage selectByPrimaryKey(Integer shopImageId);

    int updateByPrimaryKeySelective(ShopImage record);

    int updateByPrimaryKey(ShopImage record);
}