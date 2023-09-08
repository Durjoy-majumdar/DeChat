package p284zb;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import fo0.C87017e;

/* renamed from: zb.d$$d */
public final /* synthetic */ class d$$d implements C87017e {

    /* renamed from: d */
    public final /* synthetic */ C91633d f262550d;

    public /* synthetic */ d$$d(C91633d dVar) {
        this.f262550d = dVar;
    }

    /* renamed from: kG */
    public final boolean mo121427kG(Runnable runnable) {
        C91633d dVar = this.f262550d;
        C83181q qVar = (C83181q) dVar.mo125506P0().mo63321n0(C83181q.class);
        C81925i2 i2Var = (C81925i2) dVar.mo124764Z();
        if (qVar == null || i2Var == null) {
            return false;
        }
        qVar.post(new d$$g(dVar, runnable));
        return true;
    }
}
