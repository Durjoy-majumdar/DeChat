package p577jr;

import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;

/* renamed from: jr.d */
public final class C33635d extends IStaticListener<IEvent> {
    public boolean callback(IEvent iEvent) {
        C87412m.m108594g(iEvent, "event");
        if (!C86709a0.m107522a()) {
            return false;
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C55001u uVar = (C55001u) finderLiveService.mo77630e(C55001u.class);
        if (uVar != null) {
            Log.m105924i("Finder.FinderLiveService", "receive logoutEvent, liveId:" + uVar.f154420q.f182392d);
            FinderLiveService.m63768J(finderLiveService, false, (C32224a) null, 3, (Object) null);
        }
        return false;
    }
}
