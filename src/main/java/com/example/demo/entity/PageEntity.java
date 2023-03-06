package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;

public class PageEntity {
    @TableField(exist = false)
    @ApiModelProperty(value = "当前页")
    private Integer pageNumber = 0;
    @TableField(exist = false)
    @ApiModelProperty(value = "每页数据量")
    private Integer pageSize = 10;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        if(pageNumber != 0){
            this.pageNumber = (pageNumber - 1) * pageSize;
        }

    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageNumber != 0){
            this.pageNumber = (pageNumber - 1) * pageSize;
        }
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageEntity{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                '}';
    }
}
