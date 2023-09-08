package com.tencent.p014mm.xeffect;

import java.nio.Buffer;

/* renamed from: com.tencent.mm.xeffect.FaceBufferData */
public class FaceBufferData {
    private Buffer bufferData;
    private int height;
    private String imagePath;
    private int width;

    public FaceBufferData() {
    }

    public FaceBufferData(String str, Buffer buffer, int i, int i2) {
        this.imagePath = str;
        this.bufferData = buffer;
        this.width = i;
        this.height = i2;
    }

    public Buffer getBufferData() {
        return this.bufferData;
    }

    public int getHeight() {
        return this.height;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public int getWidth() {
        return this.width;
    }
}
