package zg1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import ok1.C62042e;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C50590nt0;
import te3.C52013xs0;
import yg1.C16006g;

/* renamed from: zg1.b */
public final class C16166b extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16166b(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C87412m.m108594g(linkedList, "msgList");
        if (C62042e.f176370a.mo87027N0()) {
            C52013xs0 xs02 = (C52013xs0) C110818d0.m150916N(linkedList);
            C50590nt0 nt02 = new C50590nt0();
            if (xs02 != null) {
                if (!(xs02.f144906h != null)) {
                    xs02 = null;
                }
                if (xs02 != null) {
                    C89349b bVar = xs02.f144906h;
                    nt02.parseFrom(bVar != null ? bVar.mo123703f() : null);
                }
            }
            if (nt02.f138759d == 2) {
                FinderLiveService.f159376d.getClass();
                C56032b bVar2 = FinderLiveService.f159379g;
                if (bVar2 != null) {
                    C58124b.C7172a.m7372a(bVar2, C58124b.C58125b.FINDER_LIVE_ANCHOR_CAN_APPLAUD, (Bundle) null, 2, (Object) null);
                }
            }
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20045};
    }
}
