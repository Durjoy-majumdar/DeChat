package hh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gh1.C59447j;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: hh1.h */
public final class C59899h {

    /* renamed from: hh1.h$a */
    public static final class C59900a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f170983d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59900a(LiveRoomControllerStore liveRoomControllerStore) {
            super(0);
            this.f170983d = liveRoomControllerStore;
        }

        public Object invoke() {
            HashSet<LiveRoomController> controllers = this.f170983d.getControllers();
            ArrayList arrayList = new ArrayList();
            for (T next : controllers) {
                if (((LiveRoomController) next) instanceof C59898g) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LiveRoomController liveRoomController = (LiveRoomController) it.next();
                C59898g gVar = liveRoomController instanceof C59898g ? (C59898g) liveRoomController : null;
                if (gVar != null) {
                    gVar.mo9164F();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m69793a(LiveRoomControllerStore liveRoomControllerStore) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59900a(liveRoomControllerStore));
    }
}
