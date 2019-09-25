package com.hunau.myboot.controller;

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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller                            //返回的默认结果为视图，此例子中即是html文件
public class GreetingController {
    @GetMapping("/greeting")           // 映射信息，访问方法为GET方法
    @ResponseBody                   //修改了@Controller的返回要求，返回结果是字符串
    public String greeting() {
        System.out.println("Hello");
        return "greeting";
    }
    @GetMapping("/hi")               // 映射信息，访问方法为GET方法
    public String hi(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hi";                  //返回的是视图，即返回位于templates目录下的hi.html
    }
}