package hh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: hh1.b */
public final class C59895b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f170977d;

    /* renamed from: e */
    public final /* synthetic */ boolean f170978e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59895b(LiveRoomControllerStore liveRoomControllerStore, boolean z) {
        super(0);
        this.f170977d = liveRoomControllerStore;
        this.f170978e = z;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f170977d.getControllers();
        ArrayList arrayList = new ArrayList();
        for (T next : controllers) {
            if (((LiveRoomController) next) instanceof C59894a) {
                arrayList.add(next);
            }
        }
        boolean z = this.f170978e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveRoomController liveRoomController = (LiveRoomController) it.next();
            C59894a aVar = liveRoomController instanceof C59894a ? (C59894a) liveRoomController : null;
            if (aVar != null) {
                aVar.mo9729g2(z);
            }
        }
        return C13598b0.f38549a;
    }
}
