package com.example.myapp.entity;

import android.graphics.Bitmap;
public class MyBitmap {
    String path;
    Bitmap bm;

    public MyBitmap(String path, Bitmap bm) {
        this.path = path;
        this.bm = bm;

//
//        E/setsize: getContentProvider: /storage/emulated/0/DCIM/Camera/IMG_20170413_165655.jpg
//        E/setsize: getContentProvider: /storage/emulated/0/DCIM/Camera/IMG_20170413_165652.jpg
//        E/setsize: getContentProvider: /storage/emulated/0/DCIM/Camera/IMG_20170413_165641.jpg
//        E/setsize: getContentProvider: /storage/emulated/0/DCIM/Camera/IMG_20170413_165647.jpg
//        E/setsize: getContentProvider: /storage/emulated/0/DCIM/Camera/IMG_20170413_165643.jpg
//        E/setsize: getContentProvider: /storage/emulated/0/DCIM/Camera/IMG_20170413_165645.jpg
//        E/setsize: getContentProvider: /storage/emulated/0/DCIM/Camera/IMG_20170413_165650.jpg
//        E/setsize: getContentProvider: /storage/emulated/0/DCIM/Camera/IMG_20170413_165659.jpg
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Bitmap getBm() {
        return bm;
    }

    public void setBm(Bitmap bm) {
        this.bm = bm;
    }
}
