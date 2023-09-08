package com.tencent.kinda.gen;

public interface KTimeOutNumberView extends KView {
    void setDefaultNumber(long j);

    void stopTimeOut();

    void updateColor(DynamicColor dynamicColor);

    void updateFont(String str);

    void updateNumber(long j);
}
