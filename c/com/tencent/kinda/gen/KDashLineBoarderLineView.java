package com.tencent.kinda.gen;

public interface KDashLineBoarderLineView extends KViewLayout {
    float getCornerRadius();

    DynamicColor getDashColor();

    float getDashWidth();

    void setCornerRadius(float f);

    void setDashColor(DynamicColor dynamicColor);

    void setDashWidth(float f);
}
