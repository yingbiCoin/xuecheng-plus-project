package com.xuecheng.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author 23671
 * @version 1.0
 * @description   查询课程的请求参数 dto
 * @date 2023/1/27 16:56
 */

@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    @ApiModelProperty("审核状态")
    private String auditStatus;

    //课程名称
    @ApiModelProperty("课程名称")
    private String courseName;

    //发布状态
    @ApiModelProperty("发布状态")
    private String publishStatus;
}
