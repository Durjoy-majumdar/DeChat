package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.sdk.platformtools.Log;
import p1044ub.C90630c;

/* renamed from: com.tencent.mm.plugin.appbrand.page.b */
public class C83760b implements C83809g3 {

    /* renamed from: a */
    public final /* synthetic */ C83745a f244493a;

    public C83760b(C83745a aVar) {
        this.f244493a = aVar;
    }

    /* renamed from: a */
    public void mo111277a(AppBrandPageFullScreenView appBrandPageFullScreenView) {
        if (((C90630c) this.f244493a.mo124764Z()).f244572U == null) {
            Log.m105921e("Luggage.AbstractMPPageViewRenderer", "FullScreenViewAttach getContainerPage is null, check time sequence, err, appId[%s], url[%s]", this.f244493a.mo125215b0(), this.f244493a.f244457j);
            return;
        }
        ((C90630c) this.f244493a.mo124764Z()).f244572U.mo116288e((C83780d1) this.f244493a.mo124764Z(), appBrandPageFullScreenView);
    }
}
