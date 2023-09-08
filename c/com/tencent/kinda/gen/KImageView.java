package com.tencent.kinda.gen;

public interface KImageView extends KView {
    String getDarkModeUrl();

    String getDefaultUrl();

    KImage getImage();

    byte[] getImageData();

    ScaleType getScaleType();

    DynamicColor getTintColor();

    String getUrl();

    void setDarkModeUrl(String str);

    void setDefaultUrl(String str);

    void setImage(KImage kImage);

    void setImageData(byte[] bArr);

    void setScaleType(ScaleType scaleType);

    void setTintColor(DynamicColor dynamicColor);

    void setUrl(String str);
}
