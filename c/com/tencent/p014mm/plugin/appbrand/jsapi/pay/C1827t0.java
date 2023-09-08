package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.t0 */
public class C1827t0 implements C1792b {

    /* renamed from: a */
    public final /* synthetic */ C88267e f11631a;

    /* renamed from: b */
    public final /* synthetic */ int f11632b;

    /* renamed from: c */
    public final /* synthetic */ C1829u0 f11633c;

    public C1827t0(C1829u0 u0Var, C88267e eVar, int i) {
        this.f11633c = u0Var;
        this.f11631a = eVar;
        this.f11632b = i;
    }

    /* renamed from: b */
    public void mo1764b(int i, int i2, String str, Map<String, Object> map) {
        if (i == 1) {
            this.f11631a.mo109647a(this.f11632b, this.f11633c.mo115109j("ok"));
        } else if (i != 2) {
            this.f11631a.mo109647a(this.f11632b, this.f11633c.mo115109j("cancel"));
        } else if (Util.isNullOrNil(str)) {
            this.f11631a.mo109647a(this.f11632b, this.f11633c.mo115109j("fail"));
        } else {
            this.f11631a.mo109647a(this.f11632b, this.f11633c.mo115109j(String.format("fail %s", new Object[]{str})));
        }
    }
}
