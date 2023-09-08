package com.tencent.youtu.ytagreflectlivecheck.jni.model;

public class ColorImgData {
    public long capture_time;
    public String checksum;
    public String image;

    /* renamed from: x */
    public int f57042x;

    /* renamed from: y */
    public int f57043y;

    public long getCapture_time() {
        return this.capture_time;
    }

    public String getImage() {
        return this.image;
    }

    public int getX() {
        return this.f57042x;
    }

    public int getY() {
        return this.f57043y;
    }

    public void setCapture_time(long j) {
        this.capture_time = j;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setX(int i) {
        this.f57042x = i;
    }

    public void setY(int i) {
        this.f57043y = i;
    }
}
