package com.tencent.p014mm.plugin.webview.modeltools;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.w */
public class C43761w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C43763y f118261d;

    public C43761w(C43763y yVar) {
        this.f118261d = yVar;
    }

    public void run() {
        try {
            this.f118261d.f118263a.destroy();
        } catch (Exception e) {
            Log.m105929w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", e.getMessage());
        }
    }
}
