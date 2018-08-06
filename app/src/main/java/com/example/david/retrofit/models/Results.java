package com.example.david.retrofit.models;

import java.util.List;

public class Results {
    public String title;
    public String year;
    public Ids ids;


    @Override
    public String toString() {
        return "Results{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", ids=" + ids +
                '}';
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Ids getIds() {
        return ids;
    }

    public void setIds(Ids ids) {
        this.ids = ids;
    }

}
