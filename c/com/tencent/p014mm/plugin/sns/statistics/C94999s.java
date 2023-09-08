package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85798u1;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.tencent.mm.plugin.sns.statistics.s */
public class C94999s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedHashMap f275621d;

    /* renamed from: e */
    public final /* synthetic */ SnsReportHelper f275622e;

    /* renamed from: com.tencent.mm.plugin.sns.statistics.s$a */
    public class C95000a implements Runnable {
        public C95000a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1$1");
            SnsReportHelper snsReportHelper = C94999s.this.f275622e;
            Integer num = SnsReportHelper.f275505l0;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            LinkedHashMap<Long, Object> linkedHashMap = snsReportHelper.f275541e;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            C94999s sVar = C94999s.this;
            SnsReportHelper snsReportHelper2 = sVar.f275622e;
            LinkedHashMap<Long, Object> linkedHashMap2 = sVar.f275621d;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            snsReportHelper2.f275541e = linkedHashMap2;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            linkedHashMap.clear();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1$1");
        }
    }

    public C94999s(SnsReportHelper snsReportHelper, LinkedHashMap linkedHashMap) {
        this.f275622e = snsReportHelper;
        this.f275621d = linkedHashMap;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1");
        long currentTicks = Util.currentTicks();
        int size = this.f275621d.size();
        SnsReportHelper snsReportHelper = this.f275622e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        int i = snsReportHelper.f275543f;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (size >= i) {
            SnsReportHelper snsReportHelper2 = this.f275622e;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int i2 = snsReportHelper2.f275543f;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int i3 = size - i2;
            Iterator it = this.f275621d.keySet().iterator();
            int i4 = 0;
            while (it.hasNext() && i4 < i3) {
                it.next();
                it.remove();
                i4++;
            }
            MMHandlerThread.postToMainThread(new C95000a());
        }
        SnsReportHelper snsReportHelper3 = this.f275622e;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        C85798u1 u1Var = snsReportHelper3.f275533a;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        u1Var.mo119664f(6, this.f275621d);
        Log.m105925i("MicroMsg.SnsReportHelper", "save exposure feed id for cgi [%d] oriSize[%d] cost[%d]", Integer.valueOf(this.f275621d.size()), Integer.valueOf(size), Long.valueOf(Util.ticksToNow(currentTicks)));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1");
    }
}
