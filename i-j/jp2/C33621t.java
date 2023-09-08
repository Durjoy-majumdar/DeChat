package jp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: jp2.t */
public class C33621t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C33615q f90996d;

    public C33621t(C33615q qVar) {
        this.f90996d = qVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$5");
        C33615q.m40140q(this.f90996d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$5");
    }
}
