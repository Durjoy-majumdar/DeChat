package com.tencent.kinda.gen;

public interface KImage {
    float getHeight();

    boolean getSupportDynamicSize();

    String getUrl();

    float getWidth();

    void setDarkModeUrl(String str);

    void setSupportDynamicSize(boolean z);

    void setSvgUrl(String str, DynamicColor dynamicColor);

    void setSvgUrl(String str, DynamicColor dynamicColor, KSize kSize);

    void setUrl(String str);

    void stretchImage(float f, float f2);
}
