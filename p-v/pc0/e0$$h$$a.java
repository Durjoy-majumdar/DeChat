package pc0;

import com.tencent.p014mm.autogen.events.SnsSyncEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import kj2.C117407d;

public final /* synthetic */ class e0$$h$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ e0$$h f94856d;

    public /* synthetic */ e0$$h$$a(e0$$h e0__h) {
        this.f94856d = e0__h;
    }

    public final void run() {
        e0$$h e0__h = this.f94856d;
        e0__h.getClass();
        Log.m105925i("MicroMsg.SyncService", "%s onFinishCmd ContinueFlag[%s]", e0__h, Integer.valueOf(e0__h.f352745f.f299847f));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(8196, Long.valueOf((long) e0__h.f352745f.f299847f));
        if ((e0__h.f352745f.f299847f & 256) != 0) {
            e0__h.f352746g.getClass();
            SnsSyncEvent snsSyncEvent = new SnsSyncEvent();
            snsSyncEvent.f79001d.f79002a = 2;
            snsSyncEvent.publish();
            C117407d.INSTANCE.idkeyStat(99, 22, 1, false);
        }
    }
}
