package fh1;

import al1.C54129i;
import cl1.C55001u;
import com.tencent.p014mm.autogen.events.FinderLiveStatusRefreshEvent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import o40.C61926c;
import rx3.C13598b0;
import te3.C52005xq0;
import te3.C64273c21;

/* renamed from: fh1.a1 */
public final class C58994a1 extends C8313a {

    /* renamed from: j */
    public final String f168790j = "Finder.LiveEventController";

    /* renamed from: fh1.a1$a */
    public static final class C58995a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveStatusRefreshEvent f168791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58995a(FinderLiveStatusRefreshEvent finderLiveStatusRefreshEvent) {
            super(0);
            this.f168791d = finderLiveStatusRefreshEvent;
        }

        public Object invoke() {
            this.f168791d.publish();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58994a1(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo84226m3(long j, int i) {
        HashMap<Long, String> hashMap;
        String str;
        FinderLiveService.f159376d.getClass();
        C54129i iVar = FinderLiveService.f159398z;
        if (iVar != null && (hashMap = iVar.f151993h) != null && (str = hashMap.get(Long.valueOf(j))) != null) {
            FinderLiveStatusRefreshEvent finderLiveStatusRefreshEvent = new FinderLiveStatusRefreshEvent();
            FinderLiveStatusRefreshEvent.C55129a aVar = finderLiveStatusRefreshEvent.f154787d;
            aVar.f154788a = str;
            aVar.f154789b = Long.valueOf(j);
            finderLiveStatusRefreshEvent.f154787d.f154790c = i;
            String str2 = this.f168790j;
            Log.m105924i(str2, "notifyBizLiveRefreshEvent exportId:" + str + ", liveId:" + j + ", liveStatus:" + i);
            C61926c.m72693r(new C58995a(finderLiveStatusRefreshEvent));
        }
    }

    public void onLiveActivate() {
    }

    public void onLiveEnd() {
        super.onLiveEnd();
        mo84226m3(((C55001u) business(C55001u.class)).f154420q.f182392d, 2);
    }

    public void onLiveStart(C52005xq0 xq02) {
        C64273c21 c212;
        super.onLiveStart(xq02);
        if (xq02 != null && (c212 = xq02.f144846f) != null) {
            mo84226m3(c212.f182392d, c212.f182394f);
        }
    }
}
