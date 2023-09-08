package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C8883h;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o4 */
public class C1765o4 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82554k f11503a;

    /* renamed from: b */
    public final /* synthetic */ int f11504b;

    /* renamed from: c */
    public final /* synthetic */ C1774p4 f11505c;

    public C1765o4(C1774p4 p4Var, C82554k kVar, int i) {
        this.f11505c = p4Var;
        this.f11503a = kVar;
        this.f11504b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1774p4 p4Var = this.f11505c;
        if (i != p4Var.f11531g) {
            return false;
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("key_callback");
            Log.m105925i("MicroMsg.JsApiOpenOfflinePayView", "callback: %s", stringExtra);
            this.f11503a.mo109647a(this.f11504b, this.f11505c.mo115109j(stringExtra));
            C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "openOfflinePayView:ok");
        } else {
            this.f11503a.mo109647a(this.f11504b, p4Var.mo115109j("fail"));
            if (!C8883h.m8692c()) {
                C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "openOfflinePayView:fail");
            }
        }
        if (!C8883h.m8692c()) {
            C8883h.f28150a = null;
        }
        return true;
    }
}
