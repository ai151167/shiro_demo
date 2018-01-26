package com.qsy.demo.oa.shiro.service;

import java.util.Map;

import com.qsy.demo.oa.shiro.commonparam.GoodsInfoParam;

public interface IGoodsInfoService {

	Map<String, Object> goodsInfoList(GoodsInfoParam param);

}
