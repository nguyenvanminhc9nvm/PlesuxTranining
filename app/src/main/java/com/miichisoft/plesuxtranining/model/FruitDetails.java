package com.miichisoft.plesuxtranining.model;

public class FruitDetails {
    private int imgSrc;
    private String name;
    private String type;
    private String description;

    public FruitDetails(int imgSrc, String name, String type, String description) {
        this.imgSrc = imgSrc;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
