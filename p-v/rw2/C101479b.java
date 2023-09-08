package rw2;

import com.tencent.p014mm.autogen.events.GetJDUrlEvent;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96463h;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: rw2.b */
public class C101479b extends IStaticListener<GetJDUrlEvent> {
    public boolean callback(IEvent iEvent) {
        GetJDUrlEvent getJDUrlEvent = (GetJDUrlEvent) iEvent;
        if (getJDUrlEvent == null) {
            return false;
        }
        getJDUrlEvent.f236214d.f236215a = C96463h.yx0().Bx0();
        return false;
    }
}
