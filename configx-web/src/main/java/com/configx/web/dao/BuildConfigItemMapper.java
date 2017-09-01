package com.configx.web.dao;

import java.util.List;

import com.configx.web.model.BuildConfigItem;
import org.apache.ibatis.annotations.Param;

public interface BuildConfigItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_config_item
     *
     * @mbggenerated
     */
    int insert(BuildConfigItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_config_item
     *
     * @mbggenerated
     */
    int insertSelective(BuildConfigItem record);

    List<BuildConfigItem> selectByBuildId(long buildId);

    BuildConfigItem selectByConfigId(@Param("buildId") long buildId, @Param("configId") long configId);

    List<BuildConfigItem> selectByBuildIdAndConfigNames(@Param("buildId") long buildId, @Param("configNameList") List<String> configNameList);
}