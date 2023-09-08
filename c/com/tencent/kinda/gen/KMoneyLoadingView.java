package com.tencent.kinda.gen;

public interface KMoneyLoadingView extends KView {
    float getAnimationDuration();

    String getCurrencySymbol();

    DynamicColor getTextColor();

    float getTextSize();

    void setAnimationDuration(float f);

    void setCurrencySymbol(String str);

    void setFont(String str);

    void setMoney(long j, boolean z);

    void setTextColor(DynamicColor dynamicColor);

    void setTextSize(float f);

    void setTextSizeNotScaleable(float f, boolean z);

    void startLoading();

    void stopLoading();

    void updateTextAlignment(TextAlign textAlign);
}
