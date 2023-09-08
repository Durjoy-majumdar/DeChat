package zg0;

import com.tencent.p014mm.autogen.events.RcptAddressEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import xg0.C78803b;

/* renamed from: zg0.l */
public class C39352l extends IStaticListener<RcptAddressEvent> {
    public boolean callback(IEvent iEvent) {
        RcptAddressEvent rcptAddressEvent = (RcptAddressEvent) iEvent;
        Log.m105924i("MicroMsg.RcptAddressEventListener", "revent " + rcptAddressEvent.f78894d.f78896a);
        String str = C86709a0.m107535s().f251807e;
        String str2 = rcptAddressEvent.f78894d.f78896a;
        C86013q1.m106442c(str2, str + "address");
        C78803b.xx0().f356681b = true;
        return false;
    }
}
