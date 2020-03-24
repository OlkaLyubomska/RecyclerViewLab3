package com.example.recyclerviewlab_3;

import java.io.Serializable;

public class Cactusic implements Serializable {
    private String cactusName;
    private int image;
    private String familyCactus;

    public Cactusic(String cactusName,String familyCactus, int image){
        this.cactusName=cactusName;
        this.familyCactus=familyCactus;
        this.image=image;
    }



    public String getCactusName() {
        return cactusName;
    }

    public int getImage() {
        return image;
    }

    public String getFamilyCactus() {
        return familyCactus;
    }

    public void setCactusName(String cactusName) {
        this.cactusName = cactusName;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setFamilyCactus(String familyCactus) {
        this.familyCactus = familyCactus;
    }


}
