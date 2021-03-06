package com.configx.web.dao;

import com.configx.web.model.WebhookRequestParam;

import java.util.List;

public interface WebhookRequestParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webhook_request_param
     *
     * @mbggenerated
     */
    int insert(WebhookRequestParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webhook_request_param
     *
     * @mbggenerated
     */
    int insertSelective(WebhookRequestParam record);

    /**
     * 批量插入
     *
     * @param records
     * @return
     */
    int batchInsert(List<WebhookRequestParam> records);

    int deleteByWebhookId(int webhookId);

    List<WebhookRequestParam> selectByWebhookIdList(List<Integer> webhookIdList);
}