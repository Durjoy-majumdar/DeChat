package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.tencent.p014mm.autogen.events.OnSearchFinderViewEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSearchWebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.HashMap;
import t83.C13851h1;
import t83.C48590l;
import t83.l$$a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$1$$b */
public final /* synthetic */ class BaseSearchWebViewUI$1$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseSearchWebViewUI.C438981 f118928d;

    /* renamed from: e */
    public final /* synthetic */ OnSearchFinderViewEvent f118929e;

    public /* synthetic */ BaseSearchWebViewUI$1$$b(BaseSearchWebViewUI.C438981 r1, OnSearchFinderViewEvent onSearchFinderViewEvent) {
        this.f118928d = r1;
        this.f118929e = onSearchFinderViewEvent;
    }

    public final void run() {
        BaseSearchWebViewUI.C438981 r0 = this.f118928d;
        OnSearchFinderViewEvent onSearchFinderViewEvent = this.f118929e;
        r0.getClass();
        Log.m105924i("MicroMsg.WebSearch.BaseSearchWebViewUI", "OnSearchFinderViewEvent js api run" + onSearchFinderViewEvent.f9366d.f9368b);
        C48590l L9 = BaseSearchWebViewUI.this.mo68521L9();
        OnSearchFinderViewEvent.C1102a aVar = onSearchFinderViewEvent.f9366d;
        String str = aVar.f9367a;
        String str2 = aVar.f9368b;
        if (!L9.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("params", str2);
        MMHandlerThread.postToMainThread(new l$$a(L9, C13851h1.C13852a.m13143c("onFinderViewEvent", hashMap, L9.f130011p, L9.f130012q)));
    }
}
