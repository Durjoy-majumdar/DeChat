package p281yz;

import com.tencent.p014mm.autogen.events.UpdatePackageEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e63.C75556b;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import sf0.C48374j0;
import te3.C52089y93;
import z04.C119027c;

/* renamed from: yz.n */
public final class C39260n extends IStaticListener<UpdatePackageEvent> {
    public boolean callback(IEvent iEvent) {
        UpdatePackageEvent updatePackageEvent = (UpdatePackageEvent) iEvent;
        C87412m.m108594g(updatePackageEvent, "event");
        UpdatePackageEvent.C28845a aVar = updatePackageEvent.f79038d;
        if (aVar.f79039a == 11) {
            List<C52089y93> list = aVar.f79040b;
            if (list != null) {
                LinkedList linkedList = (LinkedList) list;
                if (linkedList.size() > 0) {
                    byte[] d = C48374j0.m53715d(((C52089y93) linkedList.get(0)).f145196h);
                    if (!(d == null || d.length == 0)) {
                        String str = new String(d, C119027c.f356488a);
                        C79173v vVar = (C79173v) C86312j.m106911c(C79173v.class);
                        if (C87412m.m108589b(str, vVar.f232486u)) {
                            Log.m105924i("MicroMsg.UpdateMassSendPlaceTopListener", "the same result : %s" + str);
                        } else {
                            Log.m105925i("MicroMsg.UpdateMassSendPlaceTopListener", "UpdatePackageEvent: %s", str);
                            C75556b.m90595e(str);
                            vVar.f232486u = str;
                        }
                    }
                }
            }
            Log.m105920e("MicroMsg.UpdateMassSendPlaceTopListener", "empty UpdatePackageEvent");
        }
        return false;
    }
}
