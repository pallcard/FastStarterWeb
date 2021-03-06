package com.summer.faststarter.mybatis.generate.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@ApiModel(value="com.summer.faststarter.datasource.mybatis.generate.model.User")
public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USER.id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USER.name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="name姓名")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USER.gender
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="gender性别")
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USER.age
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="age年龄")
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_USER
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USER.id
     *
     * @return the value of TB_USER.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USER.id
     *
     * @param id the value for TB_USER.id
     *
     * @mbg.generated
     */
    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USER.name
     *
     * @return the value of TB_USER.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USER.name
     *
     * @param name the value for TB_USER.name
     *
     * @mbg.generated
     */
    public User setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USER.gender
     *
     * @return the value of TB_USER.gender
     *
     * @mbg.generated
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USER.gender
     *
     * @param gender the value for TB_USER.gender
     *
     * @mbg.generated
     */
    public User setGender(Byte gender) {
        this.gender = gender;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USER.age
     *
     * @return the value of TB_USER.age
     *
     * @mbg.generated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USER.age
     *
     * @param age the value for TB_USER.age
     *
     * @mbg.generated
     */
    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}