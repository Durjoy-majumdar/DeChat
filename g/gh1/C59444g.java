package gh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: gh1.g */
public final class C59444g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f169864d;

    /* renamed from: e */
    public final /* synthetic */ int f169865e;

    /* renamed from: f */
    public final /* synthetic */ String[] f169866f;

    /* renamed from: g */
    public final /* synthetic */ int[] f169867g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59444g(LiveRoomControllerStore liveRoomControllerStore, int i, String[] strArr, int[] iArr) {
        super(0);
        this.f169864d = liveRoomControllerStore;
        this.f169865e = i;
        this.f169866f = strArr;
        this.f169867g = iArr;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f169864d.getControllers();
        int i = this.f169865e;
        String[] strArr = this.f169866f;
        int[] iArr = this.f169867g;
        for (LiveRoomController liveRoomController : controllers) {
            C59440c cVar = liveRoomController instanceof C59440c ? (C59440c) liveRoomController : null;
            if (cVar != null) {
                cVar.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
        return C13598b0.f38549a;
    }
}
