package com.hotpot.domain;

public class ValueCard {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column value_card.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column value_card.card_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String cardId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column value_card.card_uuid
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String cardUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column value_card.balance
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private Integer balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column value_card.vip_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private Integer vipId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column value_card.create_time
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String createTime;

    private String password;

    private String modifiedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column value_card.id
     *
     * @return the value of value_card.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column value_card.id
     *
     * @param id the value for value_card.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column value_card.card_id
     *
     * @return the value of value_card.card_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column value_card.card_id
     *
     * @param cardId the value for value_card.card_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column value_card.card_uuid
     *
     * @return the value of value_card.card_uuid
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public String getCardUuid() {
        return cardUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column value_card.card_uuid
     *
     * @param cardUuid the value for value_card.card_uuid
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setCardUuid(String cardUuid) {
        this.cardUuid = cardUuid == null ? null : cardUuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column value_card.balance
     *
     * @return the value of value_card.balance
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column value_card.balance
     *
     * @param balance the value for value_card.balance
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column value_card.vip_id
     *
     * @return the value of value_card.vip_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public Integer getVipId() {
        return vipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column value_card.vip_id
     *
     * @param vipId the value for value_card.vip_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}