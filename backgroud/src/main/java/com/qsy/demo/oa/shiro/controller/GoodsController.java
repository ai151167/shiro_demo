package com.qsy.demo.oa.shiro.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qsy.demo.oa.shiro.commonparam.GoodsInfoOperation;
import com.qsy.demo.oa.shiro.commonparam.GoodsInfoParam;
import com.qsy.demo.oa.shiro.entity.GoodsInfo;
import com.qsy.demo.oa.shiro.service.IGoodsInfoService;

@Controller
@RequestMapping("goodsInfo")
public class GoodsController {
	
	@Autowired
	private IGoodsInfoService goodsInfoService;
	
	@RequestMapping("/goods")
	public String goodsInfo() {
		return "goods/goodsList";
	}
	
	@ResponseBody
	@RequestMapping("/goodsInfoList")
	public Map<String, Object> goodsInfoList(GoodsInfoParam param) {
		Map<String, Object> map =  goodsInfoService.goodsInfoList(param);
		return map;
	}
	
	public String addGoodsInfo(GoodsInfoOperation goodsInfo) {
		return null;
		
	}
	
}
