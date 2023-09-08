package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.n */
public final class C72622n implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ OpenSdkFaceDetectInfoLayout f211264d;

    public C72622n(OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f211264d = openSdkFaceDetectInfoLayout;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 && i != 6) {
            return false;
        }
        OpenSdkFaceDetectInfoLayout.m84959a(this.f211264d);
        return true;
    }
}
