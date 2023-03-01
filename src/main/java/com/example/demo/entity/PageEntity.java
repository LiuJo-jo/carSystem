package com.example.demo.entity;


import io.swagger.annotations.ApiModelProperty;

public class PageEntity {

    @ApiModelProperty(value = "当前页")
    private Integer pageNumber = 0;

    @ApiModelProperty(value = "每页数据量")
    private Integer pageSize = 10;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
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
