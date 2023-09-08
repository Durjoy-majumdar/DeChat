package gh1;

import android.content.Intent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: gh1.e */
public final class C59442e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f169858d;

    /* renamed from: e */
    public final /* synthetic */ int f169859e;

    /* renamed from: f */
    public final /* synthetic */ int f169860f;

    /* renamed from: g */
    public final /* synthetic */ Intent f169861g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59442e(LiveRoomControllerStore liveRoomControllerStore, int i, int i2, Intent intent) {
        super(0);
        this.f169858d = liveRoomControllerStore;
        this.f169859e = i;
        this.f169860f = i2;
        this.f169861g = intent;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f169858d.getControllers();
        int i = this.f169859e;
        int i2 = this.f169860f;
        Intent intent = this.f169861g;
        for (LiveRoomController liveRoomController : controllers) {
            C59440c cVar = liveRoomController instanceof C59440c ? (C59440c) liveRoomController : null;
            if (cVar != null) {
                cVar.onActivityResult(i, i2, intent);
            }
        }
        return C13598b0.f38549a;
    }
}
