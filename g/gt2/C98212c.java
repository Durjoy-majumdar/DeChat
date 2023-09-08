package gt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import jv2.C99059b;
import jv2.C99063c;
import lp3.C88633e;
import lp3.C88643g;
import yn2.C102882s0;

/* renamed from: gt2.c */
public class C98212c {

    /* renamed from: a */
    public C98211b f287955a = new C98211b();

    /* renamed from: b */
    public C99063c f287956b = null;

    /* renamed from: c */
    public int f287957c = 0;

    /* renamed from: d */
    public boolean f287958d = false;

    /* renamed from: a */
    public void mo137501a(int i, String str, boolean z, boolean z2, int i2) {
        SnsMethodCalculate.markStartTimeMs("doFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        if (!this.f287958d) {
            SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            return;
        }
        int i3 = this.f287957c;
        if (i3 == 0) {
            C102882s0.f303681a.mo142591c();
            SnsMethodCalculate.markStartTimeMs("doTimeLineFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            C98211b bVar = this.f287955a;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("doFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            C99059b bVar2 = bVar.f287953a;
            if (bVar2 == null) {
                SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            } else {
                C99059b.C99060a aVar = bVar2.f290373b;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoFpListFunctionalApi");
                ((C88633e) C88643g.m110550h(str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2))).mo123061d(aVar);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoFpListFunctionalApi");
                SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            }
            SnsMethodCalculate.markEndTimeMs("doTimeLineFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        } else if (i3 == 1) {
            SnsMethodCalculate.markStartTimeMs("doUserPageFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            SnsMethodCalculate.markEndTimeMs("doUserPageFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        }
        SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
    }

    /* renamed from: b */
    public void mo137502b(int i, String str, boolean z, boolean z2, int i2) {
        SnsMethodCalculate.markStartTimeMs("doNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        if (!this.f287958d) {
            SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            return;
        }
        int i3 = this.f287957c;
        if (i3 == 0) {
            SnsMethodCalculate.markStartTimeMs("doTimeLineNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            C98211b bVar = this.f287955a;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("doNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            C99059b bVar2 = bVar.f287953a;
            if (bVar2 == null) {
                SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            } else {
                C99059b.C99061b bVar3 = bVar2.f290374c;
                bVar3.getClass();
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoNpListFunctionalApi");
                ((C88633e) C88643g.m110550h(str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2))).mo123061d(bVar3);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoNpListFunctionalApi");
                SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            }
            SnsMethodCalculate.markEndTimeMs("doTimeLineNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        } else if (i3 == 1) {
            SnsMethodCalculate.markStartTimeMs("doUserPageNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            SnsMethodCalculate.markEndTimeMs("doUserPageNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        }
        SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
    }
}
