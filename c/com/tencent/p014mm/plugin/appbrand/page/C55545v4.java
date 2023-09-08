package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.page.C83835k0;
import com.tencent.p014mm.plugin.appbrand.page.C83942u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.page.v4 */
public final class C55545v4 implements C83835k0.C55541f {

    /* renamed from: a */
    public final /* synthetic */ C83942u4.C55544b f158152a;

    public C55545v4(C83942u4.C55544b bVar) {
        this.f158152a = bVar;
    }

    /* renamed from: a */
    public final void mo77065a(C83699y yVar) {
        C87412m.m108594g(yVar, "menuInfo");
        Log.m105924i(this.f158152a.f158149b, "beforeMenuClick#reportOnActionSheetHideIfNeed");
        this.f158152a.mo77067a(3 == yVar.f244317a);
    }
}
