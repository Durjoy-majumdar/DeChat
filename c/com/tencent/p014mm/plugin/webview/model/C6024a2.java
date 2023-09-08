package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.xweb.XWebReportRequestIpInterface;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.model.a2 */
public final class C6024a2 implements XWebReportRequestIpInterface {

    /* renamed from: a */
    public final /* synthetic */ C6067y1 f22270a;

    public C6024a2(C6067y1 y1Var) {
        this.f22270a = y1Var;
    }

    public final void onCallback(Bundle bundle) {
        C6067y1 y1Var = this.f22270a;
        C87412m.m108593f(bundle, "map");
        y1Var.getClass();
        ((C119157j) C119157j.f356862d).mo183876g(new C6071z1(bundle, y1Var), "WebViewReportIp");
    }
}
