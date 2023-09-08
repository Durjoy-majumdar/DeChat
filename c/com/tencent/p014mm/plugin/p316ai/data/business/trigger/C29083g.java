package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.plugin.p316ai.data.business.trigger.SessionChangeTrigger;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.g */
public class C29083g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ KvReportEvent f79647d;

    /* renamed from: e */
    public final /* synthetic */ SessionChangeTrigger.C290792 f79648e;

    public C29083g(SessionChangeTrigger.C290792 r1, KvReportEvent kvReportEvent) {
        this.f79648e = r1;
        this.f79647d = kvReportEvent;
    }

    public void run() {
        try {
            SessionChangeTrigger.m38545c(SessionChangeTrigger.this, this.f79647d.f78853d.f78855b);
        } catch (Exception unused) {
        }
    }
}
