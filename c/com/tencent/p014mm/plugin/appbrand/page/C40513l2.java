package com.tencent.p014mm.plugin.appbrand.page;

import android.webkit.DownloadListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.page.l2 */
public class C40513l2 implements DownloadListener {
    public C40513l2(C40502j2 j2Var) {
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        Log.m105925i("MicroMsg.AppBrandWebView", "onDownloadStart called, url = %s, mimeType = %s, userAgent = %s", str, str4, str2);
    }
}
