package gb2;

import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import fb2.C58939f;
import gy3.C87412m;

/* renamed from: gb2.g */
public final class C32377g extends IStaticListener<MusicPlayerEvent> {
    public boolean callback(IEvent iEvent) {
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        int i = musicPlayerEvent.f9336d.f9337a;
        int i2 = 2;
        if (i != 2) {
            i2 = i != 3 ? 0 : 1;
        }
        C58939f.f168643e = i2;
        return false;
    }
}
