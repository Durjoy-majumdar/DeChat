package gq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gq0.C107885g0;
import qo3.C77407n;

/* renamed from: gq0.w */
public final class C107900w implements C77407n.C77422t {

    /* renamed from: a */
    public final /* synthetic */ C107895q f323074a;

    public C107900w(C107895q qVar) {
        this.f323074a = qVar;
    }

    /* renamed from: a */
    public final void mo25383a() {
        Log.m105924i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onClick");
        C107885g0.C45943b bVar = C107885g0.C45943b.ENABLE;
        C107895q qVar = this.f323074a;
        if (bVar == qVar.f323061j.f323064a) {
            qVar.f323056e.mo107572p();
            C107895q qVar2 = this.f323074a;
            C107879e0 e0Var = qVar2.f323058g;
            if (e0Var == null) {
                e0Var = C107869a.f323008o.mo158296b(qVar2.f323055d, qVar2.f323056e, qVar2.f323057f, qVar2.f323059h, qVar2.f323060i);
                qVar2.f323058g = e0Var;
            }
            e0Var.show();
        }
    }
}
