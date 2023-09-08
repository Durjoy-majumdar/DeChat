package p340fm;

import com.tencent.p014mm.autogen.events.SessionChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import hh0.C20942f;

/* renamed from: fm.k */
public class C32100k extends IStaticListener<SessionChangeEvent> {
    public boolean callback(IEvent iEvent) {
        SessionChangeEvent sessionChangeEvent = (SessionChangeEvent) iEvent;
        C20942f yx02 = C20942f.yx0();
        yx02.getClass();
        if (sessionChangeEvent == null) {
            return false;
        }
        SessionChangeEvent.C28822a aVar = sessionChangeEvent.f78973d;
        if (aVar.f78976c != 0) {
            return false;
        }
        if ("143".equals(aVar.f78974a)) {
            synchronized (yx02) {
                yx02.f59378j.clear();
            }
            return false;
        } else if ("152".equals(sessionChangeEvent.f78973d.f78974a)) {
            synchronized (yx02) {
                yx02.f59379n.clear();
            }
            return false;
        } else if (!"150".equals(sessionChangeEvent.f78973d.f78974a)) {
            return false;
        } else {
            synchronized (yx02) {
                yx02.f59379n.clear();
            }
            return false;
        }
    }
}
