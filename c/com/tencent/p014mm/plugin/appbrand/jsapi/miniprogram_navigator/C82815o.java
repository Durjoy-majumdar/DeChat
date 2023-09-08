package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82807l;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C46888b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.o */
public class C82815o implements C82794c.C82796b {

    /* renamed from: a */
    public final /* synthetic */ C46888b f242203a;

    /* renamed from: b */
    public final /* synthetic */ C82807l.C82812d f242204b;

    public C82815o(C82807l.C82812d dVar, C46888b bVar) {
        this.f242204b = dVar;
        this.f242203a = bVar;
    }

    /* renamed from: a */
    public void mo115050a(C82794c.C82796b.C82797a aVar) {
        C82807l.C82812d dVar = this.f242204b;
        Log.m105925i("MicroMsg.MiniProgramNavigator", "navigateTo fromAppID(%s) targetAppID(%s), navigation performOverride(%s)", dVar.f242196c, dVar.f242197d, aVar);
        if (aVar.ordinal() != 0) {
            this.f242203a.mo72091a(aVar);
            return;
        }
        this.f242203a.mo72093c(Boolean.TRUE);
    }
}
