package ke1;

import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import je1.C9360p1;
import kj2.C117407d;

/* renamed from: ke1.q */
public final class C9601q implements C9360p1.C9361a {

    /* renamed from: d */
    public final /* synthetic */ C9595n f29863d;

    /* renamed from: e */
    public final /* synthetic */ C9602r f29864e;

    public C9601q(C9595n nVar, C9602r rVar) {
        this.f29863d = nVar;
        this.f29864e = rVar;
    }

    /* renamed from: a */
    public void mo2805a(C2781d dVar, int i) {
        C2781d dVar2 = dVar;
        int i2 = i;
        C87412m.m108594g(dVar2, "info");
        this.f29863d.f29847n = dVar2.f13970g > 0;
        this.f29863d.f29849p = dVar2.f13970g == 1;
        boolean z = dVar2.f13973j;
        boolean z2 = dVar2.f13972i;
        Log.m105924i("Finder.FinderLbsFeedFetcher", "[getStream] tabType=" + this.f29863d.f29843g + " isGetHistory=" + this.f29863d.f29847n + " isShowHistoryTip=" + this.f29863d.f29849p + " ret_flag=" + dVar2.f13970g + " pullType=" + i2 + " isNeedClear=" + z2 + " isFetchHistoryNow=" + dVar2.f13973j + " size=" + dVar2.f13968e.size() + " errorType=" + dVar2.f13964a + " errorCode=" + dVar2.f13965b);
        C9595n nVar = this.f29863d;
        boolean z3 = dVar2.f13972i;
        int size = dVar2.f13968e.size();
        int i3 = dVar2.f13970g;
        nVar.getClass();
        if (z3 && size <= 0 && i3 == 0) {
            nVar.mo10271z1("isNeedClear && incrementSize <= 0 && retFlag == 0");
        } else if (!z3 && size > 0 && i2 != 2) {
            nVar.mo10271z1("!isNeedClear && incrementSize > 0 pullType=" + i2);
        }
        if (dVar2.f13964a != 0 || dVar2.f13965b != 0 || !this.f29863d.f29847n || !z) {
            if (dVar2.f13964a == 0 && dVar2.f13965b == 0) {
                C117407d.INSTANCE.idkeyStat(1279, 1, 1, false);
                if (dVar2.f13968e.isEmpty() && !this.f29863d.f29847n) {
                    dVar2.f13971h = 1;
                    C9595n nVar2 = this.f29863d;
                    nVar2.mo10271z1("[finderstream]tabType=" + this.f29863d.f29843g + " server error[list=0:ret_flag=0]");
                } else if (!dVar2.f13968e.isEmpty()) {
                    dVar2.f13971h = 1;
                } else {
                    dVar2.f13971h = 1;
                }
                Log.m105924i("Finder.FinderLbsFeedFetcher", "tabType=" + this.f29863d.f29843g + " this time get finderstream return list=" + dVar2.f13968e.size() + " continue_flag=" + dVar2.f13971h + " pullType=" + i2);
            } else {
                C117407d.INSTANCE.idkeyStat(1279, 2, 1, false);
                dVar2.f13971h = 1;
            }
            this.f29864e.mo2805a(dVar2, i2);
            return;
        }
        C9595n nVar3 = this.f29863d;
        nVar3.f29848o = true;
        nVar3.f29845i.f29850a = 3;
        C9595n.m9271y1(nVar3, this.f29864e, true, i, dVar2.f13969f, z2, nVar3.f29849p, (C9360p1.C9362b) null, 64, (Object) null);
        Log.m105924i("Finder.FinderLbsFeedFetcher", "get history to fill... tabType=" + this.f29863d.f29843g + " pullType=" + i2 + " isHistoryFirstPage=" + this.f29863d.f29848o);
        this.f29863d.f29848o = false;
    }
}
