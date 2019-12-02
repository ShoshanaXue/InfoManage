package com.hunau.weather.service;

/**
 * * @Description:
 *
 * @param :$params$
 * @Return: $returns$
 * @开发人员: 薛莎莎
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * @开发版本：综合练习V0.1
 */
import com.hunau.weather.entity.Weather;
import com.hunau.weather.entity.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WeatherReportService {

    @Autowired
    private WeatherDataService weatherDataService;


    public Weather getDataByCityId(String cityId) {
        WeatherResponse response = weatherDataService.getDataByCityId(cityId);
        return response.getData();
    }
}
