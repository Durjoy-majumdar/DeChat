package com.tencent.p014mm.plugin.appbrand.crash_report;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ANRDetectedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import yi0.C91456b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/crash_report/AppBrandCrashReportFullMonitor$setup$3", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ANRDetectedEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.crash_report.AppBrandCrashReportFullMonitor$setup$3 */
public final class AppBrandCrashReportFullMonitor$setup$3 extends IListener<ANRDetectedEvent> {
    public AppBrandCrashReportFullMonitor$setup$3(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((ANRDetectedEvent) iEvent, "event");
        C91456b.f262190a.mo125390a(C91456b.f262194e);
        return false;
    }
}
