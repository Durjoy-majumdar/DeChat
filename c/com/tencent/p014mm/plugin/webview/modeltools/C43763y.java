package com.tencent.p014mm.plugin.webview.modeltools;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Util;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.y */
public class C43763y implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ MMWebView f118263a;

    public C43763y(MMWebView mMWebView) {
        this.f118263a = mMWebView;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        ((C119157j) C119157j.f356862d).mo183895z(new C43761w(this));
        if (!Util.isNullOrNil(str)) {
            ((C119157j) C119157j.f356862d).mo183876g(new C43762x(this, str), "WebViewReportOnLeaveThread");
        }
    }
}
