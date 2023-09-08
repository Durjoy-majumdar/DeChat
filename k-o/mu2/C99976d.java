package mu2;

import bv2.C92313c;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.tav.core.AssetExtension;
import nu2.C100207g;
import nu2.C100208h;

/* renamed from: mu2.d */
public final class C99976d extends C95917e {

    /* renamed from: C */
    public C100208h f292927C = new C100208h();

    /* renamed from: C */
    public boolean mo133427C() {
        SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        this.f292927C.onVideoPause();
        SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        return false;
    }

    /* renamed from: E */
    public C100207g mo133429E() {
        SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        C100208h hVar = this.f292927C;
        SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        return hVar;
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        C96254a.m123394d().mo133938k();
        C92313c.m116089a().mo126302e(this);
        this.f292927C.mo139491e();
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        return "LiveStreamAdTimelineItem";
    }
}
