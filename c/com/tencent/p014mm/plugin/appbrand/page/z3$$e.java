package com.tencent.p014mm.plugin.appbrand.page;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.URL;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z3$$e */
public class z3$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ URL f245188d;

    /* renamed from: e */
    public final /* synthetic */ String f245189e;

    /* renamed from: f */
    public final /* synthetic */ ValueCallback f245190f;

    /* renamed from: g */
    public final /* synthetic */ C83984z3 f245191g;

    public z3$$e(C83984z3 z3Var, URL url, String str, ValueCallback valueCallback) {
        this.f245191g = z3Var;
        this.f245188d = url;
        this.f245189e = str;
        this.f245190f = valueCallback;
    }

    public void run() {
        if (!this.f245191g.f245180p.get()) {
            if (this.f245188d != null) {
                C83780d1 d1Var = this.f245191g.f245172e;
                String Q0 = d1Var == null ? null : d1Var.mo116162Q0();
                C83780d1 d1Var2 = this.f245191g.f245172e;
                Log.m105925i("Luggage.MPWebViewRenderEngineLegacyImpl", "evaluateJavascript sourceURL:%s, componentURL:%s, componentId:%d, hash:%d", this.f245188d, Q0, Integer.valueOf(d1Var2 == null ? 0 : d1Var2.getComponentId()), Integer.valueOf(this.f245191g.hashCode()));
            }
            this.f245191g.mo72055Z0(this.f245189e, this.f245190f);
        }
    }
}
