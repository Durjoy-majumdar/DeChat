package hd2;

import com.tencent.p014mm.autogen.events.GetDisasterInfoEvent;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hd2.j */
public class C32843j extends IStaticListener<GetDisasterInfoEvent> {
    public boolean callback(IEvent iEvent) {
        GetDisasterInfoEvent getDisasterInfoEvent = (GetDisasterInfoEvent) iEvent;
        Log.m105924i("OfflineDisasterInfoEventListener", "receive disaster update token");
        C69963m.wx0().Bx0().mo96266a(0, 0);
        return false;
    }
}
