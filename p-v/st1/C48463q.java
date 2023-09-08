package st1;

import com.tencent.p014mm.autogen.events.GetWcPaySignEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.android.wechat.TenpayUtil;

/* renamed from: st1.q */
public class C48463q extends IStaticListener<GetWcPaySignEvent> {
    public boolean callback(IEvent iEvent) {
        GetWcPaySignEvent getWcPaySignEvent = (GetWcPaySignEvent) iEvent;
        if (getWcPaySignEvent != null) {
            GetWcPaySignEvent.C40125b bVar = getWcPaySignEvent.f107603e;
            bVar.f107605a = TenpayUtil.signWith3Des("passwd=" + getWcPaySignEvent.f107602d.f107604a);
            Log.m105927v("MicroMsg.GetWcPaySignEventListener", "alvinluo wcpaysign: %s", getWcPaySignEvent.f107603e.f107605a);
        }
        return false;
    }
}
