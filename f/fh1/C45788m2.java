package fh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import gh1.C8313a;
import gy3.C87412m;
import te3.C51213s91;
import te3.C51852wm1;

/* renamed from: fh1.m2 */
public final class C45788m2 extends C8313a {

    /* renamed from: j */
    public final String f123686j = "LiveRedDotController";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45788m2(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    public void onLiveActivate() {
        C51852wm1 wm12 = new C51852wm1();
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75799e(19, wm12, new C45786l2(this, C51213s91.class), false);
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75800f(19);
    }
}
