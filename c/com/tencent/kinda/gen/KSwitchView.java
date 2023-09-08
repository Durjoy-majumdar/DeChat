package com.tencent.kinda.gen;

public interface KSwitchView extends KView {
    boolean getEnabled();

    KImage getOffImage();

    boolean getOn();

    KImage getOnImage();

    DynamicColor getOnTintColor();

    DynamicColor getThumbTintColor();

    DynamicColor getTintColor();

    void setEnabled(boolean z);

    void setOffImage(KImage kImage);

    void setOn(boolean z);

    void setOnChangeSwitchCallback(KSwitchViewOnChangeSwitchCallback kSwitchViewOnChangeSwitchCallback);

    void setOnImage(KImage kImage);

    void setOnTintColor(DynamicColor dynamicColor);

    void setThumbTintColor(DynamicColor dynamicColor);

    void setTintColor(DynamicColor dynamicColor);
}
