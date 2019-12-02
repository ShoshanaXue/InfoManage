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
public class Yesterday implements Serializable {


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 日期
     */
    private String date;

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 高温
     */
    private String high;

    /**
     * 风向
     */
    private String fx;

    /**
     * 低温
     */
    private String low;

    /**
     * 风力
     */
    private String fl;

    /**
     * 类型：大雨、多云、晴...
     */
    private String type;
}
