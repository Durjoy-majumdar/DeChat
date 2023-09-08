package gh1;

import android.os.Build;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: gh1.v */
public final class C59459v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f169892d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59459v(LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f169892d = liveRoomControllerStore;
    }

    public Object invoke() {
        C59461x xVar;
        List<C59453p> b;
        for (LiveRoomController liveRoomController : this.f169892d.getControllers()) {
            C8313a aVar = liveRoomController instanceof C8313a ? (C8313a) liveRoomController : null;
            if (!(aVar == null || (xVar = aVar.f27265i) == null || (b = xVar.mo9172b()) == null)) {
                for (C59453p pVar : b) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        pVar.f169882a.forceHasOverlappingRendering(false);
                    }
                    pVar.mo84558a();
                }
            }
        }
        return C13598b0.f38549a;
    }
}
