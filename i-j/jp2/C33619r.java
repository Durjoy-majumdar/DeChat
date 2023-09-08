package jp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: jp2.r */
public class C33619r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C33615q f90994d;

    public C33619r(C33615q qVar) {
        this.f90994d = qVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$3");
        long currentTimeMillis = System.currentTimeMillis();
        C33615q qVar = this.f90994d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        long j = qVar.f90983e;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (currentTimeMillis - j >= 60000 || C33615q.m40139d(this.f90994d).f137242d.size() > 1000) {
            if (C33615q.m40139d(this.f90994d) != null && C33615q.m40139d(this.f90994d).f137242d.size() > 0) {
                C33615q.m40140q(this.f90994d);
            }
            C33615q qVar2 = this.f90994d;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            qVar2.f90983e = 0;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$3");
    }
}
