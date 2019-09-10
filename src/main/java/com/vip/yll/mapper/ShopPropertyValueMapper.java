package com.vip.yll.mapper;

import com.vip.yll.domain.vo.ShopPropertyVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopPropertyValueMapper {



    List<Integer> selectNextValues(@Param("spvIds") List<Integer> shopPropertyValueIds);

}