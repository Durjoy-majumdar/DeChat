package oo2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: oo2.d */
public class C35251d implements C35248a {
    /* renamed from: a */
    public void mo59922a(Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13182");
        mo59924h(0, objArr);
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13182");
    }

    public int getKey() {
        SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_13182");
        SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_13182");
        return 13182;
    }

    /* renamed from: h */
    public void mo59924h(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13182");
        if (i != 2) {
            C115669n.INSTANCE.mo160131h(13182, objArr);
        }
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13182");
    }
}
