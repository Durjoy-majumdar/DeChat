package com.tencent.p014mm.plugin.appbrand.weishi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;

/* renamed from: com.tencent.mm.plugin.appbrand.weishi.k */
public class C84914k implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f247449d;

    /* renamed from: e */
    public final /* synthetic */ C84909g f247450e;

    public C84914k(C84909g gVar, C83928t1 t1Var) {
        this.f247450e = gVar;
        this.f247449d = t1Var;
    }

    public void onDestroy() {
        C84909g.m104627w(this.f247450e);
        this.f247449d.mo114867r(this);
    }
}
