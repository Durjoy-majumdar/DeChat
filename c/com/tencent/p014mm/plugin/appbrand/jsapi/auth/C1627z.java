package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.z */
public final class C1627z implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C1614a0 f11246a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f11247b;

    /* renamed from: c */
    public final /* synthetic */ int f11248c;

    public C1627z(C1614a0 a0Var, C81925i2 i2Var, int i) {
        this.f11246a = a0Var;
        this.f11247b = i2Var;
        this.f11248c = i;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        C1614a0 a0Var = this.f11246a;
        if (a0Var.f11217g != i) {
            return false;
        }
        C1614a0.m1652w(a0Var, intent, this.f11247b, this.f11248c, i2);
        return true;
    }
}
