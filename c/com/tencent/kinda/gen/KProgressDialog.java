package com.tencent.kinda.gen;

public interface KProgressDialog {
    void dismiss();

    void showCustomLoading(String str, boolean z);

    void showImpl(String str, boolean z, VoidCallback voidCallback);

    void showNormalGlobalLoading(boolean z);

    void showNormalLoading(boolean z);

    void showPayGlobalLoading(boolean z);

    void showPayProcessImpl(boolean z, VoidCallback voidCallback);

    void showToast(String str);

    void showTopLoading(String str, boolean z);
}
