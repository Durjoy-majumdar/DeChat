package com.tencent.p014mm.plugin.licence.model;

/* renamed from: com.tencent.mm.plugin.licence.model.CardInfo */
public class CardInfo {
    public byte[] bitmapData;
    public int bitmapLen = 0;
    public int height = 0;
    public int width = 0;

    public CardInfo(int i, int i2) {
        double d = (double) i;
        this.bitmapData = new byte[((((int) (0.8d * d)) * ((int) (d * 0.52d)) * 3) + 54)];
    }

    public byte[] getData() {
        return this.bitmapData;
    }

    public int getHeight() {
        return this.height;
    }

    public int getSize() {
        return this.bitmapLen;
    }

    public int getWidth() {
        return this.width;
    }
}
