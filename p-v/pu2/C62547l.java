package pu2;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import rx3.C13604l;
import wx3.C15601d;

/* renamed from: pu2.l */
public final class C62547l extends C100954s {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62547l(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: B */
    public Object mo87537B(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveTextTimelineItem");
        Boolean bool = Boolean.TRUE;
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveTextTimelineItem");
        return bool;
    }

    /* renamed from: f */
    public C13604l<View, ConstraintLayout.LayoutParams> mo87542f() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveTextTimelineItem");
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(new View(getContext()), new ConstraintLayout.LayoutParams(-2, -2));
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveTextTimelineItem");
        return lVar;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveTextTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveTextTimelineItem");
        return 6;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveTextTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveTextTimelineItem");
        return "ImproveTextTimelineItem";
    }
}
