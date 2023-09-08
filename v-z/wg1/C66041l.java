package wg1;

import android.content.Context;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: wg1.l */
public final class C66041l implements C66032j {

    /* renamed from: d */
    public final Context f189857d;

    /* renamed from: e */
    public final C58124b f189858e;

    /* renamed from: f */
    public C66034k f189859f;

    public C66041l(Context context, C45795b bVar, C58124b bVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f189857d = context;
        this.f189858e = bVar2;
    }

    public void onAttach(Object obj) {
        C66034k kVar = (C66034k) obj;
        C87412m.m108594g(kVar, "callback");
        this.f189859f = kVar;
    }

    public void onDetach() {
    }
}
