package com.oracle.pojo;

public class Review {
    private Integer reviewId;

    private Integer userGetid;

    private Integer userOutid;

    private String reviewInfo;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
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

    public String getReviewInfo() {
        return reviewInfo;
    }

    public void setReviewInfo(String reviewInfo) {
        this.reviewInfo = reviewInfo == null ? null : reviewInfo.trim();
    }
}