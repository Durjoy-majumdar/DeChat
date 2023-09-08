package fl1;

import cl1.C54991o;
import cl1.C55001u;
import di3.C86312j;
import gy3.C87412m;
import ik1.C33342f;
import p165hr.C60106t;
import rx3.C36570n;

/* renamed from: fl1.b */
public final class C59152b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59158e f169173d;

    public C59152b(C59158e eVar) {
        this.f169173d = eVar;
    }

    public final void run() {
        C33342f fVar = (C33342f) ((C36570n) ((C60106t) C86312j.m106911c(C60106t.class)).f171517q).getValue();
        String valueOf = String.valueOf(((C55001u) ((C54991o) this.f169173d.mo83051g(C54991o.class)).business(C55001u.class)).f154420q.f182392d);
        fVar.getClass();
        C87412m.m108594g(valueOf, "liveId");
        fVar.f90382e.execSQL("FinderLiveLastRewardInfo", "DELETE FROM FinderLiveLastRewardInfo WHERE liveId = '" + valueOf + '\'');
    }
}
