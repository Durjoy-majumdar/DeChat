package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C8883h;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e5 */
public class C1674e5 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82554k f11349a;

    /* renamed from: b */
    public final /* synthetic */ int f11350b;

    /* renamed from: c */
    public final /* synthetic */ C1680f5 f11351c;

    public C1674e5(C1680f5 f5Var, C82554k kVar, int i) {
        this.f11351c = f5Var;
        this.f11349a = kVar;
        this.f11350b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.JsApiPhoneBindCardEntry", "on Activity result: %s", Integer.valueOf(i2));
        C1680f5 f5Var = this.f11351c;
        if (i != f5Var.f11357g) {
            return false;
        }
        if (i2 == -1) {
            this.f11349a.mo109647a(this.f11350b, f5Var.mo115109j("ok"));
        } else if (i2 == 0) {
            this.f11349a.mo109647a(this.f11350b, f5Var.mo115109j("cancel"));
        } else {
            this.f11349a.mo109647a(this.f11350b, f5Var.mo115109j("fail"));
            if (!C8883h.m8692c()) {
                C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "phoneBindCardEntry:fail");
            }
        }
        if (!C8883h.m8692c()) {
            C8883h.f28150a = null;
        }
        return true;
    }
}
