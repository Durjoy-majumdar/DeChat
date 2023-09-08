package com.tencent.matrix.batterycanary.stats;

import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.stats.c */
public class C114565c implements C87705i<CpuStatFeature> {

    /* renamed from: a */
    public final /* synthetic */ BatteryRecord.ReportRecord.EntryInfo f343353a;

    /* renamed from: b */
    public final /* synthetic */ C114567e f343354b;

    public C114565c(C114567e eVar, BatteryRecord.ReportRecord.EntryInfo entryInfo) {
        this.f343354b = eVar;
        this.f343353a = entryInfo;
    }

    public void accept(Object obj) {
        this.f343354b.f343357a.mo173668l(CpuStatFeature.C114427b.class, new C114564b(this, (CpuStatFeature) obj));
    }
}
