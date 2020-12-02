package com.azkaban.proxy;

import com.azkaban.api.AzkabanApi;
import com.azkaban.response.*;
import org.apache.http.client.fluent.Request;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by shirukai on 2019-06-13 15:16
 */
public class AzkabanApiProxyBuilderTest {
    @Test
    public void builder() {
        AzkabanApi apis = AzkabanApiProxyBuilder.create()
                .setUri("http://192.168.72.141:8081")
                .setUsername("azkaban")
                .setPassword("azkaban")
                .build();

        //TODO:创建项目--测试成功
        //apis.createProject("test2","测试");

        //TODO:获取项目列表--测试成功
//        FetchAllProjectsResponse fetchAllProjectsResponse = apis.fetchAllProjects();
//        List<Project> projects = fetchAllProjectsResponse.getProjects();
//        for (Project project:projects){
//            System.out.println(project.getCreatedTime());
//        }

        //TODO:删除项目--测试成功
        //apis.deleteProject("test1");

        //TODO:上传zip包--测试成功
//        ProjectZipResponse test = apis.uploadProjectZip("D:\\(工作)国网\\甘肃项目\\azbaka\\before_clean\\before_clean.zip", "test");
//        System.out.println(test.getProjectId());

        //TODO:获取项目的Flows--测试成功
//        FetchFlowsResponse test = apis.fetchProjectFlows("test");
//        List<Flow> flows = test.getFlows();
//        for (Flow flow:flows){
//            System.out.println(flow.getFlowId());
//        }

        //TODO;执行Flow--测试成功
//        ExecuteFlowResponse executeFlowResponse = apis.executeFlow("test", "before_clean");
//        System.out.println(executeFlowResponse.getExecid());

        //TODO:取消执行Flow--测试成功
//        BaseResponse baseResponse = apis.cancelFlow("1");
//        System.out.println(baseResponse.getError());

        //TODO:获取执行Flow的信息--测试成功
//        FetchExecFlowResponse fetchExecFlowResponse = apis.fetchExecFlow("1");
//        System.out.println(fetchExecFlowResponse.getEndTime());

        //TODO:查询执行job的日志--测试成功
//        FetchExecJobLogs before_clean = apis.fetchExecJobLogs("1", "before_clean", 0, 100);
//        System.out.println(before_clean.getOffset());

        //TODO:查询Flow的执行记录--测试成功
//        FetchFlowExecutionsResponse fetchFlowExecutionsResponse = apis.fetchFlowExecutions("test", "before_clean", 0, 10);
//        List<Execution> executions = fetchFlowExecutionsResponse.getExecutions();
//        for (Execution execution:executions){
//            System.out.println(execution.getStatus());
//        }

        //TODO:设置定时任务--测试成功
//        ScheduleCronFlowResponse scheduleCronFlowResponse = apis.scheduleCronFlow("test", "before_clean", "0%200%2012%20?%20*%20*");
//        System.out.println(scheduleCronFlowResponse.getMessage());

        //TODO:获取定时任务--测试成功
//        FetchScheduleResponse test = apis.fetchSchedule("1", "1");
//        System.out.println(test.getStatus());

        //TODO:删除定时任务--测试成功
//        BaseResponse baseResponse = apis.removeSchedule("1");
//        System.out.println(baseResponse.getMessage());
    }
}