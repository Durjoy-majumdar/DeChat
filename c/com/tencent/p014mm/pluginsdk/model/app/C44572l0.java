package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import nd3.C47223a;

/* renamed from: com.tencent.mm.pluginsdk.model.app.l0 */
public class C44572l0 implements C1256g<IPCBoolean> {

    /* renamed from: d */
    public final /* synthetic */ C47223a f120871d;

    public C44572l0(C47223a aVar) {
        this.f120871d = aVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCBoolean iPCBoolean = (IPCBoolean) obj;
        C47223a aVar = this.f120871d;
        if (aVar == null) {
            return;
        }
        if (iPCBoolean.f10312d) {
            aVar.mo6947a(true);
        } else {
            aVar.mo6947a(false);
        }
    }
}
