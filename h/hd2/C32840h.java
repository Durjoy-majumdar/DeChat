package hd2;

import com.tencent.p014mm.autogen.events.BroadcastEvent;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hd2.h */
public class C32840h extends IStaticListener<BroadcastEvent> {
    public boolean callback(IEvent iEvent) {
        BroadcastEvent broadcastEvent = (BroadcastEvent) iEvent;
        Log.m105919d("OfflineBroadcastEventIListener", "receive broadcase event: %s", Integer.valueOf(broadcastEvent.f343529d.f236156a));
        if (broadcastEvent.f343529d.f236156a == 4) {
            Log.m105924i("OfflineBroadcastEventIListener", "receive old disaster event");
            C69963m.wx0().Bx0().mo96266a(0, 0);
        }
        return false;
    }
}
