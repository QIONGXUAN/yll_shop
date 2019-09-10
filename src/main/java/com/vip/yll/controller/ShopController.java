package com.vip.yll.controller;

import com.vip.yll.domain.vo.ShopPropertyVo;
import com.vip.yll.service.ShopService;
import com.vip.yll.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shop")
@Slf4j
public class ShopController {

    @Resource
    ShopService shopService;

    /**
     * 显示商品所有的属性
     * @param shopId
     * @return
     */
    @RequestMapping("/property")
    public Result<List<ShopPropertyVo>> showAllValues(int shopId) {
        try {
            List<ShopPropertyVo> shopPropertyVos = shopService.showAllValues(shopId);
            return Result.success(shopPropertyVos);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 根据前几个选中的属性查找后面属性有哪些id
     * @param shopPropertyValueIds
     * @return
     */
    @RequestMapping("/propertyNext")
    public Result<List<Integer>> showNextValues(@RequestParam("spvIds") List<Integer> shopPropertyValueIds) {
        try {
            List<Integer> showNextValueIds = shopService.showNextValues(shopPropertyValueIds);
            return Result.success(showNextValueIds);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

}
