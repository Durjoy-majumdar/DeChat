package gh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;
import te3.C48742ao0;

/* renamed from: gh1.k */
public final class C8320k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f27271d;

    /* renamed from: e */
    public final /* synthetic */ C48742ao0 f27272e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8320k(LiveRoomControllerStore liveRoomControllerStore, C48742ao0 ao02) {
        super(0);
        this.f27271d = liveRoomControllerStore;
        this.f27272e = ao02;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f27271d.getControllers();
        C48742ao0 ao02 = this.f27272e;
        for (LiveRoomController onLiveMsg : controllers) {
            onLiveMsg.onLiveMsg(ao02);
        }
        return C13598b0.f38549a;
    }
}
