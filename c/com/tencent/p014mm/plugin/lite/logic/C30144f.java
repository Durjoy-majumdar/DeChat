package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.lite.logic.f */
public class C30144f extends IStaticListener<ActivateEvent> {

    /* renamed from: d */
    public static long f81486d = 0;

    /* renamed from: e */
    public static long f81487e = 0;

    /* renamed from: f */
    public static boolean f81488f = true;

    public boolean callback(IEvent iEvent) {
        ActivateEvent activateEvent = (ActivateEvent) iEvent;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LITE_APP_CLEAN_LAST_TIME_LONG;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_LITE_APP_UPDATE_LAST_TIME_LONG;
        if (C86709a0.m107522a() && !activateEvent.f78706d.f78707a) {
            if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.AppLite.LiteAppCheckerListener", "callback fail. account not ready.");
            } else {
                if (f81486d == 0) {
                    f81486d = ((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar2, 0L)).longValue();
                }
                if (f81487e == 0) {
                    f81487e = ((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0L)).longValue();
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - f81486d;
                boolean z = f81488f;
                if ((!z || j < 1800000) && j < 43200000) {
                    Log.m105925i("MicroMsg.AppLite.LiteAppCheckerListener", "It's not time to update lite app. please wait %d second", Long.valueOf((43200000 - j) / 100));
                } else {
                    Log.m105925i("MicroMsg.AppLite.LiteAppCheckerListener", "It's time to update lite app. mFirstCheckAfterBoot:%b, duration:%d", Boolean.valueOf(z), Long.valueOf(j));
                    f81488f = false;
                    f81486d = currentTimeMillis;
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(currentTimeMillis));
                    ((C119157j) C119157j.f356862d).mo183875f(new C115482d(this));
                }
                if (currentTimeMillis - f81487e >= 86400000) {
                    Log.m105924i("MicroMsg.AppLite.LiteAppCheckerListener", "It's time to clean lite app.");
                    f81487e = currentTimeMillis;
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
                    ((C119157j) C119157j.f356862d).mo183875f(new C30143e(this));
                } else {
                    Log.m105925i("MicroMsg.AppLite.LiteAppCheckerListener", "It's not time to clean lite app. please wait %d second", Long.valueOf((86400000 - j) / 100));
                }
            }
        }
        return false;
    }
}
