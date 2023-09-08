package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.text.Editable;
import android.text.TextWatcher;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.r */
public final class C72626r implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ OpenSdkFaceDetectInfoLayout f211269d;

    public C72626r(OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f211269d = openSdkFaceDetectInfoLayout;
    }

    public void afterTextChanged(Editable editable) {
        C87412m.m108594g(editable, "s");
        OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout = this.f211269d;
        int i = OpenSdkFaceDetectInfoLayout.f211208n;
        openSdkFaceDetectInfoLayout.mo100002b();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
    }
}
