package com.hunau.weather.entity;

/**
 * * @Description:
 *
 * @param $params$
 * @Return: $returns$
 * @开发人员: 薛莎莎
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * @开发版本：综合练习V0.1
 */
import lombok.Data;

import java.io.Serializable;


@Data
public class WeatherResponse implements Serializable {


    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    /**
     * 消息数据
     */
    private Weather data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 消息状态
     */
    private String status;

    /**
     * 消息描述
     */
    private String desc;
}
