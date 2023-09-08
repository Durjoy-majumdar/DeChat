package com.tencent.luggage.sdk.processes;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.luggage.sdk.processes.d */
public final class C0933d<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f2139d;

    public C0933d(C32224a<C13598b0> aVar) {
        this.f2139d = aVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        C32224a<C13598b0> aVar = this.f2139d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
