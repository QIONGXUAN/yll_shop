package com.vip.yll.controller;

import com.vip.yll.domain.vo.ShopcartVo;
import com.vip.yll.service.ShopcartService;
import com.vip.yll.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shopcart")
@Slf4j
public class ShopcartController {

    @Resource
    ShopcartService shopcartService;

    /**
     * 添加购物车
     * 如果商品存在则更改数量
     * 不存在则添加到购物车【需要通过shopPropertyValueIds获取shopSku】
     * @param shopcartVo 属性：Shopcart[userId、shopNum] ShopDetail[shopId、shopPropertyValueIds（商品所有属性id，String类型，用逗号隔开）]
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insert(@RequestBody ShopcartVo shopcartVo) {
        try {
            int i = shopcartService.insert(shopcartVo);
            if (i > 0) {
                return Result.success();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 根据userId查看购物车
     * @param userId
     * @return
     */
    @RequestMapping("/show")
    public Result<List<ShopcartVo>> show(int userId) {
        try {
            List<ShopcartVo> shopcartVos = shopcartService.show(userId);
            return Result.success(shopcartVos);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 更新购物车数量
     * @param shopcartId
     * @param opr 1 加   2 减   3直接赋值
     * @param shopNum
     * @return
     */
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    public Result updateNum(int shopcartId, int opr, @RequestParam(defaultValue = "1") int shopNum) {
        try {
            int i = shopcartService.updateShowNum(shopcartId, opr, shopNum);
            if (i > 0) {
                return Result.success();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 更改商品属性
     * @param shopcartVo 属性：Shopcart[shopcartId、shopNum] ShopDetail[shopId、shopPropertyValueIds（商品所有属性id，String类型，用逗号隔开）]
     * @return
     */
    @RequestMapping(value = "/updateProperty",method = RequestMethod.POST)
    public Result updateProperty(@RequestBody ShopcartVo shopcartVo){
        try {
            int i = shopcartService.updateShopProperty(shopcartVo);
            if (i > 0) {
                return Result.success();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 根据shopcartId删除购物车
     * @param shopcartId
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public Result delete(int shopcartId) {
        try {
            int i = shopcartService.delete(shopcartId);
            if (i > 0) {
                return Result.success();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

}
