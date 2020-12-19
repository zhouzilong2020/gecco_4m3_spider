package com.demo.ClassTable;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

/**
 * 每一行table的数据
 *
 * @author zhouzilong
 */
@Data
public class TableRow implements HtmlBean {
    private static final long serialVersionUID = -377053120243382723L;
    @Text
    @HtmlField(cssPath = "td:nth-child(1)")
    private String officialId;

    @Text
    @HtmlField(cssPath = "td:nth-child(2)")
    private String className;

    @Text
    @HtmlField(cssPath = "td:nth-child(3)")
    private String period;

    @Text
    @HtmlField(cssPath = "td:nth-child(4)")
    private String credit;

    @Text
    @HtmlField(cssPath = "td:nth-child(5)")
    private String checkType;

    @Text
    @HtmlField(cssPath = "td:nth-child(6)")
    private String startStopWeed;

    @Text
    @HtmlField(cssPath = "td:nth-child(7)")
    private String teacherName;

    @Text
    @HtmlField(cssPath = "td:nth-child(8)")
    private String teacherTitle;

    @Text
    @HtmlField(cssPath = "td:nth-child(9)")
    private String ratedNumber;

    @Text
    @HtmlField(cssPath = "td:nth-child(10)")
    private String selectedNumber;

    @Text
    @HtmlField(cssPath = "td:nth-child(11)")
    private String schoolTime;

    @Text
    @HtmlField(cssPath = "td:nth-child(12)")
    private String remark;

    @Text
    @HtmlField(cssPath = "td:nth-child(13)")
    private String other;


}
