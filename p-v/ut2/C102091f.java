package ut2;

import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: ut2.f */
public final class C102091f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f300625d;

    public C102091f(ImproveInputUIC improveInputUIC) {
        this.f300625d = improveInputUIC;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replayComment$1");
        ImproveInputUIC.m122695c3(this.f300625d).clearFocus();
        ImproveInputUIC.m122695c3(this.f300625d).requestFocus();
        ImproveInputUIC.m122695c3(this.f300625d).setToSendTextColor(true);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replayComment$1");
    }
}
