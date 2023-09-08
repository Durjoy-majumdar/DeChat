package dp1;

import android.content.Context;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import je1.C46534r2;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90363p0;
import sx3.C90364q0;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C64689rq2;

/* renamed from: dp1.q */
public final class C7450q {

    /* renamed from: a */
    public static final C7450q f25643a = new C7450q();

    /* renamed from: f */
    public static void m7581f(C7450q qVar, C49712hj1 hj12, C0740i2 i2Var, int i, String str, int i2, int i3, Object obj) {
        int i4 = (i3 & 16) != 0 ? 0 : i2;
        qVar.getClass();
        if (i2Var instanceof BaseFinderFeed) {
            qVar.mo8597e(hj12, ((BaseFinderFeed) i2Var).mo3513o(), i, str, i4);
        }
    }

    /* renamed from: a */
    public final void mo8593a(Context context, C0740i2 i2Var, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(i2Var, "feed");
        mo8594b(((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3(), i2Var, i);
    }

    /* renamed from: b */
    public final void mo8594b(C49712hj1 hj12, C0740i2 i2Var, int i) {
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(i2Var, "feed");
        m7581f(this, hj12, i2Var, i, C58403t.f167322q.mo83248b(C90363p0.m113143b(new C13604l("feedActionType", Integer.valueOf(i)))), 0, 16, (Object) null);
    }

    /* renamed from: c */
    public final void mo8595c(C49712hj1 hj12, C0740i2 i2Var, int i, String str) {
        C87412m.m108594g(str, "strValue");
        C49712hj1 hj13 = hj12;
        C0740i2 i2Var2 = i2Var;
        int i2 = i;
        m7581f(this, hj13, i2Var2, i2, C58403t.f167322q.mo83248b(C90364q0.m113147f(new C13604l("feedActionType", Integer.valueOf(i)), new C13604l("strValue", str))), 0, 16, (Object) null);
    }

    /* renamed from: d */
    public final void mo8596d(C49712hj1 hj12, FinderItem finderItem, int i, String str, int i2) {
        C87412m.m108594g(str, "strValue");
        C49712hj1 hj13 = hj12;
        FinderItem finderItem2 = finderItem;
        int i3 = i;
        mo8597e(hj13, finderItem2, i3, C58403t.f167322q.mo83248b(C90364q0.m113147f(new C13604l("feedActionType", Integer.valueOf(i)), new C13604l("strValue", str))), i2);
    }

    /* renamed from: e */
    public final void mo8597e(C49712hj1 hj12, FinderItem finderItem, int i, String str, int i2) {
        if (finderItem != null && hj12 != null) {
            C48978cb0 cb02 = new C48978cb0();
            cb02.f131607d = finderItem.field_id;
            cb02.f131608e = finderItem.getUserName();
            int i3 = i2 == 0 ? hj12.f134675i : i2;
            cb02.f131609f = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(finderItem.field_id, i3);
            cb02.f131610g = str;
            C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(finderItem.getMediaList());
            cb02.f131611h = rq22 != null ? rq22.f185269g : 0;
            cb02.f131612i = finderItem.getMediaType();
            Log.m105924i("FinderExtStatsReport", "sendExtStatsReportWithValue feedId:" + C61926c.m72691p(cb02.f131607d) + " refScene:" + i3 + " commentScene:" + hj12.f134675i + " feedActionType:" + i + " feedActionValue:" + str + " videoDuration:" + cb02.f131611h + " mediaType:" + cb02.f131612i + " username:" + finderItem.getUserName());
            C86709a0.m107524d().mo123460f(new C46534r2(hj12, 18054, cb02, i2 != hj12.f134675i ? cb02.f131609f : null));
        }
    }
}
