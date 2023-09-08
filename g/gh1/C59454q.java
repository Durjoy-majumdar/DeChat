package gh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gh1.q */
public final class C59454q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f169886d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59454q(LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f169886d = liveRoomControllerStore;
    }

    public Object invoke() {
        C59461x xVar;
        for (LiveRoomController liveRoomController : this.f169886d.getControllers()) {
            C8313a aVar = liveRoomController instanceof C8313a ? (C8313a) liveRoomController : null;
            if (!(aVar == null || (xVar = aVar.f27265i) == null)) {
                xVar.mo9173c(true);
                for (C59453p b : xVar.mo9171a()) {
                    b.mo84559b(8);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
