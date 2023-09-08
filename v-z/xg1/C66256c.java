package xg1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import qj1.C62660c;
import sx3.C64186f0;
import te3.C51587ur2;

/* renamed from: xg1.c */
public final class C66256c implements C53325a {

    /* renamed from: d */
    public final View f190314d;

    /* renamed from: e */
    public final Context f190315e;

    /* renamed from: f */
    public final C58124b f190316f;

    /* renamed from: g */
    public C66255b f190317g;

    /* renamed from: h */
    public List<? extends C51587ur2> f190318h = new ArrayList();

    public C66256c(View view, Context context, C45795b bVar, C58124b bVar2, C62660c cVar) {
        C87412m.m108594g(view, "viewRoot");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        C87412m.m108594g(cVar, "plugin");
        this.f190314d = view;
        this.f190315e = context;
        this.f190316f = bVar2;
    }

    /* renamed from: e */
    public void mo90343e(List<? extends C51587ur2> list) {
        Log.m105924i("FinderLiveLogoPresenter", "#updateBubbleInfo");
        if (list == null || list.isEmpty()) {
            this.f190318h = C64186f0.f181907d;
            C66255b bVar = this.f190317g;
            if (bVar != null) {
                bVar.mo73941C();
            }
            Log.m105924i("FinderLiveLogoPresenter", "#updateBubbleInfo data is null, return");
            return;
        }
        this.f190318h = list;
        C66255b bVar2 = this.f190317g;
        if (bVar2 != null) {
            bVar2.mo73942h0(list);
        }
    }

    public void onAttach(Object obj) {
        C66255b bVar = (C66255b) obj;
        C87412m.m108594g(bVar, "callback");
        this.f190317g = bVar;
    }

    public void onDetach() {
        C66255b bVar = this.f190317g;
        if (bVar != null) {
            bVar.mo73941C();
        }
    }
}
