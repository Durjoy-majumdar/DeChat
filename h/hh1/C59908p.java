package hh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: hh1.p */
public final class C59908p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f170995d;

    /* renamed from: e */
    public final /* synthetic */ int f170996e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59908p(LiveRoomControllerStore liveRoomControllerStore, int i) {
        super(0);
        this.f170995d = liveRoomControllerStore;
        this.f170996e = i;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f170995d.getControllers();
        ArrayList arrayList = new ArrayList();
        for (T next : controllers) {
            if (((LiveRoomController) next) instanceof C59905m) {
                arrayList.add(next);
            }
        }
        int i = this.f170996e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveRoomController liveRoomController = (LiveRoomController) it.next();
            C59905m mVar = liveRoomController instanceof C59905m ? (C59905m) liveRoomController : null;
            if (mVar != null) {
                mVar.mo9316r(i);
            }
        }
        return C13598b0.f38549a;
    }
}
