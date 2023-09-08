package com.tencent.p014mm.plugin.sns.p104ad.widget.living;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import vr2.C102236a0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsAdLivingStreamJumpEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1 */
public final class AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1 extends IListener<SnsAdLivingStreamJumpEvent> {

    /* renamed from: d */
    public final /* synthetic */ AdLivingStreamContainer f164309d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1(AdLivingStreamContainer adLivingStreamContainer, C40008f fVar) {
        super(fVar);
        this.f164309d = adLivingStreamContainer;
    }

    public boolean callback(IEvent iEvent) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1");
        SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = (SnsAdLivingStreamJumpEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1");
        C87412m.m108594g(snsAdLivingStreamJumpEvent, "event");
        String str = snsAdLivingStreamJumpEvent.f154872d.f154873a;
        String W = C102236a0.m134728W(this.f164309d.getMSnsInfo());
        String a = AdLivingStreamContainer.m66069a(this.f164309d);
        Log.m105924i(a, "snsId is " + str + ", mSnsId is " + W);
        if (!C87412m.m108589b(W, str)) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1");
        } else {
            this.f164309d.mo80868f();
            z = true;
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1");
        return z;
    }
}
