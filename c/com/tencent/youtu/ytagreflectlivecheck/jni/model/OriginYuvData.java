package com.tencent.youtu.ytagreflectlivecheck.jni.model;

public class OriginYuvData {
    public int height;
    public int width;
    public byte[] yuvData;

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public byte[] getYuvData() {
        return this.yuvData;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setYuvData(byte[] bArr) {
        this.yuvData = bArr;
    }
}
