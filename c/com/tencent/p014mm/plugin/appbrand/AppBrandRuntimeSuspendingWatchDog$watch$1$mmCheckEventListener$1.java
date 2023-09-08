package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;
import li0.C88508b;
import li0.C88509c;
import li0.C88514d;
import p225rc.C89913b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1 */
public final class AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1 extends IListener<AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238261d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeSuspendingWatchDog$watch$1 f238262e;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1$a */
    public /* synthetic */ class C81090a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f238263a;

        static {
            int[] iArr = new int[C88508b.values().length];
            iArr[2] = 1;
            iArr[1] = 2;
            f238263a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandRuntimeSuspendingWatchDog$watch$1 appBrandRuntimeSuspendingWatchDog$watch$1, C40008f fVar) {
        super(fVar);
        this.f238261d = appBrandRuntimeWC;
        this.f238262e = appBrandRuntimeSuspendingWatchDog$watch$1;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent) iEvent, "event");
        C88509c cVar = this.f238261d.f238113K;
        C88508b c = cVar != null ? cVar.mo122980c() : null;
        int i = c == null ? -1 : C81090a.f238263a[c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f238261d.f238113K.f255667a.mo122987s(C88514d.C88522g.CHECK_PROCESS_IMPORTANCE, (Object) null);
            }
        } else if (this.f238262e.mo113169e()) {
            Log.m105920e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "callback(MainProcessTriggerCheckEvent), runtime(" + this.f238261d.f238147j + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f238262e.f238254d + ')');
            this.f238261d.mo113006E();
            C115669n.INSTANCE.mo175911u(1761, 4);
            return false;
        }
        AppBrandRuntimeWC appBrandRuntimeWC = this.f238261d;
        if (appBrandRuntimeWC.f238116N) {
            return false;
        }
        C89913b bVar = appBrandRuntimeWC.f238126U;
        if (bVar.f258373c <= 0 || bVar.f258374d < 0 || Util.nowMilliSecond() - bVar.f258373c < bVar.f258374d) {
            return false;
        }
        bVar.f258371a.removeCallbacks(bVar.f258372b);
        bVar.f258372b.run();
        return false;
    }
}
