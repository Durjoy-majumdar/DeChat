package q71;

import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import hk2.C32939b;

/* renamed from: q71.i */
public class C35782i extends IStaticListener<AppActiveEvent> {
    public boolean callback(IEvent iEvent) {
        AppActiveEvent appActiveEvent = (AppActiveEvent) iEvent;
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105924i("RtosOnForegroundListener", "account not ready");
            return false;
        }
        ((C32939b) C86312j.m106911c(C32939b.class)).xv0(Boolean.valueOf(appActiveEvent.f78710d.f78711a));
        return false;
    }
}
