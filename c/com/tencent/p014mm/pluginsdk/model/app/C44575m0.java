package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import nd3.C47223a;

/* renamed from: com.tencent.mm.pluginsdk.model.app.m0 */
public class C44575m0 implements C1256g<IPCBoolean> {

    /* renamed from: d */
    public final /* synthetic */ C47223a f120873d;

    public C44575m0(C47223a aVar) {
        this.f120873d = aVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCBoolean iPCBoolean = (IPCBoolean) obj;
        C47223a aVar = this.f120873d;
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
