package com.tencent.kinda.gen;

public interface KOpenIMInfoView extends KView {
    String getBusinessNameText();

    String getFormatText();

    String getNickNameText();

    TextAlign getTextAlign();

    DynamicColor getTextColor();

    float getTextSize();

    String getTrueNameText();

    void setBusinessNameText(String str);

    void setFormatText(String str);

    void setNickNameText(String str);

    void setTextAlign(TextAlign textAlign);

    void setTextColor(DynamicColor dynamicColor);

    void setTextSize(float f);

    void setTrueNameText(String str);

    void updateContent();
}
