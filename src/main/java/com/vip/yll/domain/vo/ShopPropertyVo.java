package com.vip.yll.domain.vo;

import com.vip.yll.domain.entity.ShopProperty;
import com.vip.yll.domain.entity.ShopPropertyValue;
import lombok.Data;

import java.util.List;

@Data
public class ShopPropertyVo extends ShopProperty {

    List<ShopPropertyValue> shopPropertyValues;

}
