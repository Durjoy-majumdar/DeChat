package qj1;

import cj1.C54847z3;
import cl1.C54951d;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import pe3.C47465a;
import te3.C50516na1;
import te3.C51803w91;

/* renamed from: qj1.v */
public final class C63041v extends C54847z3.C54849b<C51803w91> {

    /* renamed from: b */
    public final /* synthetic */ C62898o f178902b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63041v(C62898o oVar, Class<C51803w91> cls) {
        super(cls);
        this.f178902b = oVar;
    }

    /* renamed from: a */
    public void mo9116a(C47465a aVar) {
        C51803w91 w912 = (C51803w91) aVar;
        C87412m.m108594g(w912, "result");
        if (w912.f143934d.size() > 0) {
            CopyOnWriteArrayList<C54951d.C54955e> copyOnWriteArrayList = ((C54951d) this.f178902b.mo87696x0(C54951d.class)).f154002g;
            LinkedList<C50516na1> linkedList = w912.f143934d;
            C87412m.m108593f(linkedList, "result.ad_infos");
            for (C50516na1 na12 : linkedList) {
                Log.m105924i("FinderLiveAdVideoPlugin", "startPolling onPollingSuccess live_ad_id:" + na12.f138504d + " startTime:" + na12.f138505e + " duration:" + na12.f138506f);
                Iterator<C54951d.C54955e> it = copyOnWriteArrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    C54951d.C54955e next = it.next();
                    if (C87412m.m108589b(next.f154036b.f138504d, na12.f138504d) && next.f154036b.f138505e == na12.f138505e) {
                        break;
                    }
                    i++;
                }
                if (i == -1) {
                    copyOnWriteArrayList.add(new C54951d.C54955e(C54951d.C54956g.IDLE, na12));
                    Log.m105924i("FinderLiveAdVideoPlugin", "startPolling add live_ad_id:" + na12.f138504d + " startTime:" + na12.f138505e + " size:" + copyOnWriteArrayList.size());
                }
            }
            return;
        }
        Log.m105924i("FinderLiveAdVideoPlugin", "startPolling poll no ad video");
    }
}
