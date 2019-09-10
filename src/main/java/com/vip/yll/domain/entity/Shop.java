package com.vip.yll.domain.entity;

import lombok.Data;

@Data
public class Shop {
    /**
     * 商品id
     */
    private Integer shopId;

    /**
     * 商品名
     */
    private String shopName;

    /**
     * 商品状态：1-在售 2-下架 3-删除【默认1】
     */
    private Integer shopStatus;
}