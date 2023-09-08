package ao2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashMap;
import java.util.Map;
import jr2.C99016j;
import oo2.C35248a;
import oo2.C35249b;
import oo2.C35250c;
import oo2.C35251d;
import oo2.C35252e;

@C86522b
/* renamed from: ao2.d */
public class C27983d extends C86301e implements C99016j {

    /* renamed from: d */
    public Map<Integer, C35248a> f77240d = new HashMap();

    /* renamed from: e */
    public volatile boolean f77241e = false;

    /* renamed from: h */
    public void mo55731h(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        vx0();
        C35248a aVar = (C35248a) ((HashMap) this.f77240d).get(Integer.valueOf(i));
        if (aVar == null) {
            Log.m105929w("SnsAdReportService", "can not find %s implementation for kv %d", C35248a.class, Integer.valueOf(i));
        } else {
            aVar.mo59922a(objArr);
        }
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    /* renamed from: rh */
    public void mo55732rh(int i, int i2, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStatWithRecSrc", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        vx0();
        C35248a aVar = (C35248a) ((HashMap) this.f77240d).get(Integer.valueOf(i));
        if (aVar == null) {
            Log.m105929w("SnsAdReportService", "can not find %s implementation for kv %d", C35248a.class, Integer.valueOf(i));
        } else {
            aVar.mo59924h(i2, objArr);
        }
        SnsMethodCalculate.markEndTimeMs("kvStatWithRecSrc", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public final void vx0() {
        SnsMethodCalculate.markStartTimeMs("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        if (this.f77241e) {
            SnsMethodCalculate.markEndTimeMs("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
            return;
        }
        synchronized (this) {
            try {
                if (!this.f77241e) {
                    xx0();
                }
                this.f77241e = true;
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public void wx0(C35248a aVar) {
        SnsMethodCalculate.markStartTimeMs("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        if (aVar == null) {
            Log.m105929w("SnsAdReportService", "registing null %s", C35248a.class);
            SnsMethodCalculate.markEndTimeMs("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
            return;
        }
        ((HashMap) this.f77240d).put(Integer.valueOf(aVar.getKey()), aVar);
        SnsMethodCalculate.markEndTimeMs("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public final void xx0() {
        SnsMethodCalculate.markStartTimeMs("registerAllKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        wx0(new C35252e());
        wx0(new C35251d());
        wx0(new C35249b());
        wx0(new C35250c());
        SnsMethodCalculate.markEndTimeMs("registerAllKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }
}
