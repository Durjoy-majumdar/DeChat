package pu2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: pu2.t0 */
public abstract class C100958t0 extends C100916h0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100958t0(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: C */
    public void mo87548C(C96275w6 w6Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemUpdate");
        C87412m.m108594g(w6Var, "newStruct");
        if (C87412m.m108589b(w6Var.f281381h, getStruct().f281381h) && !C87412m.m108589b(w6Var.f281382i, getStruct().f281382i)) {
            SnsMethodCalculate.markStartTimeMs("isAttachToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
            boolean z2 = this.f295538y0;
            SnsMethodCalculate.markEndTimeMs("isAttachToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
            if (z2) {
                mo140383D();
            }
        }
        super.mo87548C(w6Var, z);
        SnsMethodCalculate.markEndTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemUpdate");
    }

    /* renamed from: D */
    public void mo140383D() {
        SnsMethodCalculate.markStartTimeMs("feedPublishFinished", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemUpdate");
        SnsMethodCalculate.markEndTimeMs("feedPublishFinished", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemUpdate");
    }
}
