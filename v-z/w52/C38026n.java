package w52;

import com.tencent.p014mm.autogen.events.UpdatePackageEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;
import sf0.C48374j0;
import te3.C52089y93;

/* renamed from: w52.n */
public class C38026n extends IStaticListener<UpdatePackageEvent> {
    public boolean callback(IEvent iEvent) {
        List<C52089y93> list = ((UpdatePackageEvent) iEvent).f79038d.f79040b;
        if (list != null) {
            LinkedList linkedList = (LinkedList) list;
            if (linkedList.size() > 0) {
                byte[] d = C48374j0.m53715d(((C52089y93) linkedList.get(0)).f145196h);
                if (!(d == null || d.length == 0)) {
                    String str = new String(d);
                    Log.m105924i("MicroMsg.UpdateMassSendPlaceTopListener", "MassSendTopConfXml:" + str);
                    C38023l.xx0().mo73769c(str);
                }
                return false;
            }
        }
        Log.m105920e("MicroMsg.UpdateMassSendPlaceTopListener", "empty mass send top config package");
        return false;
    }
}
