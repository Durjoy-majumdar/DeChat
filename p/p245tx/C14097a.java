package p245tx;

import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;
import gy3.C87412m;

/* renamed from: tx.a */
public final class C14097a extends IStaticListener<DynamicConfigUpdatedEvent> {
    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((DynamicConfigUpdatedEvent) iEvent, "event");
        if (!C86709a0.m107522a()) {
            return false;
        }
        C74560s1.m89276e();
        return false;
    }
}
