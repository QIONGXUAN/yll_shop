package com.vip.yll.domain.vo;

import com.vip.yll.domain.entity.ShopDetail;
import com.vip.yll.domain.entity.Shopcart;
import lombok.Data;


@Data
public class ShopcartVo extends Shopcart {

    ShopDetail shopDetail;

}
