package pu2;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import vr2.C102236a0;

/* renamed from: pu2.q0 */
public final class C100941q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f295574d;

    public C100941q0(ViewGroup viewGroup) {
        this.f295574d = viewGroup;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadUnreadPostView$2");
        ViewGroup viewGroup = this.f295574d;
        C102236a0.m134775v0(viewGroup, Float.valueOf(((float) viewGroup.getMeasuredHeight()) / ((float) 2)));
        this.f295574d.invalidate();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadUnreadPostView$2");
    }
}
