package gh1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: gh1.m */
public final class C59452m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bundle f169880d;

    /* renamed from: e */
    public final /* synthetic */ LiveRoomControllerStore f169881e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59452m(Bundle bundle, LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f169880d = bundle;
        this.f169881e = liveRoomControllerStore;
    }

    public Object invoke() {
        Bundle bundle = this.f169880d;
        int i = 0;
        int i2 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        Bundle bundle2 = this.f169880d;
        if (bundle2 != null) {
            i = bundle2.getInt("EVT_PARAM2");
        }
        HashSet<LiveRoomController> controllers = this.f169881e.getControllers();
        ArrayList arrayList = new ArrayList();
        for (T next : controllers) {
            if (((LiveRoomController) next) instanceof C59439b) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveRoomController liveRoomController = (LiveRoomController) it.next();
            C59439b bVar = liveRoomController instanceof C59439b ? (C59439b) liveRoomController : null;
            if (bVar != null) {
                bVar.mo9730m2(i2, i);
            }
        }
        return C13598b0.f38549a;
    }
}
