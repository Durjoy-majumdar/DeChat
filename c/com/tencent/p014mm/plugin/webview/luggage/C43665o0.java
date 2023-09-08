package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.sdk.platformtools.Log;
import p828wa.C53133t;

/* renamed from: com.tencent.mm.plugin.webview.luggage.o0 */
public class C43665o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53133t f118035d;

    public C43665o0(C53133t tVar) {
        this.f118035d = tVar;
    }

    public void run() {
        try {
            this.f118035d.mo73818f();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LuggageWebCoreStash", e, "", new Object[0]);
        }
    }
}
