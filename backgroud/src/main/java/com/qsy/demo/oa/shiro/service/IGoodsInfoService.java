package com.qsy.demo.oa.shiro.service;


import org.springframework.ui.ModelMap;

import com.qsy.demo.oa.shiro.commonparam.GoodsInfoOperation;
import com.qsy.demo.oa.shiro.commonparam.GoodsInfoParam;

public interface IGoodsInfoService {

	ModelMap goodsInfoList(GoodsInfoParam param);

	String addGoodsInfo(GoodsInfoOperation goodsInfo);

	GoodsInfoOperation goodsInfo(Integer goodsId);

	String updateGoodsInfo(GoodsInfoOperation goodsInfo);

	String deleteGoodsInfo(Integer goodsId);

}
