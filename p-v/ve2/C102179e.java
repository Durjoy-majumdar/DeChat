package ve2;

import di3.C86312j;
import gy3.C87412m;
import ke2.C99129c;
import xe2.C102630a;
import xe2.C102631b;
import z04.C112550d0;

/* renamed from: ve2.e */
public abstract class C102179e extends C102174a {

    /* renamed from: e */
    public final C102630a f300868e;

    /* renamed from: f */
    public final long f300869f;

    /* renamed from: g */
    public long f300870g;

    public C102179e(C102630a aVar) {
        C87412m.m108594g(aVar, "msgDbItem");
        this.f300868e = aVar;
        String r2 = aVar.mo142476r2();
        C87412m.m108593f(r2, "msgDbItem.msgItemId");
        this.f300869f = Long.parseLong((String) C112550d0.m153785U(r2, new String[]{"_"}, false, 0, 6, (Object) null).get(0));
    }

    /* renamed from: e */
    public static /* synthetic */ void m134640e(C102179e eVar, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            eVar.mo141719d(i, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preDownloadEnd");
    }

    /* renamed from: d */
    public final void mo141719d(int i, int i2) {
        C102183h hVar = this.f300858d;
        if (hVar != null) {
            C102182g gVar = (C102182g) hVar;
            String r2 = this.f300868e.mo142476r2();
            C87412m.m108593f(r2, "msgDbItem.msgItemId");
            gVar.mo129635a(i, i2, r2, this.f300870g, this.f300868e.mo142472n2() == 1);
        }
    }

    /* renamed from: f */
    public final void mo141720f() {
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        C102631b bVar = cVar.f290673z;
        String r2 = this.f300868e.mo142476r2();
        C87412m.m108593f(r2, "msgDbItem.msgItemId");
        bVar.mo142289f3(r2, this.f300870g);
    }
}
