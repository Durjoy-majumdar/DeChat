package aq2;

import android.content.Context;
import android.view.View;
import bq2.C92294a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import tp2.C101912b;
import tp2.C101913c;
import tp2.C101914d;

/* renamed from: aq2.b */
public class C92063b extends C101912b<C92062a> {

    /* renamed from: b */
    public int f263587b = 0;

    public C92063b(Context context) {
        super(context);
    }

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        this.f263587b = i;
        boolean b = super.mo126055b(view, i, snsInfo, dVar);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        return b;
    }

    /* renamed from: d */
    public C101913c mo126056d(SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        C92294a aVar = null;
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        } else {
            try {
                ADInfo adInfo = snsInfo.getAdInfo(this.f263587b);
                if (adInfo == null) {
                    SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
                } else {
                    if (adInfo.adActionType == 11) {
                        C92294a aVar2 = new C92294a();
                        SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
                        aVar = aVar2;
                    }
                    SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        return aVar;
    }
}
