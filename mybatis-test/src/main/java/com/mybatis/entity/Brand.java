package com.mybatis.entity;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@ToString
public class Brand {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.id
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.name
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.description
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.pic_url
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private String picUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.sort_order
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private Byte sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.floor_price
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private BigDecimal floorPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.add_time
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.update_time
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_brand.deleted
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.id
     *
     * @return the value of litemall_brand.id
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.id
     *
     * @param id the value for litemall_brand.id
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.name
     *
     * @return the value of litemall_brand.name
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.name
     *
     * @param name the value for litemall_brand.name
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.description
     *
     * @return the value of litemall_brand.description
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.description
     *
     * @param description the value for litemall_brand.description
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.pic_url
     *
     * @return the value of litemall_brand.pic_url
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.pic_url
     *
     * @param picUrl the value for litemall_brand.pic_url
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.sort_order
     *
     * @return the value of litemall_brand.sort_order
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.sort_order
     *
     * @param sortOrder the value for litemall_brand.sort_order
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.floor_price
     *
     * @return the value of litemall_brand.floor_price
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.floor_price
     *
     * @param floorPrice the value for litemall_brand.floor_price
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setFloorPrice(BigDecimal floorPrice) {
        this.floorPrice = floorPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.add_time
     *
     * @return the value of litemall_brand.add_time
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.add_time
     *
     * @param addTime the value for litemall_brand.add_time
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.update_time
     *
     * @return the value of litemall_brand.update_time
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.update_time
     *
     * @param updateTime the value for litemall_brand.update_time
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_brand.deleted
     *
     * @return the value of litemall_brand.deleted
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_brand.deleted
     *
     * @param deleted the value for litemall_brand.deleted
     *
     * @mbg.generated Fri May 05 09:32:40 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}