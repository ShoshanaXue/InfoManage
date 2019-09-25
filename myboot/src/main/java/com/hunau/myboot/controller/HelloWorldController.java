package com.hunau.myboot.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hunau.myboot.properties.MysqlProperties;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.Resource;
@RestController                            //返回的默认结果为字符串
public class HelloWorldController {
    @Value("${helloWorld}")                   //注入属性值
    private String hello;
    @Resource                            //属性值
    private MysqlProperties mysqlProperties;
    @RequestMapping("/hello")              //映射信息，往往是URL的组成部分
    public String hello(){
        return  hello;
    }
    @RequestMapping("/showJdbc")        //映射信息，往往是URL的组成部分
    public String showJdbc(){
        mysqlProperties.setJdbcName("com.mysql.jdbc.Driver");
        mysqlProperties.setDbUrl("jdbc:mysql://localhost:3306/mytest");
        mysqlProperties.setUserName("root");
        mysqlProperties.setPassword("sa");
        return "mysql.jdbcName:"+mysqlProperties.getJdbcName()+"<br/>"
                +"mysql.dbUrl:"+mysqlProperties.getDbUrl()+"<br/>"
                +"mysql.userName:"+mysqlProperties.getUserName()+"<br/>"
                +"mysql.password:"+mysqlProperties.getPassword()+"<br/>";
    }
}