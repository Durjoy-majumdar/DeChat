package p222qm;

import com.tencent.p014mm.app.C28682l1;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.GetDisasterInfoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: qm.j0 */
public class C35950j0 extends IStaticListener<GetDisasterInfoEvent> {
    public boolean callback(IEvent iEvent) {
        GetDisasterInfoEvent.C28755a aVar;
        GetDisasterInfoEvent getDisasterInfoEvent = (GetDisasterInfoEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        if (getDisasterInfoEvent == null || (aVar = getDisasterInfoEvent.f78820d) == null) {
            Log.m105928w("MicroMsg.WorkerProfile", "summerdiz GetDisasterInfoEvent event null ret false");
        } else {
            int i = aVar.f78821a;
            boolean z = aVar.f78822b;
            Log.m105925i("MicroMsg.WorkerProfile", "summerdiz GetDisasterInfoEvent callback event noticeid[%d], manualauthSucc[%b]", Integer.valueOf(i), Boolean.valueOf(z));
            C86709a0.m107525e().postToWorker(new C28682l1(i, z));
        }
        return false;
    }
}
