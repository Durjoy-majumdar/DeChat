package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C8883h;
import ke3.C88144b;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.a5 */
public class C1577a5 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ Activity f11041a;

    /* renamed from: b */
    public final /* synthetic */ C82554k f11042b;

    /* renamed from: c */
    public final /* synthetic */ int f11043c;

    /* renamed from: d */
    public final /* synthetic */ C1630b5 f11044d;

    public C1577a5(C1630b5 b5Var, Activity activity, C82554k kVar, int i) {
        this.f11044d = b5Var;
        this.f11041a = activity;
        this.f11042b = kVar;
        this.f11043c = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        Log.m105919d("MicroMsg.JsApiOpenWCPayLQTSave", "activity result: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == (this.f11044d.hashCode() & 65535)) {
            if (i2 == -1) {
                C88144b.m109795m(this.f11041a, "wallet", ".balance.ui.lqt.WalletLqtBeforeSaveUI", new Intent(), this.f11044d.hashCode() & 65534);
                this.f11042b.mo109647a(this.f11043c, this.f11044d.mo115109j("ok"));
            } else {
                this.f11042b.mo109647a(this.f11043c, this.f11044d.mo115109j("fail"));
                if (!C8883h.m8692c()) {
                    C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "JsApiOpenWCPayLQTSave:fail");
                }
            }
            if (!C8883h.m8692c()) {
                C8883h.f28150a = null;
            }
            return true;
        } else if (i == (this.f11044d.hashCode() & 65534)) {
            return false;
        } else {
            Log.m105918d("MicroMsg.JsApiOpenWCPayLQTSave", "beforeSave callback");
            if (i2 == -1) {
                this.f11042b.mo109647a(this.f11043c, this.f11044d.mo115109j("ok"));
            } else {
                this.f11042b.mo109647a(this.f11043c, this.f11044d.mo115109j("fail"));
            }
            return true;
        }
    }
}
