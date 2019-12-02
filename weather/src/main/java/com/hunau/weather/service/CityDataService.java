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
import com.hunau.weather.util.XmlBuilder;
import com.hunau.weather.entity.City;
import com.hunau.weather.entity.CityList;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class CityDataService {

    public List<City> listCity() throws Exception {
        //读取XML文件
        Resource resource = new ClassPathResource("static/citylist.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "UTF-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";

        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }
        br.close();

        //XML转为Java对象
        CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, buffer.toString());

        return cityList.getCityList();
    }
}
