package com.tencent.tencentmap.mapsdk.maps.model;

public enum MapFontSize {
    tiny(0, 4),
    small(1, 3),
    normal(2, 0),
    large(3, 1),
    huge(4, 2);
    
    private int engineCode;
    private int fontSize;

    private MapFontSize(int i, int i2) {
        this.fontSize = i;
        this.engineCode = i2;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getValue() {
        return this.engineCode;
    }
}
