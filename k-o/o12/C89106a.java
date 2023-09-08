package o12;

import com.tencent.p014mm.autogen.events.CheckIPCallIsStartedEvent;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: o12.a */
public class C89106a extends IStaticListener<CheckIPCallIsStartedEvent> {
    public boolean callback(IEvent iEvent) {
        CheckIPCallIsStartedEvent checkIPCallIsStartedEvent = (CheckIPCallIsStartedEvent) iEvent;
        if (!(checkIPCallIsStartedEvent instanceof CheckIPCallIsStartedEvent)) {
            return false;
        }
        checkIPCallIsStartedEvent.f236159d.f236160a = C105385g.Fx0().mo150086d();
        return false;
    }
}
