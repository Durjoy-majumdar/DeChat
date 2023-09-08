package p180jy;

import com.tencent.p014mm.autogen.events.UpdateSnsHeaderNotiftyListEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: jy.s1 */
public class C33769s1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f91319d;

    public C33769s1(C33772t1 t1Var, long j) {
        this.f91319d = j;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.listener.ResendSnsListener$1");
        C94897n1.m120378p((int) this.f91319d);
        C94866e1.gy0().mo131192c();
        new UpdateSnsHeaderNotiftyListEvent().publish();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.listener.ResendSnsListener$1");
    }
}
