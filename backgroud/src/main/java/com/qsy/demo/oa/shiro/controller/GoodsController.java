package com.qsy.demo.oa.shiro.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qsy.demo.oa.shiro.commonparam.GoodsInfoOperation;
import com.qsy.demo.oa.shiro.commonparam.GoodsInfoParam;
import com.qsy.demo.oa.shiro.entity.GoodsInfo;
import com.qsy.demo.oa.shiro.service.IGoodsInfoService;

@Controller
@RequestMapping("/goodsInfo")
public class GoodsController {

	@Autowired
	private IGoodsInfoService goodsInfoServiceImpl;

	@RequestMapping("/goods")
	public String goodsInfo() {
		return "goods/goodsList";
	}
	
	@RequestMapping("/list")
	public String goods() {
		return "goods/goods";
	}
	
	
	@RequestMapping("/goodsInfoList")
	public String goodsInfoList(GoodsInfoParam param,ModelMap map) {
		System.out.println("11111");
		Map<String,Object> result = goodsInfoServiceImpl.goodsInfoList();
		map.put("goodsList", result.get("goodsInfos"));
		map.put("count", result.get("count"));
		map.put("pages", result.get("pages"));
		System.out.println(result.get("pages"));
		return "goods/goods";
	}

	@ResponseBody
	@RequestMapping("/addGoodsInfo")
	public String addGoodsInfo(GoodsInfoOperation goodsInfo) {
		return goodsInfoServiceImpl.addGoodsInfo(goodsInfo);
	}

	@ResponseBody
	@RequestMapping("/goodsInfo")
	public GoodsInfo goodsInfo(Integer goodsId) {
		return goodsInfoServiceImpl.goodsInfo(goodsId);
	}

	@ResponseBody
	@RequestMapping("/updateGoodsInfo")
	public String updateGoodsInfo(GoodsInfoOperation goodsInfo) {
		return goodsInfoServiceImpl.updateGoodsInfo(goodsInfo);
	}

	@ResponseBody
	@RequestMapping("/deleteGoodsInfo")
	public String deleteGoodsInfo(Integer goodsId) {
		return goodsInfoServiceImpl.deleteGoodsInfo(goodsId);
	}
}
