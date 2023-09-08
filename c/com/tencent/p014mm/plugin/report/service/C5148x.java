package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.LinkedList;
import java.util.Map;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49122dc;
import te3.ro4;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.report.service.x */
public final class C5148x<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry<Long, LinkedList<ro4>> f20539a;

    /* renamed from: b */
    public final /* synthetic */ C49122dc f20540b;

    public C5148x(Map.Entry<Long, ? extends LinkedList<ro4>> entry, C49122dc dcVar) {
        this.f20539a = entry;
        this.f20540b = dcVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256794b == 0 && cVar.f256793a == 0) {
            Log.m105924i("MicroMsg.UserDataOperationReporter", "upload succ. day " + this.f20539a.getKey().longValue() + ", size " + this.f20539a.getValue().size());
            return C13598b0.f38549a;
        }
        Log.m105920e("MicroMsg.UserDataOperationReporter", "upload err. day " + this.f20539a.getKey().longValue() + ". errCode:" + cVar.f256794b + " errType:" + cVar.f256793a + " errMsg:" + cVar.f256795c);
        C119179t tVar = C119157j.f356862d;
        C5147w wVar = new C5147w(this.f20540b, this.f20539a);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        return jVar.mo183879j(wVar, 0, "MicroMsg.UserDataOperationReporter");
    }
}
