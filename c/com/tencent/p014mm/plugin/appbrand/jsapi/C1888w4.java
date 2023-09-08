package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import ie3.C8883h;
import ke3.C88144b;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.w4 */
public class C1888w4 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ Activity f11730a;

    /* renamed from: b */
    public final /* synthetic */ C82554k f11731b;

    /* renamed from: c */
    public final /* synthetic */ int f11732c;

    /* renamed from: d */
    public final /* synthetic */ C1908x4 f11733d;

    public C1888w4(C1908x4 x4Var, Activity activity, C82554k kVar, int i) {
        this.f11733d = x4Var;
        this.f11730a = activity;
        this.f11731b = kVar;
        this.f11732c = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1908x4 x4Var = this.f11733d;
        if (i != x4Var.f11762g) {
            return false;
        }
        if (i2 == -1) {
            Intent intent2 = new Intent();
            intent2.putExtra("key_mode", 1);
            C88144b.m109791i(this.f11730a, "wallet", ".balance.ui.lqt.WalletLqtPlanAddUI", intent2, (Bundle) null);
            this.f11731b.mo109647a(this.f11732c, this.f11733d.mo115109j("ok"));
        } else {
            this.f11731b.mo109647a(this.f11732c, x4Var.mo115109j("fail"));
            if (!C8883h.m8692c()) {
                C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "openWCPayLQTDepositPlanAdd:fail");
            }
        }
        if (!C8883h.m8692c()) {
            C8883h.f28150a = null;
        }
        return true;
    }
}
