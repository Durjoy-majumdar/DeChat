package gh1;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: gh1.l */
public final class C8321l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f27273d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f27274e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8321l(LiveRoomControllerStore liveRoomControllerStore, ViewGroup viewGroup) {
        super(0);
        this.f27273d = liveRoomControllerStore;
        this.f27274e = viewGroup;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f27273d.getControllers();
        ViewGroup viewGroup = this.f27274e;
        for (LiveRoomController liveRoomController : controllers) {
            if (viewGroup instanceof C3206b2) {
                C8313a aVar = liveRoomController instanceof C8313a ? (C8313a) liveRoomController : null;
                if (aVar != null) {
                    aVar.f27261e = (C3206b2) viewGroup;
                }
            }
            liveRoomController.onViewMount(viewGroup);
        }
        HashSet<LiveRoomController> controllers2 = this.f27273d.getControllers();
        ViewGroup viewGroup2 = this.f27274e;
        for (LiveRoomController afterViewMount : controllers2) {
            afterViewMount.afterViewMount(viewGroup2);
        }
        return C13598b0.f38549a;
    }
}
