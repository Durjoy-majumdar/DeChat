package gh1;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: gh1.o */
public final class C8323o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f27276d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f27277e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8323o(LiveRoomControllerStore liveRoomControllerStore, ViewGroup viewGroup) {
        super(0);
        this.f27276d = liveRoomControllerStore;
        this.f27277e = viewGroup;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f27276d.getControllers();
        ViewGroup viewGroup = this.f27277e;
        for (LiveRoomController liveRoomController : controllers) {
            liveRoomController.onViewUnmount(viewGroup);
            C8313a aVar = liveRoomController instanceof C8313a ? (C8313a) liveRoomController : null;
            if (aVar != null) {
                aVar.f27261e = null;
            }
        }
        return C13598b0.f38549a;
    }
}
