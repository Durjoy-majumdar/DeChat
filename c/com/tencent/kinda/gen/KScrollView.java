package com.tencent.kinda.gen;

public interface KScrollView extends KViewLayout {
    KPoint getContentOffset();

    boolean getScrollToDimissKeyboardEnabled();

    boolean getScrollWhenViewSizeEnough();

    boolean getShowScrollBar();

    void scrollTo(KView kView, float f, float f2, boolean z);

    void setContent(KView kView);

    void setContentInsect(float f, float f2, float f3, float f4);

    void setContentOffset(KPoint kPoint);

    void setContentOffset(KPoint kPoint, boolean z);

    void setOnScrollCallback(KScrollViewOnScrollCallback kScrollViewOnScrollCallback);

    void setScrollToDimissKeyboardEnabled(boolean z);

    void setScrollWhenViewSizeEnough(boolean z);

    void setShowScrollBar(boolean z);
}
