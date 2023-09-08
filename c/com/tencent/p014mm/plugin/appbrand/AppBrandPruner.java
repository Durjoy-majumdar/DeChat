package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.plugin.appbrand.appcache.C81244g0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81259i0;
import com.tencent.p014mm.plugin.appbrand.utils.C84741h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandPruner */
public final class AppBrandPruner {

    /* renamed from: a */
    public static final IListener<ActivateEvent> f238102a = new IListener<ActivateEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1435144905;
        }

        public boolean callback(IEvent iEvent) {
            if (((ActivateEvent) iEvent).f78706d.f78707a) {
                C81259i0 i0Var = C81244g0.f238642a;
                i0Var.getClass();
                try {
                    C115669n.INSTANCE.mo175911u(1007, 2);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.PkgCleanupNewLogic", th, "cleanup interrupted report", new Object[0]);
                }
                i0Var.f238666d.set(true);
            } else if (C86709a0.m107522a()) {
                AppBrandPruner.m99064a();
            }
            return false;
        }
    };

    /* renamed from: a */
    public static void m99064a() {
        ((C119157j) C119157j.f356862d).mo183885p(new C84741h(new AppBrandPruner$$a()), "MicroMsg.AppBrandPruner");
    }
}
