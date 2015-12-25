package com.hotpot.dao;


import com.hotpot.domain.Owner;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table owner
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table owner
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int insert(Owner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table owner
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int insertSelective(Owner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table owner
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    Owner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table owner
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int updateByPrimaryKeySelective(Owner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table owner
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    int updateByPrimaryKey(Owner record);
}