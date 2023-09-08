package ha0;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager", mo125469f = "MaasManager.kt", mo125470l = {374}, mo125471m = "awaitLoadSo")
/* renamed from: ha0.u */
public final class C108234u extends C66704d {

    /* renamed from: d */
    public /* synthetic */ Object f324085d;

    /* renamed from: e */
    public final /* synthetic */ C108221t f324086e;

    /* renamed from: f */
    public int f324087f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108234u(C108221t tVar, C15601d<? super C108234u> dVar) {
        super(dVar);
        this.f324086e = tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f324085d = obj;
        this.f324087f |= Integer.MIN_VALUE;
        return C108221t.m146549a(this.f324086e, this);
    }
}
