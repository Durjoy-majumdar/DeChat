package com.tencent.p014mm.plugin.appbrand.appcache;

import fy3.C32224a;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.i3 */
public class C29224i3 implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ List f79874d;

    /* renamed from: e */
    public final /* synthetic */ List f79875e;

    /* renamed from: f */
    public final /* synthetic */ C81258h3 f79876f;

    public C29224i3(C81258h3 h3Var, List list, List list2) {
        this.f79876f = h3Var;
        this.f79874d = list;
        this.f79875e = list2;
    }

    public Object invoke() {
        for (int i = 0; i < this.f79874d.size(); i++) {
            this.f79876f.mo113519c((String) this.f79874d.get(i), ((Integer) this.f79875e.get(i)).intValue());
        }
        return Boolean.TRUE;
    }
}
