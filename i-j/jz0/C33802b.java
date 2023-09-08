package jz0;

import com.tencent.p014mm.autogen.events.GetCardCountEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: jz0.b */
public class C33802b extends IStaticListener<GetCardCountEvent> {
    public boolean callback(IEvent iEvent) {
        GetCardCountEvent getCardCountEvent = (GetCardCountEvent) iEvent;
        Log.m105924i("MicroMsg.SubCoreCard.cardGetCountListener", "deal with card notify event GetCardCountEvent");
        if (!(getCardCountEvent instanceof GetCardCountEvent)) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183879j(new C33801a(this, getCardCountEvent), 10000, "SubCoreCard-doSyncNetScene");
        return false;
    }
}
