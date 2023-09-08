package mu2;

import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import nu2.C100207g;
import ou2.C100478e;

/* renamed from: mu2.a */
public final class C99973a extends C95917e {

    /* renamed from: C */
    public C100478e f292926C;

    public C99973a(int i) {
        this.f292926C = new C100478e(i);
    }

    /* renamed from: E */
    public C100207g mo133429E() {
        SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        C100478e eVar = this.f292926C;
        SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        return eVar;
    }

    /* renamed from: G */
    public boolean mo133431G(ADXml aDXml) {
        SnsMethodCalculate.markStartTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        return false;
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        return "BreakFrameAdTimelineItem";
    }
}
