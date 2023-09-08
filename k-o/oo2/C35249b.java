package oo2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: oo2.b */
public class C35249b implements C35248a {
    /* renamed from: a */
    public void mo59922a(Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
        mo59924h(0, objArr);
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
    }

    public int getKey() {
        SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
        SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
        return 11855;
    }

    /* renamed from: h */
    public void mo59924h(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
        if (i == 0 || i == 1) {
            C115669n.INSTANCE.mo160131h(11855, objArr);
        } else if (i != 2) {
            Log.m105921e("Kv_11855", "unknown type %d", Integer.valueOf(i));
        } else {
            C115669n.INSTANCE.mo160131h(14646, objArr);
        }
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
    }
}
