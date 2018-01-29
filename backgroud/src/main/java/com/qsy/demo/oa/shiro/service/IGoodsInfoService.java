package com.qsy.demo.oa.shiro.service;

import java.util.Map;

import com.qsy.demo.oa.shiro.commonparam.GoodsInfoOperation;
import com.qsy.demo.oa.shiro.commonparam.GoodsInfoParam;

public interface IGoodsInfoService {

	Map<String, Object> goodsInfoList(GoodsInfoParam param);

	String addGoodsInfo(GoodsInfoOperation goodsInfo);

	GoodsInfoOperation goodsInfo(Integer goodsId);

	String updateGoodsInfo(GoodsInfoOperation goodsInfo);

	String deleteGoodsInfo(Integer goodsId);

}
