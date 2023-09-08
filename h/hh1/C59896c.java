package hh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gi1.C8324b;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: hh1.c */
public final class C59896c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f170979d;

    /* renamed from: e */
    public final /* synthetic */ C8324b f170980e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59896c(LiveRoomControllerStore liveRoomControllerStore, C8324b bVar) {
        super(0);
        this.f170979d = liveRoomControllerStore;
        this.f170980e = bVar;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f170979d.getControllers();
        ArrayList arrayList = new ArrayList();
        for (T next : controllers) {
            if (((LiveRoomController) next) instanceof C59894a) {
                arrayList.add(next);
            }
        }
        C8324b bVar = this.f170980e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveRoomController liveRoomController = (LiveRoomController) it.next();
            C59894a aVar = liveRoomController instanceof C59894a ? (C59894a) liveRoomController : null;
            if (aVar != null) {
                aVar.mo9728J1(bVar);
            }
        }
        return C13598b0.f38549a;
    }
}
