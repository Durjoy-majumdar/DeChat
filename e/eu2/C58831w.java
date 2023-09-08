package eu2;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import rx3.C13604l;
import wx3.C15601d;

/* renamed from: eu2.w */
public final class C58831w extends ImproveTimelineItemNotify {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58831w(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: F */
    public Object mo81005F(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.TextImproveTimelineItem");
        Boolean bool = Boolean.TRUE;
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.TextImproveTimelineItem");
        return bool;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.TextImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.TextImproveTimelineItem");
        return 6;
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.TextImproveTimelineItem");
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(new View(getContext()), new ConstraintLayout.LayoutParams(-2, -2));
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.TextImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.TextImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.TextImproveTimelineItem");
        return "TextImproveTimelineItem";
    }
}
