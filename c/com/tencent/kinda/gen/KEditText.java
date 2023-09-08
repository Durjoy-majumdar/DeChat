package com.tencent.kinda.gen;

public interface KEditText extends KView {
    void enableConfirmBtn(boolean z);

    String encryptWith3Des();

    ClearButtonMode getClearButtonMode();

    String getConfirmButtonText();

    DynamicColor getCursorColor();

    boolean getEnabled();

    String getFixedHeaderText();

    boolean getFocus();

    String getHint();

    DynamicColor getHintColor();

    float getHintTextSize();

    boolean getIsSingleLine();

    KeyboardType getKeyboardType();

    int getMaxLength();

    int getMoneyRestrictionIntegerLimit();

    EditTextRestrictType getRestrictType();

    int getSelection();

    boolean getShowFloatButton();

    boolean getStayFocusWhenEnter();

    String getText();

    TextAlign getTextAlign();

    DynamicColor getTextColor();

    String getTextFont();

    float getTextSize();

    DynamicColor getTintColor();

    void setClearButtonMode(ClearButtonMode clearButtonMode);

    void setConfirmButtonText(String str);

    void setCursorColor(DynamicColor dynamicColor);

    void setEnabled(boolean z);

    void setFixedHeaderText(String str);

    void setFocus(boolean z);

    void setHint(String str);

    void setHintColor(DynamicColor dynamicColor);

    void setHintTextSize(float f);

    void setIsSingleLine(boolean z);

    void setKeyboardType(KeyboardType keyboardType);

    void setMaxLength(int i);

    void setMoneyRestrictionIntegerLimit(int i);

    void setNeedForceDismissFloatButton();

    void setOnEditorActionCallback(KEditTextOnEditorActionCallback kEditTextOnEditorActionCallback);

    void setOnFocusChangeCallback(KEditTextOnFocusChangeCallback kEditTextOnFocusChangeCallback);

    void setOnTextBeginChangeCallback(KEditTextOnTextBeginChangeCallback kEditTextOnTextBeginChangeCallback);

    void setOnTextChangedCallback(KEditTextOnTextChangedCallback kEditTextOnTextChangedCallback);

    void setOnTextEndEditingCallback(KEditTextOnTextEndEditingCallback kEditTextOnTextEndEditingCallback);

    void setRestrictType(EditTextRestrictType editTextRestrictType);

    void setSelection(int i);

    void setShowFloatButton(boolean z);

    void setStayFocusWhenEnter(boolean z);

    void setText(String str);

    void setTextAlign(TextAlign textAlign);

    void setTextColor(DynamicColor dynamicColor);

    void setTextFont(String str);

    void setTextSize(float f);

    void setTintColor(DynamicColor dynamicColor);

    void setupToolBarView(KView kView);
}
