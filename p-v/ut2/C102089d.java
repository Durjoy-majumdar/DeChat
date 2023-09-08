package ut2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: ut2.d */
public final class C102089d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f300621d;

    /* renamed from: e */
    public final /* synthetic */ View f300622e;

    /* renamed from: f */
    public final /* synthetic */ int f300623f;

    public C102089d(ImproveInputUIC improveInputUIC, View view, int i) {
        this.f300621d = improveInputUIC;
        this.f300622e = view;
        this.f300623f = i;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$checkFeedRelocate$1$1");
        ImproveInputUIC improveInputUIC = this.f300621d;
        View view = this.f300622e;
        int i = this.f300623f;
        SnsMethodCalculate.markStartTimeMs("checkFixScrollUtilMatchViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.mo133286f3(view, i, true, 5);
        SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$checkFeedRelocate$1$1");
    }
}
