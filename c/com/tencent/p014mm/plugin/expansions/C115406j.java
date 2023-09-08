package com.tencent.p014mm.plugin.expansions;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1174c5.C113245c;
import p1174c5.C113248f;

/* renamed from: com.tencent.mm.plugin.expansions.j */
public class C115406j implements C80883e<IPCVoid, IPCBoolean> {
    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "ipc invoke receive remote expansions call, request");
        C115402f fVar = new C115402f(this, gVar);
        C113248f.m155038a(new C115405i(this, fVar)).mo165791b(new C115403g(this, fVar), C113248f.f338847g, (C113245c) null);
    }
}
