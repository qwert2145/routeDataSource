package com.my.route.mapper;


import com.my.route.model.ClickBind;

public interface ClickBindMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table click_bind
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table click_bind
     *
     * @mbggenerated
     */
    int insert(ClickBind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table click_bind
     *
     * @mbggenerated
     */
    int insertSelective(ClickBind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table click_bind
     *
     * @mbggenerated
     */
    ClickBind selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table click_bind
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ClickBind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table click_bind
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ClickBind record);

    ClickBind selectByEventId(Integer clickEventId);
}