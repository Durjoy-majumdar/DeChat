package com.tencent.kinda.gen;

public interface KDashLineView extends KView {
    DynamicColor getDashColor();

    float getDashWidth();

    boolean getVertical();

    void setDashColor(DynamicColor dynamicColor);

    void setDashWidth(float f);

    void setVertical(boolean z);
}
