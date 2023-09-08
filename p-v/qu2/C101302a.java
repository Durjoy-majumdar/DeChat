package qu2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pu2.C100921i0;
import su2.C101702a;
import uu2.C102112a;

/* renamed from: qu2.a */
public final class C101302a {

    /* renamed from: a */
    public final Context f296789a;

    /* renamed from: b */
    public final int f296790b;

    /* renamed from: c */
    public final SnsTimeLineBaseAdapter f296791c;

    public C101302a(Context context, int i, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
        this.f296789a = context;
        this.f296790b = i;
        this.f296791c = snsTimeLineBaseAdapter;
    }

    /* renamed from: a */
    public final boolean mo140761a(boolean z) {
        SnsMethodCalculate.markStartTimeMs("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
        if (!C101702a.f297759b.mo141157a() || z || this.f296790b == 1) {
            SnsMethodCalculate.markEndTimeMs("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
        return true;
    }

    /* renamed from: b */
    public final void mo140762b(int i, C100921i0 i0Var, C96275w6 w6Var) {
        SnsMethodCalculate.markStartTimeMs("updateItemView", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
        if (i0Var == null) {
            SnsMethodCalculate.markEndTimeMs("updateItemView", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        i0Var.mo87548C(w6Var, !(C87412m.m108589b(w6Var.f281381h, i0Var.getStruct().f281381h) && w6Var.f281386m == i0Var.getStruct().f281386m));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C102112a.f300683a.mo141616e(i, i0Var.mo87544n());
        Log.m105924i("MicroMsg.Improve.SnsTimelineImproveAdapter", "update struct view:" + i0Var.mo87544n() + " hash:" + i0Var.hashCode() + " cost:" + currentTimeMillis2);
        SnsMethodCalculate.markEndTimeMs("updateItemView", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
    }
}
