package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.plugin.appbrand.debugger.C81745v;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83146c;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83188y;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.page.C83955v2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.appbrand.report.m */
public enum C84136m {
    MMV8,
    NodeJS,
    J2V8,
    WebViewXW,
    WebViewSystem,
    Invalid;
    

    /* renamed from: j */
    public static final C84136m[] f245619j = null;

    /* access modifiers changed from: public */
    static {
        C84136m mVar;
        C84136m mVar2;
        C84136m mVar3;
        f245619j = new C84136m[]{mVar, mVar3, mVar2};
    }

    /* renamed from: a */
    public static C84136m m103674a(C83165i iVar) {
        C84136m mVar = Invalid;
        if (iVar instanceof C83146c) {
            return J2V8;
        }
        if (iVar instanceof C83188y) {
            return NodeJS;
        }
        if (iVar instanceof C81745v) {
            return mVar;
        }
        if (iVar instanceof C83797e3) {
            if (iVar instanceof C83955v2) {
                iVar = ((C83955v2) iVar).f245101d;
            }
            if (iVar instanceof WebView) {
                WebView webView = (WebView) iVar;
                if (webView.isSysKernel()) {
                    return WebViewSystem;
                }
                if (webView.isXWalkKernel()) {
                    return WebViewXW;
                }
            }
            return mVar;
        } else if (!BuildInfo.DEBUG) {
            return mVar;
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = iVar == null ? "null" : iVar.getClass().getSimpleName();
            throw new IllegalStateException(String.format("Unrecognized JsRuntime %s", objArr));
        }
    }
}
