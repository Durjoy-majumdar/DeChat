package v22;

import com.tencent.p014mm.autogen.events.FetchStreetViewUrlEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: v22.l */
public class C37656l extends IStaticListener<FetchStreetViewUrlEvent> {
    public boolean callback(IEvent iEvent) {
        FetchStreetViewUrlEvent fetchStreetViewUrlEvent = (FetchStreetViewUrlEvent) iEvent;
        if (!(fetchStreetViewUrlEvent instanceof FetchStreetViewUrlEvent)) {
            return false;
        }
        fetchStreetViewUrlEvent.f78787d.getClass();
        return true;
    }
}
