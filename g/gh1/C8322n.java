package gh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gh1.n */
public final class C8322n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f27275d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8322n(LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f27275d = liveRoomControllerStore;
    }

    public Object invoke() {
        for (LiveRoomController onLiveStartFromWindow : this.f27275d.getControllers()) {
            onLiveStartFromWindow.onLiveStartFromWindow();
        }
        return C13598b0.f38549a;
    }
}
