package uj2;

import com.tencent.p014mm.autogen.events.ChattingUIStatusEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75604z3;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import nj2.C109750j;

/* renamed from: uj2.a */
public final class C37474a extends IStaticListener<ChattingUIStatusEvent> {
    public boolean callback(IEvent iEvent) {
        ChattingUIStatusEvent chattingUIStatusEvent = (ChattingUIStatusEvent) iEvent;
        C87412m.m108594g(chattingUIStatusEvent, "event");
        C109750j jVar = C109750j.f328484a;
        boolean z = chattingUIStatusEvent.f78735d.f78736a;
        C109750j.f328485b = z;
        if (z) {
            return false;
        }
        Iterator it = ((ArrayList) C109750j.f328487d).iterator();
        while (it.hasNext()) {
            C72963f4 f4Var = (C72963f4) it.next();
            f4Var.mo108743W2(f4Var.f230723F | 16384);
            C75604z3.m90828C(f4Var);
        }
        ((ArrayList) C109750j.f328487d).clear();
        C109750j.f328486c.clear();
        return false;
    }
}
