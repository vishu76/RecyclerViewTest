package com.learningbot.recyclerviewtest.Model;

public class ItemModel {
    private String name;
    private int ImgId;

    public ItemModel(String name, int imgId) {
        this.name = name;
        ImgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return ImgId;
    }

    public void setImgId(int imgId) {
        ImgId = imgId;
    }
}
