package com.tencent.kinda.gen;

public interface KCardNumberEditView extends KView {
    boolean getFocus();

    String getHint();

    DynamicColor getHintColor();

    int getInputTextLength();

    DynamicColor getTextColor();

    String getValue();

    boolean isBankCardNumber();

    void setFocus(boolean z);

    void setHint(String str);

    void setHintColor(DynamicColor dynamicColor);

    void setOnTextChangedCallback(KCardNumberEditViewOnTextChangedCallback kCardNumberEditViewOnTextChangedCallback);

    void setOnTextEndEditingCallback(KCardNumberEditViewOnTextEndEditingCallback kCardNumberEditViewOnTextEndEditingCallback);

    void setText(String str);

    void setTextColor(DynamicColor dynamicColor);
}
