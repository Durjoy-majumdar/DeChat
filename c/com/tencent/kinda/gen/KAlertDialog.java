package com.tencent.kinda.gen;

public interface KAlertDialog {
    void dismiss();

    void setContentAlign(TextAlign textAlign);

    void showImpl(String str, KView kView, String str2, String str3, VoidCallback voidCallback, VoidCallback voidCallback2);

    void showImpl(String str, String str2, String str3, VoidCallback voidCallback);

    void showImpl(String str, String str2, String str3, String str4, VoidCallback voidCallback, VoidCallback voidCallback2);

    void showImpl(String str, String str2, String str3, String str4, String str5, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3);

    void showInputAlertImpl(String str, String str2, String str3, int i, VoidStringCallback voidStringCallback, VoidCallback voidCallback);

    void showTipsImpl(String str, KImage kImage, String str2, String str3, VoidCallback voidCallback);

    void showTipsImpl(String str, KImage kImage, String str2, String str3, String str4, VoidCallback voidCallback, VoidCallback voidCallback2);

    void showTipsImpl(String str, String str2, String str3, VoidCallback voidCallback);

    void showTipsImpl(String str, String str2, String str3, String str4, VoidCallback voidCallback);

    void showTipsImpl(String str, String str2, String str3, String str4, VoidCallback voidCallback, VoidCallback voidCallback2);

    void showTipsImpl(String str, String str2, String str3, String str4, String str5, VoidCallback voidCallback, VoidCallback voidCallback2);

    void showTipsImpl(String str, String str2, String str3, String str4, String str5, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3);

    void showTouchIdAuthViewImpl(String str, VoidStringCallback voidStringCallback, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3);
}
