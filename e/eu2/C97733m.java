package eu2;

import android.text.TextPaint;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import de3.C75360c0;
import gu2.C98214b;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: eu2.m */
public final class C97733m extends C75360c0 {

    /* renamed from: g */
    public final /* synthetic */ C97736r f286700g;

    /* renamed from: h */
    public final /* synthetic */ C98214b f286701h;

    public C97733m(C97736r rVar, C98214b bVar) {
        this.f286700g = rVar;
        this.f286701h = bVar;
    }

    public void onClick(View view) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadAppNameView$1");
        C87412m.m108594g(view, "widget");
        this.f286700g.mo137055z("MicroMsg.Improve.TimelineItemMeasure", "appNameStub click");
        view.setTag(this.f286701h.mo137509G2());
        C96085n8.m123095c(view, 0);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadAppNameView$1");
    }

    public void updateDrawState(TextPaint textPaint) {
        SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadAppNameView$1");
        C87412m.m108594g(textPaint, "ds");
        int d = C76577a.m92153d(this.f286700g.getContext(), C0966R.color.ad7);
        if (getPress()) {
            textPaint.bgColor = d;
        } else {
            textPaint.bgColor = 0;
        }
        SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadAppNameView$1");
    }
}
