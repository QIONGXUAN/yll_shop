package com.vip.yll.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Shopcart {
    /**
     * 购物车id
     */
    private Integer shopcartId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品详细信息id
     */
    private Integer shopDetailId;

    /**
     * 商品sku
     */
    private String shopSku;

    /**
     * 商品数量
     */
    private Integer shopNum;

    /**
     * 商品创建时间
     */
    private Date shopcartCreateDate;

    /**
     * 状态：1为选中  0为未选【默认0】
     */
    private Integer shopcartStatus;

    /**
     * 是否删除：1是  0否【默认0】
     */
    private Integer shopcartIsDelete;
}