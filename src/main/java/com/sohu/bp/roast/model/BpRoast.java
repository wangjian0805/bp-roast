package com.sohu.bp.roast.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class BpRoast {
    private Long roastId;

    private Integer focusId;

    private String content;

    private String imageUrls;

    private Integer thumbUp;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date publishTime;

    public Long getRoastId() {
        return roastId;
    }

    public void setRoastId(Long roastId) {
        this.roastId = roastId;
    }

    public Integer getFocusId() {
        return focusId;
    }

    public void setFocusId(Integer focusId) {
        this.focusId = focusId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls == null ? null : imageUrls.trim();
    }

    public Integer getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(Integer thumbUp) {
        this.thumbUp = thumbUp;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}