package fh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import gh1.C8313a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import qr3.C110470e;
import te3.C48928bz0;
import te3.C51362t91;
import te3.C51512u91;
import xh1.C15685d;

/* renamed from: fh1.c0 */
public final class C8033c0 extends C8313a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8033c0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    public void onLiveActivate() {
        C51362t91 t912 = new C51362t91();
        LinkedList<C48928bz0> linkedList = new LinkedList<>();
        C15685d dVar = C15685d.f42379a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C15685d.f42381c);
        linkedList.addAll(arrayList);
        t912.f142052d = linkedList;
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        t912.f142053e = (long) C110470e.f330363a;
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75799e(18, t912, new C8031b0(C51512u91.class), false);
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75800f(18);
    }
}
