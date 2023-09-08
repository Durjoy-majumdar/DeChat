package xk1;

import a14.C53916l;
import ak1.C54067f0;
import ak1.C54108o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import er1.C58728f5;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C60529u5;
import kotlin.Result;
import p1081gi.C98121d;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import uq1.C65458r;
import xk1.C66297d2;

/* renamed from: xk1.g2 */
public final class C66312g2 implements C65231j<C65220d> {

    /* renamed from: a */
    public final /* synthetic */ C53916l<C66297d2.C66298a> f190899a;

    /* renamed from: b */
    public final /* synthetic */ C66297d2 f190900b;

    public C66312g2(C53916l<? super C66297d2.C66298a> lVar, C66297d2 d2Var) {
        this.f190899a = lVar;
        this.f190900b = d2Var;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        String str;
        Class cls = C54108o.class;
        C87412m.m108594g(dVar, "task");
        C87412m.m108594g(nVar, "status");
        Log.m105924i("Finder.FinderLivePostUIC", "[dealWithCoverUrl] upload end");
        C65458r rVar = (C65458r) dVar;
        String str2 = null;
        if (nVar != C65234n.OK || Util.isNullOrNil(rVar.f188352h)) {
            C58124b bVar = this.f190900b.f190850f;
            boolean z = false;
            if (bVar != null && bVar.getLiveRole() == 1) {
                z = true;
            }
            if (z) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8600a((C8777j5) c, 4, String.valueOf(1), (String) null, 4, (Object) null);
                ((C54108o) C86312j.m106911c(cls)).getClass();
                C54108o.f151869h.f151437S = 3;
                ((C54108o) C86312j.m106911c(cls)).ay0(C54067f0.C54077p.LIVE_EXIT_ERROR);
            }
            C58728f5.m68215a(C58728f5.f168144a, "post", 1001, 0, nVar.toString(), this.f190900b.f190866y, (String) null, 32, (Object) null);
            this.f190899a.resumeWith(Result.m168114constructorimpl((Object) null));
            return;
        }
        C53916l<C66297d2.C66298a> lVar = this.f190899a;
        String str3 = rVar.f188352h;
        String str4 = rVar.f188353i;
        C60529u5 u5Var = this.f190900b.f190854j;
        if (u5Var == null || (str = u5Var.f172528h) == null) {
            str = "";
        }
        C98121d dVar2 = rVar.f188354j;
        if (dVar2 != null) {
            str2 = dVar2.field_filemd5;
        }
        lVar.resumeWith(Result.m168114constructorimpl(new C66297d2.C66298a(str3, str4, str, str2)));
    }
}
