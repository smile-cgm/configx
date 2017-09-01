package com.configx.web.dao;

import java.util.List;

import com.configx.web.model.ReleaseVersion;
import org.apache.ibatis.annotations.Param;

public interface ReleaseVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_version
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_version
     *
     * @mbggenerated
     */
    int insert(ReleaseVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_version
     *
     * @mbggenerated
     */
    int insertSelective(ReleaseVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_version
     *
     * @mbggenerated
     */
    ReleaseVersion selectByPrimaryKey(Long number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_version
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReleaseVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_version
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReleaseVersion record);
    
    List<ReleaseVersion> getVersions(@Param("appId") int appId, @Param("envId") int envId);
}