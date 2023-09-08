package eu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import ju2.C99043c;

/* renamed from: eu2.j */
public final class C97726j implements ImproveContentView.C95882a {
    /* renamed from: a */
    public void mo133360a(View view, int i, Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$buildContentTextView$1");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(runnable, "extraActionRunnable");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[1];
        View view2 = view;
        C99043c.f290342a.mo138386b(view2, i2 + i, i2 + view.getHeight(), 0, runnable);
        SnsMethodCalculate.markEndTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$buildContentTextView$1");
    }
}
