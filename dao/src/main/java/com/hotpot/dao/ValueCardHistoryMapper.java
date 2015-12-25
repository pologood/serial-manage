package com.hotpot.dao;


import com.hotpot.domain.ValueCardHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueCardHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table value_card_history
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table value_card_history
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int insert(ValueCardHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table value_card_history
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int insertSelective(ValueCardHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table value_card_history
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    ValueCardHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table value_card_history
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int updateByPrimaryKeySelective(ValueCardHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table value_card_history
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int updateByPrimaryKey(ValueCardHistory record);
}