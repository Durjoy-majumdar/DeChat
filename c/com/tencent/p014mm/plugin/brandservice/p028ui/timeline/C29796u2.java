package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.u2 */
public final class C29796u2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80806d;

    public C29796u2(BizTestUI bizTestUI) {
        this.f80806d = bizTestUI;
    }

    public final void run() {
        ArrayList arrayList = MMWebView.f122353s.isEmpty() ? null : new ArrayList(MMWebView.f122353s);
        if (arrayList == null || arrayList.isEmpty()) {
            Log.m105920e(this.f80806d.f80719d, "no webView created");
            return;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            MMWebView mMWebView = (MMWebView) ((WeakReference) it.next()).get();
            if (mMWebView != null) {
                i++;
                Log.m105920e(this.f80806d.f80719d, mMWebView.getUrl());
            }
        }
        Log.m105921e(this.f80806d.f80719d, "not destroyed webview count:%s", Integer.valueOf(i));
    }
}
