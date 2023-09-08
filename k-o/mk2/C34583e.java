package mk2;

import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import hk2.C32939b;

/* renamed from: mk2.e */
public final class C34583e extends IStaticListener<ActivateEvent> {

    /* renamed from: d */
    public long f92999d;

    public boolean callback(IEvent iEvent) {
        ActivateEvent activateEvent = (ActivateEvent) iEvent;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINOF_WATCH_SO_RES_CHECK_LAST_TIME_LONG_SYNC;
        C87412m.m108594g(activateEvent, "event");
        if (!activateEvent.f78706d.f78707a) {
            if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.Rtos.SoResCheckListener", "acc no ready.");
            } else {
                if (this.f92999d == 0) {
                    Object f = C86709a0.m107535s().mo121142i().mo119685f(aVar, 0L);
                    C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Long");
                    this.f92999d = ((Long) f).longValue();
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f92999d >= 86400000) {
                    boolean z = true;
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_rtos_auto_dowanload_so_enable_android, 0) != 1) {
                        z = false;
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.Rtos.SoResCheckListener", "rtos auto check so resource");
                        this.f92999d = currentTimeMillis;
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
                        ((C32939b) C86312j.m106911c(C32939b.class)).mo33890Hf();
                    } else {
                        Log.m105924i("MicroMsg.Rtos.SoResCheckListener", "rtos disable auto check so resource");
                    }
                }
            }
        }
        return false;
    }
}
