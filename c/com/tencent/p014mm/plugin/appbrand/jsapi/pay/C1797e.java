package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import java.util.Map;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.e */
public class C1797e implements C1792b {

    /* renamed from: a */
    public final /* synthetic */ C88267e f11588a;

    /* renamed from: b */
    public final /* synthetic */ int f11589b;

    /* renamed from: c */
    public final /* synthetic */ C1798f f11590c;

    public C1797e(C1798f fVar, C88267e eVar, int i) {
        this.f11590c = fVar;
        this.f11588a = eVar;
        this.f11589b = i;
    }

    /* renamed from: b */
    public void mo1764b(int i, int i2, String str, Map<String, Object> map) {
        if (i != 1) {
            this.f11588a.mo109647a(this.f11589b, this.f11590c.mo115109j("fail"));
        } else {
            this.f11588a.mo109647a(this.f11589b, this.f11590c.mo115109j("ok"));
        }
    }
}
