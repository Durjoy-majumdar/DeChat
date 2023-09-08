package com.tencent.luggage.sdk.processes;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13604l;

/* renamed from: com.tencent.luggage.sdk.processes.j */
public final class C80262j extends C87413o implements C32224a<C13604l<? extends C80279o, ? extends PROCESS>> {

    /* renamed from: d */
    public final /* synthetic */ C80254f<PROCESS, PARAMS> f234960d;

    /* renamed from: e */
    public final /* synthetic */ String f234961e;

    /* renamed from: f */
    public final /* synthetic */ PARAMS f234962f;

    /* renamed from: g */
    public final /* synthetic */ LuggageServiceType f234963g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80262j(C80254f<PROCESS, PARAMS> fVar, String str, PARAMS params, LuggageServiceType luggageServiceType) {
        super(0);
        this.f234960d = fVar;
        this.f234961e = str;
        this.f234962f = params;
        this.f234963g = luggageServiceType;
    }

    public Object invoke() {
        return new C13604l(C80279o.CREATE_NEW, this.f234960d.mo111397l(this.f234961e, this.f234962f, this.f234963g));
    }
}
