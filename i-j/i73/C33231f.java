package i73;

import b73.C28273c;
import com.tencent.p014mm.autogen.events.OnSoterInitializedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;

/* renamed from: i73.f */
public class C33231f extends IStaticListener<OnSoterInitializedEvent> {
    public boolean callback(IEvent iEvent) {
        OnSoterInitializedEvent onSoterInitializedEvent = (OnSoterInitializedEvent) iEvent;
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().init();
        return false;
    }
}
