package com.azkaban.response;

/**
 * Created by shirukai on 2019-06-04 10:09
 * 定时调度Flow响应
 */
public class ScheduleCronFlowResponse extends BaseResponse {

    private String message;
    private String scheduleId;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
