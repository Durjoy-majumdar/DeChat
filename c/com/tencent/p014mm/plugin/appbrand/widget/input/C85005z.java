package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.z */
public class C85005z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f247731d;

    /* renamed from: e */
    public final /* synthetic */ String f247732e;

    /* renamed from: f */
    public final /* synthetic */ Integer f247733f;

    public C85005z(C83780d1 d1Var, String str, Integer num) {
        this.f247731d = d1Var;
        this.f247732e = str;
        this.f247733f = num;
    }

    public void run() {
        C84954e1<?> a;
        C104863f1 orDefault = C84947c0.f247598f.getOrDefault(this.f247731d, null);
        if (orDefault != null && (a = C84947c0.m104713a(this.f247731d, orDefault.getInputId())) != null) {
            a.mo117820e(this.f247732e, this.f247733f);
        }
    }
}
