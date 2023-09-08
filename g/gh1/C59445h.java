package gh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gh1.h */
public final class C59445h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f169868d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59445h(LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f169868d = liveRoomControllerStore;
    }

    public Object invoke() {
        for (LiveRoomController liveRoomController : this.f169868d.getControllers()) {
            C59440c cVar = liveRoomController instanceof C59440c ? (C59440c) liveRoomController : null;
            if (cVar != null) {
                cVar.resume();
            }
        }
        return C13598b0.f38549a;
    }
}
