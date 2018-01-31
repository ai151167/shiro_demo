package com.qsy.demo.oa.shiro.service;


import java.util.Map;


import com.qsy.demo.oa.shiro.commonparam.GoodsInfoOperation;
import com.qsy.demo.oa.shiro.commonparam.GoodsInfoParam;
import com.qsy.demo.oa.shiro.entity.GoodsInfo;

public interface IGoodsInfoService {

	Map<String,Object> goodsInfoList();

	String addGoodsInfo(GoodsInfoOperation goodsInfo);

	GoodsInfo goodsInfo(Integer goodsId);

	String updateGoodsInfo(GoodsInfoOperation goodsInfo);

	String deleteGoodsInfo(Integer goodsId);

}
