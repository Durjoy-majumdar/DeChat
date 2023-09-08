package dv1;

import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import ev1.C31725d;
import gy3.C87412m;

/* renamed from: dv1.t */
public final class C31310t extends IStaticListener<ManualAuthEvent> {
    public boolean callback(IEvent iEvent) {
        ManualAuthEvent manualAuthEvent = (ManualAuthEvent) iEvent;
        C87412m.m108594g(manualAuthEvent, "event");
        Log.m105925i(StringKtKt.TAG, "[callback] event:%s", manualAuthEvent);
        new C31725d().mo9225i();
        return true;
    }
}
