package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.C1256g;
import di0.C86297n;
import gy3.C8480h;

/* renamed from: com.tencent.mm.plugin.appbrand.p */
public final class C83722p implements C86297n {

    /* renamed from: a */
    public final /* synthetic */ C1256g<BindRemoteServiceResult> f244367a;

    public C83722p(C1256g<BindRemoteServiceResult> gVar) {
        this.f244367a = gVar;
    }

    /* renamed from: a */
    public void mo1541a(int i, String str) {
        C1256g<BindRemoteServiceResult> gVar = this.f244367a;
        if (gVar != null) {
            gVar.mo894a(new BindRemoteServiceResult(i, str));
        }
    }

    public void onSuccess() {
        C1256g<BindRemoteServiceResult> gVar = this.f244367a;
        if (gVar != null) {
            gVar.mo894a(new BindRemoteServiceResult(0, (String) null, 2, (C8480h) null));
        }
    }
}
