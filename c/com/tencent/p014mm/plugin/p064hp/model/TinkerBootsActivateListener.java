package com.tencent.p014mm.plugin.p064hp.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import zw3.C91941a;

/* renamed from: com.tencent.mm.plugin.hp.model.TinkerBootsActivateListener */
public class TinkerBootsActivateListener extends IListener<ActivateEvent> {

    /* renamed from: d */
    public static long f81463d;

    public TinkerBootsActivateListener() {
        super(C40008f.f107254d);
        this.__eventId = -1435144905;
    }

    public boolean callback(IEvent iEvent) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG;
        if (!((ActivateEvent) iEvent).f78706d.f78707a && C86709a0.m107522a()) {
            if (f81463d == 0) {
                f81463d = ((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0L)).longValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f81463d >= 21600000) {
                try {
                    if (C91941a.m115469d() != null) {
                        C91941a.m115469d().mo125791a(false);
                        Log.m105924i("MicroMsg.Tinker.TinkerBootsActivateListener", "callback post task and fetchPatchUpdate false");
                        f81463d = currentTimeMillis;
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.Tinker.TinkerBootsActivateListener", th, "failure.", new Object[0]);
                }
            }
        }
        return false;
    }
}
