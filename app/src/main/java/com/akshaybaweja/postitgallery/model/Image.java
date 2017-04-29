package com.akshaybaweja.postitgallery.model;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.io.Serializable;

public class Image extends Drawable implements Serializable{
    private String name;
    private String image;
    private String timestamp;
    private String tag;

    public Image() {
    }

    @Override
    public void draw(@NonNull Canvas canvas) {

    }

    @Override
    public void setAlpha(@IntRange(from = 0, to = 255) int alpha) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }

    public Image(String name, String image, String timestamp, String Tagtag) {
        this.name = name;
        this.image = image;
        this.timestamp = timestamp;
        this.tag = Tagtag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image=image;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setTag(String tagtag) { this.tag = tagtag; }

    public String getTag(){ return this.tag; }
}
