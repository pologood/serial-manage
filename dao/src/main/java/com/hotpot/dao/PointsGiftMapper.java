package com.hotpot.dao;


import com.hotpot.domain.PointsGift;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsGiftMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_gift
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_gift
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int insert(PointsGift record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_gift
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int insertSelective(PointsGift record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_gift
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    PointsGift selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_gift
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int updateByPrimaryKeySelective(PointsGift record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_gift
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int updateByPrimaryKey(PointsGift record);
}