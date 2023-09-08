package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.autogen.events.KvReportEvent;

/* renamed from: com.tencent.mm.plugin.report.service.j */
public class C30359j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f81925d;

    /* renamed from: e */
    public final /* synthetic */ String f81926e;

    public C30359j(long j, String str) {
        this.f81925d = j;
        this.f81926e = str;
    }

    public void run() {
        KvReportEvent kvReportEvent = new KvReportEvent();
        KvReportEvent.C28769a aVar = kvReportEvent.f78853d;
        aVar.f78854a = this.f81925d;
        aVar.f78855b = this.f81926e;
        kvReportEvent.publish();
    }
}
