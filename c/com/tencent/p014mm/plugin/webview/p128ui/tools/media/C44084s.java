package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.app.Activity;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import s90.C48300n;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.s */
public final class C44084s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f119432d;

    /* renamed from: e */
    public final /* synthetic */ C44085t f119433e;

    public C44084s(Activity activity, C44085t tVar) {
        this.f119432d = activity;
        this.f119433e = tVar;
    }

    public final void run() {
        WebViewUI webViewUI;
        C48590l lVar;
        Activity activity = this.f119432d;
        if ((activity instanceof WebViewUI) && (webViewUI = (WebViewUI) activity) != null && (lVar = webViewUI.f118508Z) != null) {
            C48300n nVar = this.f119433e.f119434a;
            C87412m.m108591d(nVar);
            lVar.mo73208E(nVar.f133368f, StateEvent.ProcessResult.FAILED);
        }
    }
}
