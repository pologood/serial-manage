package com.hotpot.domain;

public class VipInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_info.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_info.name
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_info.store_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private Integer storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_info.mobilephone
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String mobilephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_info.wechat
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String wechat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_info.email
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_info.create_time
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_info.id
     *
     * @return the value of vip_info.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_info.id
     *
     * @param id the value for vip_info.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_info.name
     *
     * @return the value of vip_info.name
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_info.name
     *
     * @param name the value for vip_info.name
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_info.store_id
     *
     * @return the value of vip_info.store_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_info.store_id
     *
     * @param storeId the value for vip_info.store_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_info.mobilephone
     *
     * @return the value of vip_info.mobilephone
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_info.mobilephone
     *
     * @param mobilephone the value for vip_info.mobilephone
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_info.wechat
     *
     * @return the value of vip_info.wechat
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_info.wechat
     *
     * @param wechat the value for vip_info.wechat
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_info.email
     *
     * @return the value of vip_info.email
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_info.email
     *
     * @param email the value for vip_info.email
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}