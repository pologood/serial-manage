package com.hotpot.domain;

public class StoreTable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_table.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_table.store_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private Integer storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_table.default_number
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private Integer defaultNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_table.table_code
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    private String tableCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_table.id
     *
     * @return the value of store_table.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_table.id
     *
     * @param id the value for store_table.id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_table.store_id
     *
     * @return the value of store_table.store_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_table.store_id
     *
     * @param storeId the value for store_table.store_id
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_table.default_number
     *
     * @return the value of store_table.default_number
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public Integer getDefaultNumber() {
        return defaultNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_table.default_number
     *
     * @param defaultNumber the value for store_table.default_number
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setDefaultNumber(Integer defaultNumber) {
        this.defaultNumber = defaultNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_table.table_code
     *
     * @return the value of store_table.table_code
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public String getTableCode() {
        return tableCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_table.table_code
     *
     * @param tableCode the value for store_table.table_code
     *
     * @mbggenerated Fri Dec 25 15:10:08 CST 2015
     */
    public void setTableCode(String tableCode) {
        this.tableCode = tableCode == null ? null : tableCode.trim();
    }
}