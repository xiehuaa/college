package com.xh.common.req;

import com.xh.common.BaseSerializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-05-24
 */
@Setter
@Getter
@ApiModel(value = "分页请求对象", description = "PageReqVO")
public class PageReqVO extends BaseSerializable {
    @ApiModelProperty(value = "页码")
    private Integer pageNum;

    @ApiModelProperty(value = "分页大小")
    private Integer pageSize;
}
