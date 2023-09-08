package eu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import gu2.C98214b;
import gy3.C87412m;
import ht1.C60168f2;
import ht1.C60188n4;
import o40.C61926c;
import te3.C49712hj1;
import te3.C64682rk1;
import zp3.C23555k;

/* renamed from: eu2.e */
public final class C58823e extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C64682rk1 f168413a;

    /* renamed from: b */
    public final /* synthetic */ C58818d f168414b;

    /* renamed from: c */
    public final /* synthetic */ C98214b f168415c;

    public C58823e(C64682rk1 rk12, C58818d dVar, C98214b bVar) {
        this.f168413a = rk12;
        this.f168414b = dVar;
        this.f168415c = bVar;
    }

    /* renamed from: a */
    public long mo52a(View view) {
        SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        C87412m.m108594g(view, "view");
        long p2 = this.f168415c.mo142401p2();
        long hashCode = (long) (((int) (p2 ^ (p2 >>> 32))) + view.hashCode());
        SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        return hashCode;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        C87412m.m108594g(view, "view");
        if (z) {
            ((C60188n4) C86312j.m106911c(C60188n4.class)).mo75339Ki(C61926c.m72671P(this.f168413a.f185183d), this.f168413a.f185191o, 37, (C49712hj1) null, this.f168414b.getContext(), false, (String) null);
            String userName = this.f168415c.getUserName();
            C87412m.m108593f(userName, "sourceUsr");
            String str = this.f168413a.f185183d;
            C87412m.m108591d(str);
            ((C60168f2) C86312j.m106911c(C60168f2.class)).mo8598I6(3, 1, userName, str);
        }
        SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
    }
}
