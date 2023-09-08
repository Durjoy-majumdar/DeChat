package com.tencent.p014mm.plugin.appbrand;

import android.app.Application;
import android.content.Context;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import li0.C88508b;
import li0.C88509c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/AppBrandRuntimeSuspendingWatchDog$watch$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMTrimMemoryEvent;", "Lli0/c$c;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1 */
public final class AppBrandRuntimeSuspendingWatchDog$watch$1 extends IListener<MMTrimMemoryEvent> implements C88509c.C88513c {

    /* renamed from: d */
    public long f238254d;

    /* renamed from: e */
    public C88508b f238255e = C88508b.FOREGROUND;

    /* renamed from: f */
    public final C81089a f238256f;

    /* renamed from: g */
    public final AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1 f238257g;

    /* renamed from: h */
    public final /* synthetic */ AppBrandRuntimeWC f238258h;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1$a */
    public static final class C81089a extends C83726p1 {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntimeWC f238259d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandRuntimeSuspendingWatchDog$watch$1 f238260e;

        public C81089a(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandRuntimeSuspendingWatchDog$watch$1 appBrandRuntimeSuspendingWatchDog$watch$1) {
            this.f238259d = appBrandRuntimeWC;
            this.f238260e = appBrandRuntimeSuspendingWatchDog$watch$1;
        }

        public void onLowMemory() {
            if (this.f238259d.f238113K.mo122980c() == C88508b.SUSPEND && this.f238260e.mo113169e()) {
                Log.m105920e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onLowMemory(), runtime(" + this.f238259d.f238147j + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f238260e.f238254d + ')');
                this.f238259d.mo113006E();
                C115669n.INSTANCE.mo175911u(1761, 3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandRuntimeSuspendingWatchDog$watch$1(AppBrandRuntimeWC appBrandRuntimeWC, C40008f fVar) {
        super(fVar);
        this.f238258h = appBrandRuntimeWC;
        appBrandRuntimeWC.f238113K.mo122978a(this);
        this.f238256f = new C81089a(appBrandRuntimeWC, this);
        this.f238257g = new AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1(appBrandRuntimeWC, this, C40008f.f107254d);
    }

    public void alive() {
        Object obj;
        C81089a aVar = this.f238256f;
        aVar.getClass();
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            try {
                Result.Companion companion = Result.Companion;
                application.registerComponentCallbacks(aVar);
                obj = Result.m168114constructorimpl(C13598b0.f38549a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            Result.m168113boximpl(obj);
        }
        this.f238257g.alive();
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(bVar, "state");
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                Log.m105924i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(SUSPEND) runtime(" + this.f238258h.f238147j + ')');
                this.f238254d = Util.nowMilliSecond();
                C115669n.INSTANCE.mo175911u(1761, 10);
            } else if (ordinal != 3) {
                this.f238254d = 0;
            } else {
                dead();
            }
        } else if (C88508b.SUSPEND == this.f238255e) {
            Log.m105924i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(FOREGROUND), lastState is SUSPEND, runtime(" + this.f238258h.f238147j + ')');
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1761, 11);
            if (mo113169e()) {
                Log.m105924i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(FOREGROUND), lastState is SUSPEND and exceeded timeout limit, runtime(" + this.f238258h.f238147j + ')');
                nVar.mo175911u(1761, 12);
            }
        }
        this.f238255e = bVar;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((MMTrimMemoryEvent) iEvent, "event");
        if (this.f238258h.f238113K.mo122980c() != C88508b.SUSPEND || !mo113169e()) {
            return false;
        }
        Log.m105920e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "callback(MMTrimMemoryEvent), runtime(" + this.f238258h.f238147j + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f238254d + ')');
        this.f238258h.mo113006E();
        C115669n.INSTANCE.mo175911u(1761, 2);
        return false;
    }

    /* renamed from: d */
    public void mo113168d() {
        Log.m105924i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateSuspendTimeout, runtime(" + this.f238258h.f238147j + ')');
        C115669n.INSTANCE.mo175911u(1761, 1);
    }

    public void dead() {
        Object obj;
        C81089a aVar = this.f238256f;
        aVar.getClass();
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            try {
                Result.Companion companion = Result.Companion;
                application.unregisterComponentCallbacks(aVar);
                obj = Result.m168114constructorimpl(C13598b0.f38549a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            Result.m168113boximpl(obj);
        }
        this.f238257g.dead();
        super.dead();
    }

    /* renamed from: e */
    public final boolean mo113169e() {
        if (!this.f238258h.mo113037W0()) {
            return false;
        }
        long j = ((long) this.f238258h.mo113213o1().f261071q) * 1000;
        long j2 = this.f238254d;
        return j2 > 0 && j2 < Util.nowMilliSecond() && Util.nowMilliSecond() - this.f238254d > j;
    }
}
