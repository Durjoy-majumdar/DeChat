package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import ie3.C76324c;
import ie3.C8883h;
import ke3.C88144b;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.y4 */
public class C1911y4 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ int f11766a;

    /* renamed from: b */
    public final /* synthetic */ int f11767b;

    /* renamed from: c */
    public final /* synthetic */ Activity f11768c;

    /* renamed from: d */
    public final /* synthetic */ C82554k f11769d;

    /* renamed from: e */
    public final /* synthetic */ int f11770e;

    /* renamed from: f */
    public final /* synthetic */ C1914z4 f11771f;

    public C1911y4(C1914z4 z4Var, int i, int i2, Activity activity, C82554k kVar, int i3) {
        this.f11771f = z4Var;
        this.f11766a = i;
        this.f11767b = i2;
        this.f11768c = activity;
        this.f11769d = kVar;
        this.f11770e = i3;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1914z4 z4Var = this.f11771f;
        if (i != z4Var.f11779g) {
            return false;
        }
        if (i2 == -1) {
            Intent intent2 = new Intent();
            intent2.putExtra("key_account_type", 1);
            if (this.f11766a == 1) {
                intent2.putExtra("show_open_toast", this.f11767b);
                C88144b.m109791i(this.f11768c, "wallet", ".balance.ui.lqt.WalletLqtBalanceAutoTransferUI", intent2, (Bundle) null);
            } else if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtDetailUseCase(this.f11768c, intent2)) {
                C88144b.m109791i(this.f11768c, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent2, (Bundle) null);
            }
            this.f11769d.mo109647a(this.f11770e, this.f11771f.mo115109j("ok"));
        } else {
            this.f11769d.mo109647a(this.f11770e, z4Var.mo115109j("fail"));
            if (!C8883h.m8692c()) {
                C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "JsApiOpenWCPayLQTDetail:fail");
            }
        }
        if (!C8883h.m8692c()) {
            C8883h.f28150a = null;
        }
        return true;
    }
}
