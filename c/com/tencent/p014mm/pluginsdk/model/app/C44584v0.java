package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import nd3.C47223a;

/* renamed from: com.tencent.mm.pluginsdk.model.app.v0 */
public class C44584v0 implements C47223a {

    /* renamed from: a */
    public final /* synthetic */ C1256g f120889a;

    public C44584v0(IPCInstallApp iPCInstallApp, C1256g gVar) {
        this.f120889a = gVar;
    }

    /* renamed from: a */
    public void mo6947a(boolean z) {
        C1256g gVar = this.f120889a;
        if (gVar != null) {
            gVar.mo894a(new IPCBoolean(z));
        }
    }
}
