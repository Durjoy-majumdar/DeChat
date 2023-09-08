package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i4 */
public class C1702i4 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f11404a;

    /* renamed from: b */
    public final /* synthetic */ int f11405b;

    /* renamed from: c */
    public final /* synthetic */ C1705j4 f11406c;

    public C1702i4(C1705j4 j4Var, C81925i2 i2Var, int i) {
        this.f11406c = j4Var;
        this.f11404a = i2Var;
        this.f11405b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1705j4 j4Var = this.f11406c;
        if (i != j4Var.f11410g) {
            return false;
        }
        if (i2 == -1) {
            this.f11404a.mo109647a(this.f11405b, j4Var.mo115109j("ok"));
            Log.m105924i("MicroMsg.JsApiOpenCard", "view card result is ok!");
            return true;
        } else if (i2 == 0) {
            this.f11404a.mo109647a(this.f11405b, j4Var.mo115109j("cancel"));
            Log.m105920e("MicroMsg.JsApiOpenCard", "view card result is cancel!");
            return true;
        } else {
            this.f11404a.mo109647a(this.f11405b, j4Var.mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenCard", "view card result is fail!");
            return true;
        }
    }
}
