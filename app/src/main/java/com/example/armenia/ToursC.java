package com.example.armenia;

public class ToursC {
     private String name;
    private String website;
   private String image;

    public ToursC(String name, String website, String image) {
        this.name = name;
        this.website = website;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
