package com.configx.web.dao;

import com.configx.web.model.Release;

import java.util.List;

public interface ReleaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbggenerated
     */
    int insert(Release record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbggenerated
     */
    int insertSelective(Release record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbggenerated
     */
    Release selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Release record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Release record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Release record);

    List<Release> selectByIdList(List<Long> idList);
}