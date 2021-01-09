package com.oracle.pojo;

public class Order {
    private Integer orderId;

    private Integer userId;

    private Integer productId;

    private String getdate;

    private String donedate;

    private String status;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getGetdate() {
        return getdate;
    }

    public void setGetdate(String getdate) {
        this.getdate = getdate == null ? null : getdate.trim();
    }

    public String getDonedate() {
        return donedate;
    }

    public void setDonedate(String donedate) {
        this.donedate = donedate == null ? null : donedate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}