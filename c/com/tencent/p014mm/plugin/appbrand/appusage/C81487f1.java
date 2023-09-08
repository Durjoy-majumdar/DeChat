package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.appbrand.appusage.C81495g1;
import hp3.C87581a;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.f1 */
public final class C81487f1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C81495g1.C81497b f239083a;

    /* renamed from: b */
    public final /* synthetic */ int f239084b;

    /* renamed from: c */
    public final /* synthetic */ long f239085c;

    public C81487f1(C81495g1.C81497b bVar, int i, long j) {
        this.f239083a = bVar;
        this.f239084b = i;
        this.f239085c = j;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C81495g1.C81497b bVar = this.f239083a;
        if (bVar != null) {
            bVar.mo113780a(cVar);
        }
        C47350c cVar2 = null;
        if (cVar == null) {
            return null;
        }
        int i = this.f239084b;
        long j = this.f239085c;
        int i2 = cVar.f256793a;
        int i3 = cVar.f256794b;
        String str = cVar.f256795c;
        C117747y yVar = cVar.f256797e;
        C114799u reqResp = yVar != null ? yVar.getReqResp() : null;
        if (reqResp instanceof C47350c) {
            cVar2 = (C47350c) reqResp;
        }
        C81506j0.m99997b(i, i2, i3, str, cVar2, Long.valueOf(j));
        return cVar;
    }
}
