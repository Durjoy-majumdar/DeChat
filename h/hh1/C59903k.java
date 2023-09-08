package hh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: hh1.k */
public final class C59903k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f170987d;

    /* renamed from: e */
    public final /* synthetic */ boolean f170988e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59903k(LiveRoomControllerStore liveRoomControllerStore, boolean z) {
        super(0);
        this.f170987d = liveRoomControllerStore;
        this.f170988e = z;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f170987d.getControllers();
        ArrayList arrayList = new ArrayList();
        for (T next : controllers) {
            if (((LiveRoomController) next) instanceof C59902j) {
                arrayList.add(next);
            }
        }
        boolean z = this.f170988e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveRoomController liveRoomController = (LiveRoomController) it.next();
            C59902j jVar = liveRoomController instanceof C59902j ? (C59902j) liveRoomController : null;
            if (jVar != null) {
                jVar.mo84277Q(z);
            }
        }
        return C13598b0.f38549a;
    }
}
