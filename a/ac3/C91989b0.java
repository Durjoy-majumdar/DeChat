package ac3;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import p490dl.C97484a;
import p523fp.C32147e;

/* renamed from: ac3.b0 */
public final class C91989b0 extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        Class cls = C32147e.class;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        int i = aVar.f78744a;
        boolean z = aVar.f78748e;
        if (i != 99) {
            if (i == 101 && z) {
                int i2 = aVar.f78745b;
                Log.m105924i("MicroMsg.WeVisModelResMgr", "model file update " + i + '.' + i2);
                String AD = ((C32147e) C86312j.m106911c(cls)).mo58507AD(i, i2);
                if (AD == null) {
                    Log.m105928w("MicroMsg.WeVisModelResMgr", "path is null");
                } else if (C91990c1.f263329a.mo125827b(i2, AD)) {
                    ((C32147e) C86312j.m106911c(cls)).Y40(101, i2, -1);
                }
            }
        } else if (z) {
            Log.m105924i("MicroMsg.WeVisModelResMgr", "config file update");
            String AD2 = ((C32147e) C86312j.m106911c(cls)).mo58507AD(i, 0);
            if (AD2 == null) {
                Log.m105928w("MicroMsg.WeVisModelResMgr", "path is null");
            } else {
                C91996t0 t0Var = new C91996t0();
                C97484a.f286123a.mo136755a(AD2, t0Var);
                if (t0Var.mo125839h()) {
                    C91992q0 q0Var = C91992q0.f263331a;
                    C86013q1.m106442c(AD2, C91992q0.f263334d + "/ModelListConfig.xml");
                    q0Var.mo125834h();
                    C91990c1.f263329a.mo125826a();
                }
            }
        }
        return false;
    }
}
