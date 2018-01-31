package com.qsy.demo.oa.shiro.entity.mapper;

import com.qsy.demo.oa.shiro.entity.GoodsInfo;
import com.qsy.demo.oa.shiro.entity.GoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    long countByExample(GoodsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int deleteByExample(GoodsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int deleteByPrimaryKey(Integer goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int insert(GoodsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int insertSelective(GoodsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    GoodsInfo selectByPrimaryKey(Integer goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByExample(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByPrimaryKeySelective(GoodsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByPrimaryKey(GoodsInfo record);
}