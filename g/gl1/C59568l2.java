package gl1;

import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import cl1.C55001u;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import kz1.C46828m;
import rx3.C13598b0;
import vk1.C65761b;

/* renamed from: gl1.l2 */
public final class C59568l2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170271d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59568l2(C59559k kVar) {
        super(0);
        this.f170271d = kVar;
    }

    public Object invoke() {
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C46828m mVar = (C46828m) C86312j.m106911c(C46828m.class);
        C59559k kVar = this.f170271d;
        AppCompatActivity appCompatActivity = kVar.f166841e;
        String str = ((C54991o) kVar.mo83051g(cls2)).f154309e3;
        if (str == null && (str = ((C55001u) this.f170271d.mo83051g(cls)).f154420q.f182357C) == null) {
            str = "";
        }
        int i = ((C54991o) this.f170271d.mo83051g(cls2)).f154314f3;
        Boolean bool = Boolean.FALSE;
        mVar.mo72034dg(appCompatActivity, str, i, bool, bool, Long.valueOf(((C55001u) this.f170271d.mo83051g(cls)).f154420q.f182392d));
        C65761b bVar = this.f170271d.f166842f;
        if (bVar != null) {
            bVar.hideLoadingLayer(false);
        }
        ((C54991o) this.f170271d.mo83051g(cls2)).f154350p0 = false;
        C59559k kVar2 = this.f170271d;
        C65761b bVar2 = kVar2.f166842f;
        if (bVar2 != null) {
            bVar2.postDelayed(new C59565k2(kVar2), 200);
        }
        return C13598b0.f38549a;
    }
}
