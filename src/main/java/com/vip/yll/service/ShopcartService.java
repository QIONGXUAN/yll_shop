package com.vip.yll.service;

import com.vip.yll.domain.vo.ShopcartVo;

import java.util.List;

public interface ShopcartService {

    public int insert(ShopcartVo shopcartVo);

    public List<ShopcartVo> show(int userId);

    public int updateShowNum(int shopcartId, int opr, int shopNum);

    public int updateShopProperty(ShopcartVo shopcartVo);

    public int delete(int shopcartId);

}
