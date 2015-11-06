package com.bignerdranch.android.photogallery;

/**
 * Created by ursberger1 on 11/5/15.
 */
public class GalleryItem {

    private String mCaption;
    private String mID;
    private String mUrl;

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getID() {
        return mID;
    }

    public void setID(String ID) {
        mID = ID;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String toString() {
        return mCaption;
    }

}
