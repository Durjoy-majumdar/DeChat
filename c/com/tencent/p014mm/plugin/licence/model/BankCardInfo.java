package com.tencent.p014mm.plugin.licence.model;

/* renamed from: com.tencent.mm.plugin.licence.model.BankCardInfo */
public class BankCardInfo {
    private static final String TAG = "BankCardInfo";
    public byte[] bitmapData;
    public int bitmapLen = 0;
    private String cardNum = "";
    private int cardNumLen = 0;
    public int height = 0;
    private int[] rectX = new int[20];
    private int[] rectY = new int[20];
    public int width = 0;

    public BankCardInfo(int i, int i2) {
        double d = (double) i;
        this.bitmapData = new byte[((((int) (0.8d * d)) * ((int) (d * 0.52d)) * 3) + 54)];
    }

    public String getCardNum() {
        return this.cardNum;
    }

    public int getCardNumLen() {
        return this.cardNumLen;
    }

    public int[] getRectX() {
        return this.rectX;
    }

    public int[] getRectY() {
        return this.rectY;
    }

    public void setCardNum(String str) {
        this.cardNum = str;
    }

    public void setCardNumLen(int i) {
        this.cardNumLen = i;
    }

    public void setRectX(int[] iArr) {
        this.rectX = iArr;
    }

    public void setRectY(int[] iArr) {
        this.rectY = iArr;
    }
}
