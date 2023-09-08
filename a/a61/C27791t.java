package a61;

import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p441aq.C92054g;

/* renamed from: a61.t */
public class C27791t extends IStaticListener<RevokeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
        if (!(revokeMsgEvent instanceof RevokeMsgEvent)) {
            return false;
        }
        if (revokeMsgEvent.f78943d.f78944a == 0) {
            RevokeMsgEvent.C28810a aVar = revokeMsgEvent.f78943d;
            long j = aVar.f78948e;
            ((C92054g) C86312j.m106911c(C92054g.class)).f263575g.put(Long.valueOf(j), aVar.f78945b);
            return false;
        }
        Log.m105924i("MicroMsg.emoji.EmojiRevokeMsgListener", "has handle in sys cmd msg extension.");
        return false;
    }
}
