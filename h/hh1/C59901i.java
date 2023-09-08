package hh1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: hh1.i */
public final class C59901i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f170984d;

    /* renamed from: e */
    public final /* synthetic */ int f170985e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f170986f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59901i(LiveRoomControllerStore liveRoomControllerStore, int i, Bundle bundle) {
        super(0);
        this.f170984d = liveRoomControllerStore;
        this.f170985e = i;
        this.f170986f = bundle;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f170984d.getControllers();
        ArrayList arrayList = new ArrayList();
        for (T next : controllers) {
            if (((LiveRoomController) next) instanceof C59898g) {
                arrayList.add(next);
            }
        }
        int i = this.f170985e;
        Bundle bundle = this.f170986f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveRoomController liveRoomController = (LiveRoomController) it.next();
            C59898g gVar = liveRoomController instanceof C59898g ? (C59898g) liveRoomController : null;
            if (gVar != null) {
                gVar.mo9166Y2(i, bundle);
            }
        }
        return C13598b0.f38549a;
    }
}
