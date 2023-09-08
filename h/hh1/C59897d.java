package hh1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: hh1.d */
public final class C59897d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f170981d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f170982e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59897d(LiveRoomControllerStore liveRoomControllerStore, JSONObject jSONObject) {
        super(0);
        this.f170981d = liveRoomControllerStore;
        this.f170982e = jSONObject;
    }

    public Object invoke() {
        HashSet<LiveRoomController> controllers = this.f170981d.getControllers();
        ArrayList arrayList = new ArrayList();
        for (T next : controllers) {
            if (((LiveRoomController) next) instanceof C59894a) {
                arrayList.add(next);
            }
        }
        JSONObject jSONObject = this.f170982e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveRoomController liveRoomController = (LiveRoomController) it.next();
            C59894a aVar = liveRoomController instanceof C59894a ? (C59894a) liveRoomController : null;
            if (aVar != null) {
                aVar.mo9732v0(jSONObject);
            }
        }
        return C13598b0.f38549a;
    }
}
