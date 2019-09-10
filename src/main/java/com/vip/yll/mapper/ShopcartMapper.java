package com.vip.yll.mapper;

import com.vip.yll.domain.entity.OrderDetail;
import com.vip.yll.domain.entity.Shopcart;
import com.vip.yll.domain.vo.ShopcartVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ShopcartMapper {

    int insert(@Param("shopcartVo") ShopcartVo shopcartVo);

    Integer selectShopcartId(@Param("shopcart") Shopcart shopcart);

    List<ShopcartVo> selectByUserId(@Param("userId") Integer userId);

    /**
     * 根据opr或者shopNum修改购物车数量
     *
     * @param shopcartId
     * @param opr        1加 2减
     * @param shopNum    添加购物车时的数量
     * @return
     */
    int updateShopNum(@Param("shopcartId") Integer shopcartId,
                      @Param("opr") Integer opr,
                      @Param("shopNum") Integer shopNum);

    int updateShopDetailId(@Param("shopcartVo") ShopcartVo shopcartVo);

    int delete(@Param("shopcartId") Integer shopcartId);

    int updateStatus(@Param("shopcartIds") List<Integer> shopcartIds);

    List<OrderDetail> selectOrderShop(@Param("shopcartIds") List<Integer> shopcartIds);

}