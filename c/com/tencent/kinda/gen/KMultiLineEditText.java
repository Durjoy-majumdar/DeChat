package com.tencent.kinda.gen;

public interface KMultiLineEditText extends KView {
    boolean getEnabled();

    boolean getFocus();

    String getHint();

    DynamicColor getHintColor();

    int getMaxLength();

    String getText();

    TextAlign getTextAlign();

    DynamicColor getTextColor();

    String getTextFont();

    float getTextSize();

    void setEnabled(boolean z);

    void setFocus(boolean z);

    void setHint(String str);

    void setHintColor(DynamicColor dynamicColor);

    void setMaxLength(int i);

    void setOnFocusChangedImpl(VoidBoolCallback voidBoolCallback);

    void setOnTextChangedImpl(VoidStringCallback voidStringCallback);

    void setOnTextEndEditingImpl(VoidCallback voidCallback);

    void setText(String str);

    void setTextAlign(TextAlign textAlign);

    void setTextColor(DynamicColor dynamicColor);

    void setTextFont(String str);

    void setTextSize(float f);
}
