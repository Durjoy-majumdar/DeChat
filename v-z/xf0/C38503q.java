package xf0;

import ag0.C27890c;
import ag0.C27891d;
import com.tencent.p014mm.autogen.events.WalletQueryAAStatusEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import java.util.HashMap;
import vf0.C37726b;

/* renamed from: xf0.q */
public class C38503q extends IStaticListener<WalletQueryAAStatusEvent> {
    public boolean callback(IEvent iEvent) {
        int i;
        WalletQueryAAStatusEvent walletQueryAAStatusEvent = (WalletQueryAAStatusEvent) iEvent;
        String str = walletQueryAAStatusEvent.f79053d.f79055a;
        WalletQueryAAStatusEvent.C28851b bVar = walletQueryAAStatusEvent.f79054e;
        C27891d vx02 = C37726b.vx0();
        vx02.getClass();
        if (((HashMap) C27891d.f77053g).containsKey(str)) {
            i = ((C27890c) ((HashMap) C27891d.f77053g).get(str)).field_status;
        } else {
            C27890c Lo = vx02.mo55666Lo(str);
            if (Lo != null) {
                ((HashMap) C27891d.f77053g).put(str, Lo);
                i = Lo.field_status;
            } else {
                i = -1;
            }
        }
        bVar.f79056a = i;
        return false;
    }
}
