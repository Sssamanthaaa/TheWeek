package com.example.student.theweek;

public class CategoryItem {
    String text;
    int image;


    public CategoryItem(int image, String text) {
        this.text= text;
        this.image= image;

    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }

}
