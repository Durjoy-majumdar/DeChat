package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.plugin.p316ai.data.business.trigger.FinderTrigger;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.c */
public class C17854c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ KvReportEvent f49219d;

    /* renamed from: e */
    public final /* synthetic */ FinderTrigger.C178474 f49220e;

    public C17854c(FinderTrigger.C178474 r1, KvReportEvent kvReportEvent) {
        this.f49220e = r1;
        this.f49219d = kvReportEvent;
    }

    public void run() {
        try {
            FinderTrigger.m18238j(FinderTrigger.this, this.f49219d.f78853d.f78855b);
        } catch (Exception unused) {
        }
    }
}
