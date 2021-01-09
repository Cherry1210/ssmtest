package com.oracle.pojo;

public class Putproduct {
    private Integer putId;

    private Integer userId;

    private Integer productId;

    private String status;

    public Integer getPutId() {
        return putId;
    }

    public void setPutId(Integer putId) {
        this.putId = putId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}