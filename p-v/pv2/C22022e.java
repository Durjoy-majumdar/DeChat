package pv2;

import com.tencent.p014mm.autogen.events.GetIsEnrolledEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import lt3.C21460a;

/* renamed from: pv2.e */
public class C22022e extends IStaticListener<GetIsEnrolledEvent> {
    public boolean callback(IEvent iEvent) {
        GetIsEnrolledEvent getIsEnrolledEvent = (GetIsEnrolledEvent) iEvent;
        int i = getIsEnrolledEvent.f48096d.f48098a;
        Log.m105925i("MicroMsg.GetIsEnrolledListener", "hy: check mode: %d", Integer.valueOf(i));
        if (i != 1 || !C77292s.m93116c()) {
            Log.m105928w("MicroMsg.GetIsEnrolledListener", "hy: not support");
            getIsEnrolledEvent.f48097e.f48099a = -1;
        } else {
            boolean o = C21460a.m24281o(MMApplicationContext.getContext());
            Log.m105925i("MicroMsg.GetIsEnrolledListener", "hy: has enrolled fingerprint: %b", Boolean.valueOf(o));
            getIsEnrolledEvent.f48097e.f48099a = o ? 1 : 0;
        }
        return false;
    }
}
