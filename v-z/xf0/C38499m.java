package xf0;

import com.tencent.p014mm.autogen.events.ReceiveAAMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import yf0.C79104i;

/* renamed from: xf0.m */
public class C38499m extends IStaticListener<ReceiveAAMsgEvent> {
    public boolean callback(IEvent iEvent) {
        ReceiveAAMsgEvent.C28793a aVar = ((ReceiveAAMsgEvent) iEvent).f78899d;
        long j = aVar.f78900a;
        String str = aVar.f78901b;
        Log.m105925i("ReceiveAAMsgEventListener", "ReceiveAAMsgEvent, localMsgId: %s, msgContent: %s", Long.valueOf(j), Util.secPrint(str));
        C79104i.m95674s(j, str);
        return false;
    }
}
