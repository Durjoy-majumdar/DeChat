package st1;

import com.tencent.p014mm.autogen.events.ReleaseFingerPrintAuthEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import tt1.C78101i;

/* renamed from: st1.w */
public class C36824w extends IStaticListener<ReleaseFingerPrintAuthEvent> {
    public boolean callback(IEvent iEvent) {
        ReleaseFingerPrintAuthEvent releaseFingerPrintAuthEvent = (ReleaseFingerPrintAuthEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.ReleaseFingerPrintAuthEventListener", "ReleaseFingerPrintAuthEventListener account is not ready");
            return false;
        } else if (!(releaseFingerPrintAuthEvent instanceof ReleaseFingerPrintAuthEvent)) {
            return false;
        } else {
            Log.m105924i("MicroMsg.ReleaseFingerPrintAuthEventListener", "handle ReleaseFingerPrintAuthEventListener");
            ((C78101i) C86709a0.m107533q(C78101i.class)).cancel();
            return true;
        }
    }
}
