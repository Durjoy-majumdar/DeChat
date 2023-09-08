package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60168f2;
import ht1.C60188n4;
import o40.C61926c;
import te3.C49712hj1;
import te3.C64682rk1;
import zp3.C23555k;

/* renamed from: pu2.f */
public final class C62531f extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C64682rk1 f177616a;

    /* renamed from: b */
    public final /* synthetic */ C62526e f177617b;

    /* renamed from: c */
    public final /* synthetic */ SnsInfo f177618c;

    public C62531f(C64682rk1 rk12, C62526e eVar, SnsInfo snsInfo) {
        this.f177616a = rk12;
        this.f177617b = eVar;
        this.f177618c = snsInfo;
    }

    /* renamed from: a */
    public long mo52a(View view) {
        SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$viewExposeReport$1");
        C87412m.m108594g(view, "view");
        long hashCode = (long) (this.f177618c.getSnsId().hashCode() + view.hashCode());
        SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$viewExposeReport$1");
        return hashCode;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$viewExposeReport$1");
        C87412m.m108594g(view, "view");
        if (z) {
            ((C60188n4) C86312j.m106911c(C60188n4.class)).mo75339Ki(C61926c.m72671P(this.f177616a.f185183d), this.f177616a.f185191o, 37, (C49712hj1) null, this.f177617b.getContext(), false, (String) null);
            String userName = this.f177618c.getUserName();
            C87412m.m108593f(userName, "sourceUsr");
            String str = this.f177616a.f185183d;
            C87412m.m108591d(str);
            ((C60168f2) C86312j.m106911c(C60168f2.class)).mo8598I6(3, 1, userName, str);
        }
        SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$viewExposeReport$1");
    }
}
