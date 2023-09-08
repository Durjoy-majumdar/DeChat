package com.tencent.kinda.gen;

public interface KSecureEditText extends KView {
    ClearButtonMode getClearButtonMode();

    String getDefaultValue();

    boolean getEnabled();

    SecureCtrlEncryptType getEncryptType();

    boolean getFocus();

    String getHint();

    boolean getIsCommonText();

    KeyboardType getKeyboardType();

    int getMaxLength();

    String getText();

    DynamicColor getTextColor();

    DynamicColor getTintColor();

    boolean isCardFromatValid(int i);

    void setClearButtonMode(ClearButtonMode clearButtonMode);

    void setDefaultValue(String str);

    void setEnabled(boolean z);

    void setEncryptType(SecureCtrlEncryptType secureCtrlEncryptType);

    void setFocus(boolean z);

    void setHint(String str);

    void setIsCommonText(boolean z);

    void setKeyboardType(KeyboardType keyboardType);

    void setMaxLength(int i);

    void setOnTextChangedCallback(KSecureEditTextOnTextChangedCallback kSecureEditTextOnTextChangedCallback);

    void setText(String str);

    void setTextColor(DynamicColor dynamicColor);

    void setTextSize(float f);

    void setTintColor(DynamicColor dynamicColor);
}
