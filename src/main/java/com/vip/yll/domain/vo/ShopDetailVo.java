package com.vip.yll.domain.vo;

import com.vip.yll.domain.entity.Shop;
import com.vip.yll.domain.entity.ShopDetail;
import lombok.Data;

@Data
public class ShopDetailVo extends ShopDetail {

    Shop shop;

}
