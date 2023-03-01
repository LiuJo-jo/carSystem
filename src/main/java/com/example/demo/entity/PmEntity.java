package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
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
@TableName("pm")
@ApiModel(value="PmEntity对象", description="")
public class PmEntity extends PageEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    private Integer id;

    @ApiModelProperty(value = "汽车表主键")
    private Integer carId;

    @ApiModelProperty(value = "用户名称")
    private Integer userId;

    @ApiModelProperty(value = "预约人名称")
    private String name;

    @ApiModelProperty(value = "预约人手机号码")
    private String phonenumber;

    @ApiModelProperty(value = "预约时间")
    private LocalDateTime appointmentTime;

    @ApiModelProperty(value = "创建人手机号码")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "预约状态（默认值1，数据类型int，长度1。只有两个数据状态，0为待维修，1为已维修）")
    private Integer seit;

    @ApiModelProperty(value = "保养项目 mp_type(string 1-2-3-4-5-6-7-8 ) ")
    private String mpType;

    @ApiModelProperty(value = "保养时长")
    private Integer emTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public Integer getSeit() {
        return seit;
    }

    public void setSeit(Integer seit) {
        this.seit = seit;
    }
    public String getMpType() {
        return mpType;
    }

    public void setMpType(String mpType) {
        this.mpType = mpType;
    }
    public Integer getEmTime() {
        return emTime;
    }

    public void setEmTime(Integer emTime) {
        this.emTime = emTime;
    }

    @Override
    public String toString() {
        return "PmEntity{" +
            "id=" + id +
            ", carId=" + carId +
            ", userId=" + userId +
            ", name=" + name +
            ", phonenumber=" + phonenumber +
            ", appointmentTime=" + appointmentTime +
            ", createTime=" + createTime +
            ", seit=" + seit +
            ", mpType=" + mpType +
            ", emTime=" + emTime +
        "}";
    }
}
