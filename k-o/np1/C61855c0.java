package np1;

import android.content.Context;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86299o;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C60169f4;
import zc1.C66785b;

/* renamed from: np1.c0 */
public final class C61855c0 {

    /* renamed from: a */
    public static final C61855c0 f175880a = new C61855c0();

    /* renamed from: a */
    public final void mo86788a(C45795b bVar, C86299o oVar, long j, long j2) {
        C45795b bVar2 = bVar;
        C86299o oVar2 = oVar;
        C87412m.m108594g(bVar2, "liveData");
        C87412m.m108594g(oVar2, "bundle");
        C60169f4 f4Var = (C60169f4) C86312j.m106911c(C60169f4.class);
        if (f4Var != null) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C61882w wVar = C61882w.f175962a;
            wVar.getClass();
            boolean z = C61882w.f175964c;
            wVar.getClass();
            boolean z2 = C61882w.f175965d;
            String valueOf = String.valueOf(((C55001u) bVar2.mo71262a(C55001u.class)).f154420q.f182392d);
            String O5 = C66785b.f191882e.mo90662O5();
            String valueOf2 = String.valueOf(((C54991o) bVar2.mo71262a(C54991o.class)).f154325i1);
            String str = oVar2.f250930b;
            if (str == null) {
                str = "";
            }
            f4Var.mo83290Gr(context, z, z2, valueOf, O5, "", valueOf2, j, j2, str, "");
        }
    }
}
