package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import ie3.C8883h;
import ke3.C88144b;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.u4 */
public class C1881u4 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ Activity f11720a;

    /* renamed from: b */
    public final /* synthetic */ C82554k f11721b;

    /* renamed from: c */
    public final /* synthetic */ int f11722c;

    /* renamed from: d */
    public final /* synthetic */ C1884v4 f11723d;

    public C1881u4(C1884v4 v4Var, Activity activity, C82554k kVar, int i) {
        this.f11723d = v4Var;
        this.f11720a = activity;
        this.f11721b = kVar;
        this.f11722c = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1884v4 v4Var = this.f11723d;
        if (i != v4Var.f11728g) {
            return false;
        }
        if (i2 == -1) {
            new Intent().putExtra("key_mode", 1);
            C88144b.m109789g(this.f11720a, "wallet", ".balance.ui.lqt.WalletLqtPlanBeforeHomeUI");
            this.f11721b.mo109647a(this.f11722c, this.f11723d.mo115109j("ok"));
        } else {
            this.f11721b.mo109647a(this.f11722c, v4Var.mo115109j("fail"));
            if (!C8883h.m8692c()) {
                C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "openWCPayLQTDepositPlan:fail");
            }
        }
        if (!C8883h.m8692c()) {
            C8883h.f28150a = null;
        }
        return true;
    }
}
