package gh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: gh1.d */
public final class C59441d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f169855d;

    /* renamed from: e */
    public final /* synthetic */ boolean f169856e;

    /* renamed from: f */
    public final /* synthetic */ int f169857f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59441d(LiveRoomControllerStore liveRoomControllerStore, boolean z, int i) {
        super(0);
        this.f169855d = liveRoomControllerStore;
        this.f169856e = z;
        this.f169857f = i;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f169855d.getControllers();
        boolean z = this.f169856e;
        int i = this.f169857f;
        for (LiveRoomController liveRoomController : controllers) {
            C59440c cVar = liveRoomController instanceof C59440c ? (C59440c) liveRoomController : null;
            if (cVar != null) {
                cVar.mo9131x0(z, i);
            }
        }
        return C13598b0.f38549a;
    }
}
