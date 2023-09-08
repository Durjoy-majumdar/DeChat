package gh1;

import android.content.Intent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: gh1.f */
public final class C59443f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f169862d;

    /* renamed from: e */
    public final /* synthetic */ Intent f169863e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59443f(LiveRoomControllerStore liveRoomControllerStore, Intent intent) {
        super(0);
        this.f169862d = liveRoomControllerStore;
        this.f169863e = intent;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f169862d.getControllers();
        Intent intent = this.f169863e;
        for (LiveRoomController liveRoomController : controllers) {
            C59440c cVar = liveRoomController instanceof C59440c ? (C59440c) liveRoomController : null;
            if (cVar != null) {
                cVar.onNewIntent(intent);
            }
        }
        return C13598b0.f38549a;
    }
}
