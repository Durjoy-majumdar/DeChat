package gb2;

import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import gy3.C87412m;
import hb2.C32799i;

/* renamed from: gb2.e */
public final class C8258e extends IStaticListener<MusicPlayerEvent> {
    public boolean callback(IEvent iEvent) {
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        if (musicPlayerEvent.f9336d.f9337a != 2) {
            return false;
        }
        C32799i.f89226a.getClass();
        C32799i.f89228c.clear();
        C32799i.f89229d.clear();
        return false;
    }
}
