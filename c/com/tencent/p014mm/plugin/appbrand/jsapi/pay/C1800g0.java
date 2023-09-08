package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import java.util.Map;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.g0 */
public class C1800g0 implements C1792b {

    /* renamed from: a */
    public final /* synthetic */ C88267e f11595a;

    /* renamed from: b */
    public final /* synthetic */ int f11596b;

    /* renamed from: c */
    public final /* synthetic */ C1802h0 f11597c;

    public C1800g0(C1802h0 h0Var, C88267e eVar, int i) {
        this.f11597c = h0Var;
        this.f11595a = eVar;
        this.f11596b = i;
    }

    /* renamed from: b */
    public void mo1764b(int i, int i2, String str, Map<String, Object> map) {
        if (i != 1) {
            C88267e eVar = this.f11595a;
            int i3 = this.f11596b;
            C1802h0 h0Var = this.f11597c;
            eVar.mo109647a(i3, h0Var.mo115112m("fail:" + str, map));
            return;
        }
        this.f11595a.mo109647a(this.f11596b, this.f11597c.mo115112m("ok", map));
    }
}
