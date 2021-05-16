package com.huub.mapApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {
    private transient String title;
    private transient String text;

    public Document(@JsonProperty("title") String title, @JsonProperty("text") String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
}
