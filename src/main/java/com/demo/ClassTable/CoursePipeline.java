package com.demo.ClassTable;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

import java.util.List;

/**
 * 处理数据的管道机制
 *
 * @author zhouzilong
 */
@PipelineName("coursePipeline")
public class CoursePipeline implements Pipeline<TableEntry> {
    @Override
    public void process(TableEntry tableEntry) {
        List<TableRow> table = tableEntry.getTable();
        for (TableRow row : table) {
            System.out.println(row.getOfficialId() + row.getClassName());
        }
    }
}
