package com.hunau.weather.job;

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
import com.hunau.weather.service.CityDataService;
import com.hunau.weather.service.WeatherDataService;
import com.hunau.weather.entity.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

/**
 * 同步天气数据

 */
public class WeatherDataSyncJob extends QuartzJobBean {

    private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Autowired
    private CityDataService cityDataService;

    @Autowired
    private WeatherDataService weatherDataService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("天气数据同步任务 start");

        //读取城市列表
        List<City> cityList = null;
        try {
            cityList = cityDataService.listCity();
        } catch (Exception e) {
            logger.error("获取城市信息异常！", e);
        }

        for (City city : cityList) {
            String cityId = city.getCityId();
            logger.info("天气数据同步任务中， -cityId:{}", cityId);

            weatherDataService.syncDataByCityId(cityId);
        }

        logger.info("天气数据同步任务 end");
    }
}
