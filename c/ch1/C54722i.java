package ch1;

import android.os.Bundle;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import d60.C58124b;
import fj1.C45795b;
import fy3.C32227p;
import gh1.C59447j;
import gy3.C87413o;
import rx3.C13598b0;
import wg1.C66110y2;

/* renamed from: ch1.i */
public final class C54722i extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45795b f153363d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54722i(C45795b bVar) {
        super(2);
        this.f153363d = bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        Class cls = C55001u.class;
        if (booleanValue) {
            FinderLiveService.f159376d.getClass();
            LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
            if (liveRoomControllerStore != null) {
                C59447j.f169870a.mo84554f(liveRoomControllerStore);
            }
        } else {
            FinderLiveService.f159376d.getClass();
            LiveRoomControllerStore liveRoomControllerStore2 = FinderLiveService.f159349B;
            if (liveRoomControllerStore2 != null) {
                C59447j.f169870a.mo84555g(liveRoomControllerStore2);
            }
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        boolean z = true;
        if (bVar == null || !bVar.isDestroyed()) {
            z = false;
        }
        if (!z) {
            if (booleanValue) {
                C56032b bVar2 = FinderLiveService.f159379g;
                if (bVar2 != null) {
                    C58124b.C7172a.m7372a(bVar2, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE, (Bundle) null, 2, (Object) null);
                }
            } else {
                C56032b bVar3 = FinderLiveService.f159379g;
                if (bVar3 != null) {
                    C58124b.C7172a.m7372a(bVar3, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE_RECOVERY, (Bundle) null, 2, (Object) null);
                }
            }
        } else if (booleanValue) {
            C45795b bVar4 = this.f153363d;
            finderLiveService.mo77623Z(bVar4, false, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE, (Bundle) null, ((C55001u) bVar4.mo71262a(cls)).f154420q.f182392d);
            finderLiveService.mo77611N();
            C66110y2.m77912b(C66110y2.f190024a, 1, intValue, 0, true, 4, (Object) null);
        } else {
            C45795b bVar5 = this.f153363d;
            finderLiveService.mo77623Z(bVar5, false, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE_RECOVERY, (Bundle) null, ((C55001u) bVar5.mo71262a(cls)).f154420q.f182392d);
            C66110y2.m77912b(C66110y2.f190024a, 2, intValue, 0, true, 4, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
