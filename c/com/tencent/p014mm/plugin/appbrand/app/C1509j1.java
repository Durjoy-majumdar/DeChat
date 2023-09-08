package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import p210o.C11323a;

/* renamed from: com.tencent.mm.plugin.appbrand.app.j1 */
public final class C1509j1<I, O> implements C11323a {

    /* renamed from: a */
    public final /* synthetic */ C1256g<IPCString> f10863a;

    public C1509j1(C1256g<IPCString> gVar) {
        this.f10863a = gVar;
    }

    public Object apply(Object obj) {
        String str = (String) obj;
        C1256g<IPCString> gVar = this.f10863a;
        if (gVar != null) {
            gVar.mo894a(new IPCString(str));
        }
        return Boolean.TRUE;
    }
}
