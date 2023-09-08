package ou2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import os2.C100397a;

/* renamed from: ou2.c */
public final class C100476c extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C100464b f294370d;

    /* renamed from: e */
    public final /* synthetic */ C100397a f294371e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100476c(C100464b bVar, C100397a aVar) {
        super(0);
        this.f294370d = bVar;
        this.f294371e = aVar;
    }

    public Object invoke() {
        float f;
        float f2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$1");
        C100464b bVar = this.f294370d;
        SnsMethodCalculate.markStartTimeMs("access$getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        C100509l g = bVar.mo139966g();
        SnsMethodCalculate.markEndTimeMs("access$getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        long currentPosInMills = g != null ? g.getCurrentPosInMills() : 0;
        C100397a aVar = this.f294371e;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            f = aVar.f294079e;
            SnsMethodCalculate.markEndTimeMs("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        } else {
            f = 0.0f;
        }
        C100397a aVar2 = this.f294371e;
        if (aVar2 != null) {
            SnsMethodCalculate.markStartTimeMs("getClickEndTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            f2 = aVar2.f294080f;
            SnsMethodCalculate.markEndTimeMs("getClickEndTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        } else {
            f2 = 0.0f;
        }
        float f3 = (float) currentPosInMills;
        Boolean valueOf = Boolean.valueOf(f3 > f && (f3 < f2 || f2 <= 0.0f));
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$1");
        return valueOf;
    }
}
