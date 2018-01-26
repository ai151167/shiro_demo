package com.qsy.demo.oa.shiro.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsy.demo.oa.shiro.commonparam.GoodsInfoParam;
import com.qsy.demo.oa.shiro.entity.GoodsInfo;
import com.qsy.demo.oa.shiro.entity.GoodsInfoExample;
import com.qsy.demo.oa.shiro.entity.mapper.GoodsInfoMapper;
import com.qsy.demo.oa.shiro.service.IGoodsInfoService;

@Service("goodsInfoService")
public class GoodsInfoServiceImpl implements IGoodsInfoService {

	@Autowired
	private GoodsInfoMapper goodsInfoMapper;
	
	/**
	 * 集合
	 */
	@Override
	public Map<String, Object> goodsInfoList(GoodsInfoParam param) {
		Map<String, Object> result = new HashMap<>();
		List<GoodsInfo> goodsInfos =  goodsInfoMapper.selectByGoodsCondition(param);
		Integer count = count(param);
		Integer pages =pages(count, param.getPageSize());
		result.put("goodsInfos", goodsInfos);
		result.put("count", count);
		result.put("pages", pages);
		return result;
		
	}
	
	/**
	 * 获取查询的总个数
	 * @param param
	 * @return
	 */
	protected Integer count(GoodsInfoParam param) {
		return goodsInfoMapper.selectCountByGoodsCondition(param);
	}
	
	/**
	 * 获取分页总数
	 * @param count
	 * @param pageSize
	 * @return
	 */
	protected Integer pages(Integer count,Integer pageSize) {
		 Integer pages = count%pageSize==0?count/pageSize:count/pageSize+1;
		 if(pages==0) {
			 pages =1;
		 }
		return pages;
	}
}
