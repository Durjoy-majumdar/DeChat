package p73;

import com.tencent.p014mm.autogen.events.WearYoEvent;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import ob0.C35136m;
import p73.C110188a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: p73.b */
public class C110190b implements C35136m {
    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        C77949j3 j3Var = aVar.f94242a;
        if (Util.isNullOrNil((String) C97625j3.m125812b().mo105906u().mo119684e(2, ""))) {
            return null;
        }
        String g = C48374j0.m53718g(j3Var.f227628e);
        String g2 = C48374j0.m53718g(j3Var.f227629f);
        if (Util.isNullOrNil(g) || Util.isNullOrNil(g2)) {
            Log.m105920e("MicroMsg.YoExtension", "neither from-user nor to-user can be empty");
            return null;
        }
        String g3 = C48374j0.m53718g(j3Var.f227631h);
        Log.m105924i("MicroMsg.YoExtension", "from  " + g + "content " + g3);
        C110188a Bx0 = C43457b.Bx0();
        synchronized (Bx0.f329638a) {
            WearYoEvent wearYoEvent = new WearYoEvent();
            WearYoEvent.C104600a aVar2 = wearYoEvent.f310022d;
            aVar2.f310024a = 1;
            aVar2.f310025b = g;
            wearYoEvent.publish();
            if (Bx0.f329638a.containsKey(g) || wearYoEvent.f310023e.f310026a == 1) {
                Log.m105925i("MicroMsg.wear.WearYoLogic", "Can not add Yo Message %s", g);
                WearYoEvent wearYoEvent2 = new WearYoEvent();
                WearYoEvent.C104600a aVar3 = wearYoEvent2.f310022d;
                aVar3.f310024a = 2;
                aVar3.f310025b = g;
                wearYoEvent2.publish();
            } else {
                Log.m105925i("MicroMsg.wear.WearYoLogic", "Can add Yo Message %s", g);
                Bx0.f329638a.put(g, new C110188a.C110189a(Bx0, g, g3));
            }
        }
        C43457b.Bx0().mo161588a();
        return null;
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }
}
