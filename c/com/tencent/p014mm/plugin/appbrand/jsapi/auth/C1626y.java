package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C81925i2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.y */
public final class C1626y implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C1614a0 f11243d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f11244e;

    /* renamed from: f */
    public final /* synthetic */ int f11245f;

    public C1626y(C1614a0 a0Var, C81925i2 i2Var, int i) {
        this.f11243d = a0Var;
        this.f11244e = i2Var;
        this.f11245f = i;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C1614a0 a0Var = this.f11243d;
        if (a0Var.f11217g == i) {
            C1614a0.m1652w(a0Var, intent, this.f11244e, this.f11245f, i2);
        }
    }
}
