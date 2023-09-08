package p222qm;

import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: qm.n1 */
public class C47869n1 extends IStaticListener<SetLocalQQMobileEvent> {
    public boolean callback(IEvent iEvent) {
        C80610p1 p1Var = C80610p1.f235824f;
        SetLocalQQMobileEvent.C1133a aVar = ((SetLocalQQMobileEvent) iEvent).f9501d;
        C74584x.m89302e(aVar.f9503a, aVar.f9504b);
        return false;
    }
}
