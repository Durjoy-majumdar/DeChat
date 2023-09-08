package d21;

import b21.C113081b;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: d21.a */
public class C31051a extends IStaticListener<AppActiveEvent> {
    public boolean callback(IEvent iEvent) {
        C113081b.yx0().f338485d = ((AppActiveEvent) iEvent).f78710d.f78711a;
        return false;
    }
}
