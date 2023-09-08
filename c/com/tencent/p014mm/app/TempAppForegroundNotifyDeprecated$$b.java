package com.tencent.p014mm.app;

import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$$b */
public final /* synthetic */ class TempAppForegroundNotifyDeprecated$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TempAppForegroundNotifyDeprecated f78653d;

    /* renamed from: e */
    public final /* synthetic */ DestroyPreloadedWebViewEvent f78654e;

    public /* synthetic */ TempAppForegroundNotifyDeprecated$$b(TempAppForegroundNotifyDeprecated tempAppForegroundNotifyDeprecated, DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent) {
        this.f78653d = tempAppForegroundNotifyDeprecated;
        this.f78654e = destroyPreloadedWebViewEvent;
    }

    public final void run() {
        int i;
        TempAppForegroundNotifyDeprecated tempAppForegroundNotifyDeprecated = this.f78653d;
        DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = this.f78654e;
        tempAppForegroundNotifyDeprecated.getClass();
        long j = destroyPreloadedWebViewEvent.f78769d.f78770a;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175911u(1009, WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS);
        ArrayList arrayList = MMWebView.f122353s.isEmpty() ? null : new ArrayList(MMWebView.f122353s);
        if (arrayList == null || arrayList.isEmpty()) {
            nVar.mo175911u(1009, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB);
            Log.m105924i("MicroMsg.TempAppForegroundNotifyDeprecated", "no webView created");
            return;
        }
        nVar.mo175911u(1009, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            MMWebView mMWebView = (MMWebView) ((WeakReference) it.next()).get();
            if (mMWebView != null) {
                i4++;
                try {
                    int webViewContextType = mMWebView.getWebViewContextType();
                    if (webViewContextType == 2) {
                        i2++;
                    } else if (webViewContextType == 1) {
                        i3++;
                    }
                    String nullAsNil = Util.nullAsNil(mMWebView.getUrl());
                    URLEncoder.encode(nullAsNil, "UTF-8");
                    if (tempAppForegroundNotifyDeprecated.f235729o <= 2) {
                        C115669n.INSTANCE.mo160131h(26165, 999, 1, Long.valueOf(j), Integer.valueOf(webViewContextType), nullAsNil);
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        if (i2 > 0) {
            C115669n.INSTANCE.mo175911u(1009, 225);
        }
        if (i3 > 0 && (i = tempAppForegroundNotifyDeprecated.f235729o) < 5) {
            tempAppForegroundNotifyDeprecated.f235729o = i + 1;
        }
        if (i2 > 0 || i3 > 0) {
            tempAppForegroundNotifyDeprecated.mo112267f();
        }
        Log.m105921e("MicroMsg.TempAppForegroundNotifyDeprecated", "not destroyed webview count:%s, visibleWebViewCount:%s", Integer.valueOf(i4), Integer.valueOf(i3));
    }
}
