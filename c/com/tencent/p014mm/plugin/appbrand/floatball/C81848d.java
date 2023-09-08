package com.tencent.p014mm.plugin.appbrand.floatball;

import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82234f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p646pn.C100824i;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.d */
public final class C81848d implements C82250m.C82253c {

    /* renamed from: a */
    public final String f240123a;

    /* renamed from: b */
    public final /* synthetic */ C81845c f240124b;

    public C81848d(C81845c cVar) {
        this.f240124b = cVar;
        this.f240123a = cVar.f240118t;
    }

    /* renamed from: a */
    public void mo114243a(boolean z) {
        String str = this.f240124b.f240118t;
        Log.m105924i(str, "onStateChange, isEnabled: " + z);
        C81845c cVar = this.f240124b;
        String str2 = cVar.f240118t;
        Log.m105924i(str2, "onBackgroundSupportStateChange, isEnabled: " + z);
        if (!z) {
            cVar.mo68418k();
        } else if (!cVar.mo90541w()) {
            Log.m105924i(cVar.f240118t, "onBackgroundSupportStateChange, add ball");
            cVar.mo149077r0(true);
            cVar.mo90537e(true ^ C82234f.f241133b.mo114636e(cVar.f240117s));
            cVar.mo149078s0(((C100824i) C86312j.m106911c(C100824i.class)).mo139644ye(cVar.f311726d.f311679D, 4096));
            cVar.mo68419u();
        }
    }

    /* renamed from: b */
    public String mo114244b() {
        return this.f240123a;
    }
}
