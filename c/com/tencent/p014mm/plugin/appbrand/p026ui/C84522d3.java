package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.p026ui.C84524e3;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.d3 */
public class C84522d3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f246662d;

    /* renamed from: e */
    public final /* synthetic */ String f246663e;

    /* renamed from: f */
    public final /* synthetic */ C84524e3 f246664f;

    public C84522d3(C84524e3 e3Var, String str, String str2) {
        this.f246664f = e3Var;
        this.f246662d = str;
        this.f246663e = str2;
    }

    public void run() {
        C84524e3 e3Var = this.f246664f;
        String str = this.f246662d;
        String str2 = this.f246663e;
        C84524e3.C84525b bVar = e3Var.f246668f.get(str.hashCode());
        if (bVar == null) {
            bVar = new C84524e3.C84525b(e3Var, e3Var.getContext());
            bVar.f246671d = str;
            bVar.mo117211a();
            e3Var.addView(bVar);
            e3Var.f246668f.put(str.hashCode(), bVar);
        }
        bVar.f246672e = str2;
        bVar.mo117211a();
    }
}
