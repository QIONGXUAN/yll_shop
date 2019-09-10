package com.vip.yll.domain.entity;

import lombok.Data;

@Data
public class ShopImage {
    /**
     * 商品图片id
     */
    private Integer shopImageId;

    /**
     * 商品id
     */
    private Integer shopId;

    /**
     * 商品图片类型：
     * yll_banner轮播图
     * yll_mall首页图片
     * yll_single商品图片
     * yll_detail商品详情图片
     * 【默认yll_single】
     */
    private String shopImageType;

    /**
     * 商品图片文件名
     */
    private String shopImageUrl;

    /**
     * 删除图片：1是 0否【默认0】
     */
    private Integer shopImageIsDelete;
}