package oo2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: oo2.e */
public class C35252e implements C35248a {
    /* renamed from: a */
    public void mo59922a(Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
        mo59924h(0, objArr);
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
    }

    public int getKey() {
        SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
        SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
        return 13235;
    }

    /* renamed from: h */
    public void mo59924h(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
        if (i != 2) {
            C115669n.INSTANCE.mo160131h(13235, objArr);
        }
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
    }
}
