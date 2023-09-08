package hg0;

import com.tencent.p014mm.autogen.events.FMessageMobileFilterEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: hg0.k */
public class C76171k extends IStaticListener<FMessageMobileFilterEvent> {
    public boolean callback(IEvent iEvent) {
        FMessageMobileFilterEvent fMessageMobileFilterEvent = (FMessageMobileFilterEvent) iEvent;
        if (fMessageMobileFilterEvent instanceof FMessageMobileFilterEvent) {
            fMessageMobileFilterEvent.f193607e.f193610a = true;
            if (!Util.isNullOrNil(C76186t.m91537e(fMessageMobileFilterEvent.f193606d.f193608a))) {
                fMessageMobileFilterEvent.f193607e.f193610a = false;
            } else if (!Util.isNullOrNil(C76186t.m91537e(fMessageMobileFilterEvent.f193606d.f193609b))) {
                fMessageMobileFilterEvent.f193607e.f193610a = false;
            } else {
                Log.m105924i("MicroMsg.FMessageMobileFilterListenerImpl", "mobile fmessage not found by phonemd5 or fullphonemd5");
            }
        }
        return false;
    }
}
