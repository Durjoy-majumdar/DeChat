package com.tencent.kinda.gen;

public interface KPwdInputView extends KView {
    boolean getAutoRemarkKeyBoradType();

    boolean getChearInput();

    boolean getFocus();

    String getHashData();

    boolean getKeyboardDisabled();

    PwdEncryptMode getPwdEncryptMode();

    String getPwdNonce();

    PwdViewStyle getPwdStyle();

    long getPwdTimestamp();

    long getTextLength();

    void setAutoRemarkKeyBoradType(boolean z);

    void setChearInput(boolean z);

    void setEncryptSoftSaltAndVersion(String str, int i);

    void setFocus(boolean z);

    void setFocusModalListener(IUIModal iUIModal);

    void setFocusUIPageListener(IUIPage iUIPage);

    void setHashData(String str);

    void setKeepKeyboardOnClearFocus(boolean z);

    void setKeyboardDisabled(boolean z);

    void setOnEndEnterPasswordCallback(KPwdInputViewOnEndEnterPasswordCallback kPwdInputViewOnEndEnterPasswordCallback);

    void setOnPasswordChangeCallback(KPwdInputViewOnPasswordChangeCallback kPwdInputViewOnPasswordChangeCallback);

    void setPwdEncryptMode(PwdEncryptMode pwdEncryptMode);

    void setPwdNonce(String str);

    void setPwdStyle(PwdViewStyle pwdViewStyle);

    void setPwdTimestamp(long j);

    void setTextLength(long j);

    Sm2HashType sm2HashType();
}
