package pv2;

import com.tencent.p014mm.autogen.events.GetIsSupportSoterEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pv2.g */
public class C12020g extends IStaticListener<GetIsSupportSoterEvent> {
    public boolean callback(IEvent iEvent) {
        GetIsSupportSoterEvent getIsSupportSoterEvent = (GetIsSupportSoterEvent) iEvent;
        if (getIsSupportSoterEvent instanceof GetIsSupportSoterEvent) {
            Log.m105924i("MicroMsg.GetSoterSupportEventListener", "hy: request is support soter");
            Log.m105925i("MicroMsg.GetSoterSupportEventListener", "alvinluo isSupportSoter: %b", Boolean.valueOf(C77292s.m93116c()));
            if (C77292s.m93116c()) {
                getIsSupportSoterEvent.f9299d.f9300a = 1;
            } else {
                getIsSupportSoterEvent.f9299d.f9300a = 0;
            }
        }
        return true;
    }
}
