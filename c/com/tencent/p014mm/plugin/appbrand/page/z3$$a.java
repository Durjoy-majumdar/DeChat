package com.tencent.p014mm.plugin.appbrand.page;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82836n0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z3$$a */
public final /* synthetic */ class z3$$a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C83984z3 f245184a;

    public /* synthetic */ z3$$a(C83984z3 z3Var) {
        this.f245184a = z3Var;
    }

    public final void onReceiveValue(Object obj) {
        C83984z3 z3Var = this.f245184a;
        C82836n0.m101587a(z3Var.f245172e, z3Var, (String) obj);
        ((C119157j) C119157j.f356862d).mo183895z(new z3$$b(z3Var));
    }
}
