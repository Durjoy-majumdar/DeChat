package com.tencent.kinda.gen;

public interface KButton extends KView {
    DynamicColor getDisableColor();

    DynamicColor getDisableTextColor();

    KImage getDisabledImage();

    boolean getEnable();

    long getExpandHitHeight();

    long getExpandHitWidth();

    FontStyle getFontStyle();

    long getHorizontalPadding();

    DynamicColor getNormalColor();

    KImage getNormalImage();

    KImage getPressedImage();

    KImage getSelectedImage();

    String getText();

    DynamicColor getTextNormalColor();

    float getTextSize();

    long getVerticalPadding();

    void setDisableColor(DynamicColor dynamicColor);

    void setDisableTextColor(DynamicColor dynamicColor);

    void setDisabledImage(KImage kImage);

    void setEnable(boolean z);

    void setExpandHitHeight(long j);

    void setExpandHitWidth(long j);

    void setFontStyle(FontStyle fontStyle);

    void setHorizontalPadding(long j);

    void setNormalColor(DynamicColor dynamicColor);

    void setNormalImage(KImage kImage);

    void setPressedImage(KImage kImage);

    void setSelectedImage(KImage kImage);

    void setText(String str);

    void setTextNormalColor(DynamicColor dynamicColor);

    void setTextSize(float f);

    void setVerticalPadding(long j);
}
