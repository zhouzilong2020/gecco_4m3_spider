//package com.demo.ClassTable;
//
//import com.geccocrawler.gecco.GeccoEngine;
//import com.geccocrawler.gecco.annotation.Gecco;
//import com.geccocrawler.gecco.annotation.HtmlField;
//import com.geccocrawler.gecco.annotation.Request;
//import com.geccocrawler.gecco.annotation.Text;
//import com.geccocrawler.gecco.demo.jd.Category;
//import com.geccocrawler.gecco.request.HttpPostRequest;
//import com.geccocrawler.gecco.request.HttpRequest;
//import com.geccocrawler.gecco.spider.HtmlBean;
//import lombok.Data;
//
//import java.util.List;
//
//@Data
//@Gecco(matchUrl = "http://4m3.tongji.edu.cn/eams/electionCourseTableForCampusOfStd!search.action", pipelines = "allSortPipeline", timeout = 10000)
//public class CourseDetail implements HtmlBean {
//
//    private static final long serialVersionUID = -7127412585200687225L;
//
//    @Request
//    private HttpRequest request;
//
//    @Text(own = false)
//    @HtmlField(cssPath = "#departmentId")
//    private List<Category> department;
//
//    @Text(own = false)
//    @HtmlField(cssPath = "#campusId")
//    private List<Category> campus;
//
//    @HtmlField(cssPath = "#contentDiv > table.listTable1 > tbody > tr:nth-child(2) > td:nth-child(1)")
//    private String officialId;
//
//    public static void main(String[] args) {
//
//
//        GeccoEngine.create()
//                .classpath("com.geccocrawler.gecco.demo")
//                //开始抓取的页面地址
//                .seed(start)
//                //开启几个爬虫线程,线程数量最好不要大于seed request数量
//                .thread(1)
//                //单个爬虫每次抓取完一个请求后的间隔时间
//                .interval(2000)
//                //循环抓取
//                .loop(false)
//                //采用pc端userAgent
//                .mobile(false)
//                //是否开启debug模式，跟踪页面元素抽取
//                .debug(true)
//                //非阻塞方式运行
//                .start();
//
//    }
//
//}
