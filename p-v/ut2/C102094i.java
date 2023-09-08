package ut2;

import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: ut2.i */
public final class C102094i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f300635d;

    public C102094i(ImproveInputUIC improveInputUIC) {
        this.f300635d = improveInputUIC;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$showInputView$1");
        ImproveInputUIC.m122695c3(this.f300635d).setToSendTextColor(true);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$showInputView$1");
    }
}
