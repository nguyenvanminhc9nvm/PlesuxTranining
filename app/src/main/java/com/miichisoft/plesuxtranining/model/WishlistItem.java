package com.miichisoft.plesuxtranining.model;

public class WishlistItem {
    private String text;
    private int imgSrc;

    public WishlistItem() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }
}
