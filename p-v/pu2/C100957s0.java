package pu2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: pu2.s0 */
public abstract class C100957s0 extends C100958t0 {

    /* renamed from: R0 */
    public int f295627R0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100957s0(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: C */
    public void mo87548C(C96275w6 w6Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemNotify");
        C87412m.m108594g(w6Var, "struct");
        StringBuilder sb = new StringBuilder();
        sb.append("updateStruct attachToWindow:");
        SnsMethodCalculate.markStartTimeMs("isAttachToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        boolean z2 = this.f295538y0;
        SnsMethodCalculate.markEndTimeMs("isAttachToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        sb.append(z2);
        sb.append(" change:");
        sb.append(z);
        mo140441m("MicroMsg.Improve.TimelineItemNotify", sb.toString());
        super.mo87548C(w6Var, z);
        if ((this.f295627R0 & 1) == 1) {
            SnsMethodCalculate.markStartTimeMs("notifyContentCollapseChanged", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemNotify");
            this.f295627R0 = 1 ^ this.f295627R0;
            mo140380v();
            SnsMethodCalculate.markEndTimeMs("notifyContentCollapseChanged", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemNotify");
        }
        if ((this.f295627R0 & 16) == 16) {
            SnsMethodCalculate.markStartTimeMs("notifyContentTranslateChanged", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemNotify");
            if (getStruct().f281378f0 == null || getStruct().f281378f0.f275306d) {
                this.f295627R0 = 16 ^ this.f295627R0;
            }
            mo140404t();
            SnsMethodCalculate.markEndTimeMs("notifyContentTranslateChanged", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemNotify");
        }
        SnsMethodCalculate.markEndTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemNotify");
    }
}
