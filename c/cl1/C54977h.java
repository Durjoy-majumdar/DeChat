package cl1;

import android.view.ViewGroup;
import android.view.ViewParent;
import cl1.C54951d;
import d50.C58115i;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import j50.C60735a;
import r50.C63367f;
import rx3.C13598b0;
import te3.C50516na1;
import tf0.C64918r1;

/* renamed from: cl1.h */
public final class C54977h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54951d f154105d;

    /* renamed from: e */
    public final /* synthetic */ C50516na1 f154106e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54977h(C54951d dVar, C50516na1 na12) {
        super(0);
        this.f154105d = dVar;
        this.f154106e = na12;
    }

    public Object invoke() {
        C58115i iVar;
        Class cls = C64918r1.class;
        C54951d.C54953c cVar = this.f154105d.f154008p;
        boolean z = false;
        if (cVar != null) {
            cVar.f154021B = System.currentTimeMillis();
            cVar.getPlayer().mo35687b(false);
        }
        C54951d dVar = this.f154105d;
        C54951d.C54953c cVar2 = dVar.f154008p;
        if (cVar2 != null) {
            cVar2.setOnVideoError(new C54971e(dVar, this.f154106e));
        }
        C54951d dVar2 = this.f154105d;
        C54951d.C54953c cVar3 = dVar2.f154008p;
        if (cVar3 != null) {
            cVar3.setOnVideoComplete(new C54972f(dVar2, this.f154106e));
        }
        C54951d dVar3 = this.f154105d;
        C54951d.C54953c cVar4 = dVar3.f154008p;
        if (cVar4 != null) {
            cVar4.setOnProgressChange(new C54975g(dVar3));
        }
        C60735a iV = ((C64918r1) C86312j.m106911c(cls)).mo89057iV();
        C54951d dVar4 = this.f154105d;
        C54951d.C54953c cVar5 = dVar4.f154008p;
        if (cVar5 != null) {
            cVar5.setOnVideoSizeChange(dVar4.f154012t);
        }
        if (!(iV == null || (iVar = iV.f172989A) == null || !iVar.mo82888j())) {
            z = true;
        }
        if (z) {
            C54951d dVar5 = this.f154105d;
            dVar5.getClass();
            ((C64918r1) C86312j.m106911c(cls)).E00(dVar5.f154008p);
        } else {
            C54951d dVar6 = this.f154105d;
            dVar6.getClass();
            ViewGroup viewGroup = null;
            C63367f U = iV != null ? iV.mo75579U() : null;
            if (U != null) {
                C54951d.C54953c cVar6 = dVar6.f154008p;
                ViewParent parent = cVar6 != null ? cVar6.getParent() : null;
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(dVar6.f154008p);
                }
                C54951d.C54953c cVar7 = dVar6.f154008p;
                if (cVar7 != null) {
                    U.mo88272b(cVar7);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
