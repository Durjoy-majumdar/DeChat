package hh1;

import cl1.C55006x0;
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

/* renamed from: hh1.f */
public final class C8530f {

    /* renamed from: hh1.f$a */
    public static final class C8531a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f27580d;

        /* renamed from: e */
        public final /* synthetic */ C55006x0.C0697b f27581e;

        /* renamed from: f */
        public final /* synthetic */ boolean f27582f;

        /* renamed from: g */
        public final /* synthetic */ boolean f27583g;

        /* renamed from: h */
        public final /* synthetic */ boolean f27584h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8531a(LiveRoomControllerStore liveRoomControllerStore, C55006x0.C0697b bVar, boolean z, boolean z2, boolean z3) {
            super(0);
            this.f27580d = liveRoomControllerStore;
            this.f27581e = bVar;
            this.f27582f = z;
            this.f27583g = z2;
            this.f27584h = z3;
        }

        public Object invoke() {
            HashSet<LiveRoomController> controllers = this.f27580d.getControllers();
            ArrayList arrayList = new ArrayList();
            for (T next : controllers) {
                if (((LiveRoomController) next) instanceof C8529e) {
                    arrayList.add(next);
                }
            }
            C55006x0.C0697b bVar = this.f27581e;
            boolean z = this.f27582f;
            boolean z2 = this.f27583g;
            boolean z3 = this.f27584h;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LiveRoomController liveRoomController = (LiveRoomController) it.next();
                C8529e eVar = liveRoomController instanceof C8529e ? (C8529e) liveRoomController : null;
                if (eVar != null) {
                    eVar.mo9129p2(bVar, z, z2, z3);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m8426a(LiveRoomControllerStore liveRoomControllerStore, C55006x0.C0697b bVar, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C87412m.m108594g(bVar, "data");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C8531a(liveRoomControllerStore, bVar, z, z2, z3));
    }
}
