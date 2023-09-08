package aq2;

import android.view.View;
import co2.C92443k;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import io2.C60570c;
import jp2.C98963o;
import tp2.C101913c;
import tp2.C101914d;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: aq2.a */
public abstract class C92062a implements C101913c {
    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        C98963o oVar;
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            return false;
        }
        C92443k kVar = snsInfo.getAdXml().adFinderTopicInfo;
        if (kVar == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.impl.FinderTopicCardAction");
        boolean a = C60570c.m70755a(view.getContext(), kVar.f264539a, kVar.f264540b, snsInfo, 6);
        SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.impl.FinderTopicCardAction");
        if (a) {
            SnsMethodCalculate.markStartTimeMs("afterClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            SnsAdClick snsAdClick = new SnsAdClick(i, i == 0 ? 1 : 2, snsInfo.field_snsId, 32, 46);
            if (!(dVar == null || (oVar = (C98963o) dVar.mo141403a("sns_ad_statistic", null)) == null)) {
                C102260r.m134864d(snsAdClick, oVar, snsInfo, 32);
            }
            C102236a0.m134773u0(snsAdClick);
            SnsMethodCalculate.markEndTimeMs("afterClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        }
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        return a;
    }
}
