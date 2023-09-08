package com.tencent.matrix.batterycanary.stats;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import java.util.Locale;
import java.util.Map;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.stats.d */
public class C114566d implements C87705i<C114490k0.C114491a.C114492a<C114536x.C114541e>> {

    /* renamed from: a */
    public final /* synthetic */ BatteryRecord.ReportRecord.EntryInfo f343355a;

    /* renamed from: b */
    public final /* synthetic */ C114567e f343356b;

    public C114566d(C114567e eVar, BatteryRecord.ReportRecord.EntryInfo entryInfo) {
        this.f343356b = eVar;
        this.f343355a = entryInfo;
    }

    public void accept(Object obj) {
        double intValue = (double) ((Integer) ((C114536x.C114541e) ((C114490k0.C114491a.C114492a) obj).f343206b).f343310d.f343211a).intValue();
        this.f343355a.f343339f.put("当前电池温度", String.format(Locale.US, "%.1f ℃", new Object[]{Double.valueOf(intValue / 10.0d)}));
        C114490k0.C114491a.C114503c.C114505b q = this.f343356b.f343357a.mo173673q(C114536x.C114541e.class);
        if (q != null) {
            double d = q.f343234f;
            double d2 = q.f343235g;
            Map<String, String> map = this.f343355a.f343339f;
            Locale locale = Locale.US;
            map.put("最大电池温度", String.format(locale, "%.1f ℃", new Object[]{Double.valueOf(d / 10.0d)}));
            this.f343355a.f343339f.put("电池温度变化", String.format(locale, "%.1f ℃", new Object[]{Double.valueOf((d - d2) / 10.0d)}));
        }
    }
}
