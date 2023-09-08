package com.tencent.kinda.gen;

public interface KViewLayout extends KView {
    void addView(KView kView);

    void addView(KView kView, int i);

    Align getAlignContent();

    Align getAlignItems();

    FlexDirection getFlexDirection();

    Wrap getFlexWrap();

    Justify getJustifyContent();

    void removeAllViews();

    void removeView(KView kView);

    void setAlignContent(Align align);

    void setAlignItems(Align align);

    void setFlexDirection(FlexDirection flexDirection);

    void setFlexWrap(Wrap wrap);

    void setFocusableInTouchMode(boolean z);

    void setJustifyContent(Justify justify);
}
