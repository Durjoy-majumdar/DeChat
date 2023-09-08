package com.tencent.p014mm.plugin.appbrand.page;

import android.webkit.ValueCallback;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z3$$f */
public class z3$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f245192d;

    /* renamed from: e */
    public final /* synthetic */ ValueCallback f245193e;

    /* renamed from: f */
    public final /* synthetic */ C83984z3 f245194f;

    public z3$$f(C83984z3 z3Var, String str, ValueCallback valueCallback) {
        this.f245194f = z3Var;
        this.f245192d = str;
        this.f245193e = valueCallback;
    }

    public void run() {
        this.f245194f.f245101d.evaluateJavascript(this.f245192d, this.f245193e);
    }
}
