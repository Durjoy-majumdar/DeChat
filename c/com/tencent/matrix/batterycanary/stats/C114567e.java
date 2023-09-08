package com.tencent.matrix.batterycanary.stats;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.matrix.batterycanary.stats.C114570h;
import java.util.LinkedHashMap;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.stats.e */
public class C114567e implements C87705i<BatteryRecord.ReportRecord.EntryInfo> {

    /* renamed from: a */
    public final /* synthetic */ C114467i f343357a;

    /* renamed from: b */
    public final /* synthetic */ C114490k0.C114491a.C114492a f343358b;

    /* renamed from: c */
    public final /* synthetic */ BatteryRecord.ReportRecord f343359c;

    public C114567e(C114570h.C114571a aVar, C114467i iVar, C114490k0.C114491a.C114492a aVar2, BatteryRecord.ReportRecord reportRecord) {
        this.f343357a = iVar;
        this.f343358b = aVar2;
        this.f343359c = reportRecord;
    }

    public void accept(Object obj) {
        BatteryRecord.ReportRecord.EntryInfo entryInfo = (BatteryRecord.ReportRecord.EntryInfo) obj;
        entryInfo.f343337d = "设备状态";
        entryInfo.f343339f = new LinkedHashMap();
        this.f343357a.mo173671o(CpuStatFeature.class, new C114565c(this, entryInfo));
        this.f343357a.mo173668l(C114536x.C114541e.class, new C114566d(this, entryInfo));
        this.f343359c.f343336o.add(entryInfo);
    }
}
