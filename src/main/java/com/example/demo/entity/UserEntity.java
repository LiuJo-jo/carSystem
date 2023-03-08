package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@TableName("user")
@ApiModel(value="UserEntity对象", description="")
public class UserEntity extends PageEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String user;

    @ApiModelProperty(value = "用户账号")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "默认值1，数据类型int，长度1。只有两个身份类型，1为超管，	2为维修人员")
    private Integer authority;

    @ApiModelProperty(value = "默认值1，数据类型int，长度1。只有两个数据状态，0为已删除，1	为正常")
    private Integer state;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long getId() {
        return id;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public void setId(Long id) {
        this.id = id;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
            "id=" + id +
            ", user=" + user +
            ", username=" + username +
            ", password=" + password +
            ", authority=" + authority +
            ", state=" + state +
            ", createTime=" + createTime +
        "}";
    }
}
