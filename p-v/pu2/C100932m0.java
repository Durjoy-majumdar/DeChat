package pu2;

import android.text.TextPaint;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import de3.C75360c0;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: pu2.m0 */
public final class C100932m0 extends C75360c0 {

    /* renamed from: g */
    public final /* synthetic */ C100934n0 f295562g;

    public C100932m0(C100934n0 n0Var) {
        this.f295562g = n0Var;
    }

    public void onClick(View view) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadAppNameView$1");
        C87412m.m108594g(view, "widget");
        SnsTimeLineBaseAdapter adapter = this.f295562g.getAdapter();
        if (adapter == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadAppNameView$1");
            return;
        }
        this.f295562g.mo140441m("MicroMsg.Improve.TimelineItemMeasure", "appNameStub click");
        view.setTag(this.f295562g.getStruct().f281367a.getTimeLine());
        adapter.f278576j.f280592j.onClick(view);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadAppNameView$1");
    }

    public void updateDrawState(TextPaint textPaint) {
        SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadAppNameView$1");
        C87412m.m108594g(textPaint, "ds");
        int d = C76577a.m92153d(this.f295562g.getContext(), C0966R.color.ad7);
        if (getPress()) {
            textPaint.bgColor = d;
        } else {
            textPaint.bgColor = 0;
        }
        SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadAppNameView$1");
    }
}
