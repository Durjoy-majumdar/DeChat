package com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.b */
public class C1649b implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82554k f11287a;

    /* renamed from: b */
    public final /* synthetic */ int f11288b;

    /* renamed from: c */
    public final /* synthetic */ C1650c f11289c;

    public C1649b(C1650c cVar, C82554k kVar, int i) {
        this.f11289c = cVar;
        this.f11287a = kVar;
        this.f11288b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        if (i != 1000) {
            return false;
        }
        Bundle bundle = null;
        if (i2 == -1) {
            Log.m105924i("MicroMsg.JsApiStartSoterAuthentication", "hy: soter auth ok");
            C1650c cVar = this.f11289c;
            C82554k kVar = this.f11287a;
            int i3 = this.f11288b;
            if (intent != null) {
                bundle = intent.getExtras();
            }
            C1650c.m1703w(cVar, kVar, i3, bundle, "ok");
        } else if (i2 == 1) {
            Log.m105928w("MicroMsg.JsApiStartSoterAuthentication", "hy: soter auth failed");
            C1650c cVar2 = this.f11289c;
            C82554k kVar2 = this.f11287a;
            int i4 = this.f11288b;
            if (intent != null) {
                bundle = intent.getExtras();
            }
            C1650c.m1703w(cVar2, kVar2, i4, bundle, "fail");
        } else {
            Log.m105920e("MicroMsg.JsApiStartSoterAuthentication", "hy: soter user cancelled");
            C1650c cVar3 = this.f11289c;
            C82554k kVar3 = this.f11287a;
            int i5 = this.f11288b;
            if (intent != null) {
                bundle = intent.getExtras();
            }
            C1650c.m1703w(cVar3, kVar3, i5, bundle, "cancel");
        }
        return true;
    }
}
