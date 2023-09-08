package pu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsPostDescPreloadTextView;

/* renamed from: pu2.f0 */
public final class C100913f0 implements SnsPostDescPreloadTextView.C96303b {

    /* renamed from: a */
    public final /* synthetic */ C100954s f295519a;

    public C100913f0(C100954s sVar) {
        this.f295519a = sVar;
    }

    /* renamed from: a */
    public void mo132940a() {
        SnsMethodCalculate.markStartTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$7");
        this.f295519a.mo140380v();
        SnsMethodCalculate.markEndTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$7");
    }

    /* renamed from: b */
    public void mo132941b() {
        SnsMethodCalculate.markStartTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$7");
        this.f295519a.mo140380v();
        SnsMethodCalculate.markEndTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$7");
    }
}
