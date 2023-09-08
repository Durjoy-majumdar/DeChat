package wg1;

import android.content.Context;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: wg1.p */
public final class C15333p implements C15324n {

    /* renamed from: d */
    public final Context f41662d;

    /* renamed from: e */
    public final C58124b f41663e;

    /* renamed from: f */
    public C15328o f41664f;

    public C15333p(Context context, C45795b bVar, C58124b bVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f41662d = context;
        this.f41663e = bVar2;
    }

    public void onAttach(Object obj) {
        C15328o oVar = (C15328o) obj;
        C87412m.m108594g(oVar, "callback");
        this.f41664f = oVar;
    }

    public void onDetach() {
    }
}
