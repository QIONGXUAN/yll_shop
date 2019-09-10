package com.vip.yll.domain.vo;

import com.vip.yll.domain.entity.Shop;
import com.vip.yll.domain.entity.ShopImage;
import lombok.Data;

@Data
public class ShopVo extends Shop {

    ShopImage shopImage;

}
