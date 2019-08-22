package com.wenzhan.zwz.time.port.adapter.persistence.dataobject;

import java.util.Date;

public class TodoItemDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.id
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.title
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.gmt_create
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.gmt_modified
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.content
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.status
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.type
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.version
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private Byte version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_item.open_id
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    private String openId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.id
     *
     * @return the value of todo_item.id
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.id
     *
     * @param id the value for todo_item.id
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.title
     *
     * @return the value of todo_item.title
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.title
     *
     * @param title the value for todo_item.title
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.gmt_create
     *
     * @return the value of todo_item.gmt_create
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.gmt_create
     *
     * @param gmtCreate the value for todo_item.gmt_create
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.gmt_modified
     *
     * @return the value of todo_item.gmt_modified
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.gmt_modified
     *
     * @param gmtModified the value for todo_item.gmt_modified
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.content
     *
     * @return the value of todo_item.content
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.content
     *
     * @param content the value for todo_item.content
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.status
     *
     * @return the value of todo_item.status
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.status
     *
     * @param status the value for todo_item.status
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.type
     *
     * @return the value of todo_item.type
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.type
     *
     * @param type the value for todo_item.type
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.version
     *
     * @return the value of todo_item.version
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public Byte getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.version
     *
     * @param version the value for todo_item.version
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setVersion(Byte version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_item.open_id
     *
     * @return the value of todo_item.open_id
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_item.open_id
     *
     * @param openId the value for todo_item.open_id
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }
}