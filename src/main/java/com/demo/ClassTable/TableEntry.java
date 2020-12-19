package com.demo.ClassTable;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.geccocrawler.gecco.request.HttpPostRequest;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhouzilong
 */
@Data
@Gecco(matchUrl = "http://4m3.tongji.edu.cn/eams/electionCourseTableForCampusOfStd!search.action", pipelines = "coursePipeline", timeout = 100000)
public class TableEntry implements HtmlBean {
    @Request
    private HttpRequest request;

    @HtmlField(cssPath = "body > table.listTable1 > tbody>tr")
    private List<TableRow> table;
    private HttpGetRequest a;

    public static void main(String[] args) {


        Map<String, String> formData = new HashMap<>(5);
        formData.put("project.id", "1");
        formData.put("semester.id", "110");
        formData.put("departmentId", "7");

        HttpPostRequest start = new HttpPostRequest("http://4m3.tongji.edu.cn/eams/electionCourseTableForCampusOfStd!search.action");
        start.addCookie("uudid", "cms084029f8-346c-4522-489e-49aeef96e7e3");
        start.addCookie("SERVERNAME", "s60");
        start.addCookie("safedog-flow-item", "");
        start.addCookie("JSESSIONID", "DD44A953DBE53968B61633E3AE8AC962.60");

        for (String key : formData.keySet()) {
            start.addField(key, formData.get(key));
        }

        GeccoEngine.create()
                .classpath("com.demo.ClassTable")
                .start(start)
                .thread(1)
                .interval(1000)
                .loop(false)
                //是否开启debug模式，跟踪页面元素抽取
                .debug(false)
                //非阻塞方式运行
                .start();
    }
}
