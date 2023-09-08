package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.p014mm.ipcinvoker.C1256g;
import di0.C86297n;
import gy3.C8480h;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.a */
public final class C81904a implements C86297n {

    /* renamed from: a */
    public final /* synthetic */ C1256g<BindRemoteServiceResult> f240241a;

    public C81904a(C1256g<BindRemoteServiceResult> gVar) {
        this.f240241a = gVar;
    }

    /* renamed from: a */
    public void mo1541a(int i, String str) {
        C1256g<BindRemoteServiceResult> gVar = this.f240241a;
        if (gVar != null) {
            gVar.mo894a(new BindRemoteServiceResult(i, str));
        }
    }

    public void onSuccess() {
        C1256g<BindRemoteServiceResult> gVar = this.f240241a;
        if (gVar != null) {
            gVar.mo894a(new BindRemoteServiceResult(0, (String) null, 2, (C8480h) null));
        }
    }
}
