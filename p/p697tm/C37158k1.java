package p697tm;

import com.tencent.p014mm.autogen.events.MsgInsertWithNewContactEvent;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;

/* renamed from: tm.k1 */
public class C37158k1 extends IStaticListener<MsgInsertWithNewContactEvent> {
    public boolean callback(IEvent iEvent) {
        MsgInsertWithNewContactEvent msgInsertWithNewContactEvent = (MsgInsertWithNewContactEvent) iEvent;
        if (C86709a0.m107522a()) {
            C72996z1 z1Var = msgInsertWithNewContactEvent.f78869d.f78870a;
            if (C72996z1.m85804J4(z1Var.getUsername())) {
                z1Var.mo62919n4(0);
                C81662k.m100197p(z1Var.getUsername());
            }
        }
        return false;
    }
}
