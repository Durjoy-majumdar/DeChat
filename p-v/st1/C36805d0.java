package st1;

import com.tencent.p014mm.autogen.events.SupportFingerPrintEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import tt1.C78101i;

/* renamed from: st1.d0 */
public class C36805d0 extends IStaticListener<SupportFingerPrintEvent> {
    public boolean callback(IEvent iEvent) {
        SupportFingerPrintEvent supportFingerPrintEvent = (SupportFingerPrintEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.SupportFingerPrintEventListener", "SupportFingerPrintEventListener account is not ready");
            return false;
        } else if (!(supportFingerPrintEvent instanceof SupportFingerPrintEvent)) {
            return false;
        } else {
            Log.m105924i("MicroMsg.SupportFingerPrintEventListener", "handle SupportFingerPrintEvent");
            boolean Wy = ((C78101i) C86709a0.m107533q(C78101i.class)).mo108076Wy(MMApplicationContext.getContext());
            Log.m105924i("MicroMsg.SupportFingerPrintEventListener", "isSupportFP is " + Wy);
            SupportFingerPrintEvent.C28837a aVar = new SupportFingerPrintEvent.C28837a();
            aVar.f79020a = Wy;
            supportFingerPrintEvent.f79019d = aVar;
            Runnable runnable = supportFingerPrintEvent.callback;
            if (runnable != null) {
                runnable.run();
            }
            return true;
        }
    }
}
