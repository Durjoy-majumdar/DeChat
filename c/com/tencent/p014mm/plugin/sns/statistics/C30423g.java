package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.autogen.events.AggressiveCleanCacheEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import hf3.C98449c;

/* renamed from: com.tencent.mm.plugin.sns.statistics.g */
public final class C30423g extends IStaticListener<AggressiveCleanCacheEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        C87412m.m108594g((AggressiveCleanCacheEvent) iEvent, "event");
        Log.m105924i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        C30420b bVar = C30420b.f82051a;
        if (bVar.mo57380d() || bVar.mo57381e()) {
            ((C98449c) C86312j.m106911c(C98449c.class)).mo136680ji();
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        return true;
    }
}
