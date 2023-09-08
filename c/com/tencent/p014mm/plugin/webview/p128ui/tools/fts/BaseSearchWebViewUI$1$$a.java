package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.tencent.p014mm.autogen.events.OnSearchFinderViewEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSearchWebViewUI;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$1$$a */
public final /* synthetic */ class BaseSearchWebViewUI$1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseSearchWebViewUI.C438981 f118926d;

    /* renamed from: e */
    public final /* synthetic */ OnSearchFinderViewEvent f118927e;

    public /* synthetic */ BaseSearchWebViewUI$1$$a(BaseSearchWebViewUI.C438981 r1, OnSearchFinderViewEvent onSearchFinderViewEvent) {
        this.f118926d = r1;
        this.f118927e = onSearchFinderViewEvent;
    }

    public final void run() {
        BaseSearchWebViewUI.C438981 r0 = this.f118926d;
        OnSearchFinderViewEvent onSearchFinderViewEvent = this.f118927e;
        if (BaseSearchWebViewUI.this.mo68521L9() != null) {
            BaseSearchWebViewUI.this.mo68549J9(new BaseSearchWebViewUI$1$$b(r0, onSearchFinderViewEvent));
        }
    }
}
