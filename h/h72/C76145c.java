package h72;

import com.tencent.p014mm.autogen.events.SnsGetVideoThumbEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f72.C97842b;

/* renamed from: h72.c */
public class C76145c extends IStaticListener<SnsGetVideoThumbEvent> {
    public boolean callback(IEvent iEvent) {
        SnsGetVideoThumbEvent snsGetVideoThumbEvent = (SnsGetVideoThumbEvent) iEvent;
        snsGetVideoThumbEvent.f193939e.f193941a = C97842b.m126300q(snsGetVideoThumbEvent.f193938d.f193940a);
        return true;
    }
}
