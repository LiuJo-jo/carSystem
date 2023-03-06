package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuxiaobao
 * @since 2023-03-01
 */
@TableName("car")
@ApiModel(value="CarEntity对象", description="")
public class CarEntity extends PageEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "车主姓名")
    private String name;

    @ApiModelProperty(value = "车主手机号码")
    private String phonenumber;

    @ApiModelProperty(value = "车牌号")
    private String carNumber;

    @ApiModelProperty(value = "车辆品牌")
    private String brand;

    @ApiModelProperty(value = "型号")
    private String type;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
            "id=" + id +
            ", name=" + name +
            ", phonenumber=" + phonenumber +
            ", carNumber=" + carNumber +
            ", brand=" + brand +
            ", type=" + type +
            ", createTime=" + createTime +
        "}";
    }
}
