package cj1;

import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import d60.C58124b;
import dj1.C45389s0;
import fj1.C45795b;
import fy3.C32227p;
import gh1.C59447j;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51239sg1;
import te3.C64510l21;

/* renamed from: cj1.e5 */
public final class C54751e5 implements C45389s0.C45390a {

    /* renamed from: cj1.e5$a */
    public static final class C54752a extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public static final C54752a f153462d = new C54752a();

        public C54752a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
            if (liveRoomControllerStore != null) {
                C59447j.f169870a.mo84555g(liveRoomControllerStore);
            }
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null && !bVar.isDestroyed()) {
                C56032b bVar2 = FinderLiveService.f159379g;
                if (bVar2 != null) {
                    C58124b.C7172a.m7372a(bVar2, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE, (Bundle) null, 2, (Object) null);
                }
            } else {
                C45795b bVar3 = FinderLiveService.f159348A;
                if (bVar3 != null) {
                    finderLiveService.mo77623Z(bVar3, true, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE_RECOVERY, (Bundle) null, ((C55001u) bVar3.mo71262a(C55001u.class)).f154420q.f182392d);
                }
            }
            C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
            if (oVar != null) {
                oVar.f154284Y2 = 0;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo10574a(int i, int i2, String str, C51239sg1 sg12) {
        C54991o oVar;
        C87412m.m108594g(sg12, "resp");
        if (i == 0 && i2 == 0 && (oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class)) != null) {
            C64510l21 l212 = new C64510l21();
            l212.f184023d = 0;
            l212.f184025f = 0;
            oVar.mo75978P4(l212, false, C54752a.f153462d);
        }
    }
}
