package com.thanhtung.miniproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NewsResponsive {

    @SerializedName("articles")
    private ArrayList<News> news;

    public ArrayList<News> getNews() {
        return news;
    }
}
