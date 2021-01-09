package com.oracle.pojo;

public class Payimg {
    private Integer payimgId;

    private Integer productId;

    private Integer userGetid;

    private Integer userOutid;

    private String paynum;

    private String payimg;

    public Integer getPayimgId() {
        return payimgId;
    }

    public void setPayimgId(Integer payimgId) {
        this.payimgId = payimgId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserGetid() {
        return userGetid;
    }

    public void setUserGetid(Integer userGetid) {
        this.userGetid = userGetid;
    }

    public Integer getUserOutid() {
        return userOutid;
    }

    public void setUserOutid(Integer userOutid) {
        this.userOutid = userOutid;
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum == null ? null : paynum.trim();
    }

    public String getPayimg() {
        return payimg;
    }

    public void setPayimg(String payimg) {
        this.payimg = payimg == null ? null : payimg.trim();
    }
}