package h22;

import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: h22.v */
public final class C32692v extends IStaticListener<HomeUITabChangeEvent> {
    public boolean callback(IEvent iEvent) {
        HomeUITabChangeEvent homeUITabChangeEvent = (HomeUITabChangeEvent) iEvent;
        C87412m.m108594g(homeUITabChangeEvent, "event");
        if (homeUITabChangeEvent.f78831d.f78832a != 2) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183895z(C8487u.f27497d);
        return false;
    }
}
