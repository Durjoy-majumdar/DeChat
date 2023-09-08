package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.plugin.p316ai.data.business.trigger.FinderTrigger;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.d */
public class C17855d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ KvReportEvent f49221d;

    /* renamed from: e */
    public final /* synthetic */ FinderTrigger.C178474 f49222e;

    public C17855d(FinderTrigger.C178474 r1, KvReportEvent kvReportEvent) {
        this.f49222e = r1;
        this.f49221d = kvReportEvent;
    }

    public void run() {
        try {
            FinderTrigger.m18239k(FinderTrigger.this, this.f49221d.f78853d.f78855b);
        } catch (Exception unused) {
        }
    }
}
