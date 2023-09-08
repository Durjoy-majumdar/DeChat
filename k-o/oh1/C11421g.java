package oh1;

import android.content.Context;
import cj1.C0572m5;
import cl1.C54979h1;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gh1.C8313a;
import gy3.C87412m;
import o40.C61926c;
import pe3.C89349b;
import te3.C50303ls0;
import te3.C50533nf0;
import te3.C50713op1;
import te3.C51174ry0;
import te3.C52005xq0;

/* renamed from: oh1.g */
public final class C11421g extends C8313a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11421g(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    public void onLiveActivate() {
    }

    public void onLiveStart(C52005xq0 xq02) {
        C50713op1 op12;
        C50303ls0 ls02;
        C50713op1 op13;
        C51174ry0 ry02;
        C11415c cVar;
        Class cls = C11415c.class;
        Class cls2 = C54979h1.class;
        C50533nf0 nf02 = null;
        if (!(xq02 == null || (op13 = xq02.f144851h1) == null || (ry02 = op13.f139306d) == null)) {
            C0572m5 m5Var = new C0572m5(ry02);
            ((C54979h1) business(cls2)).mo75946m3(m5Var);
            Log.m105924i("FlashSaleDataController", "join live set flash sale info, cancel = " + m5Var.f1374c);
            if (m5Var.f1374c != 0) {
                C11415c cVar2 = (C11415c) controller(cls);
                if (cVar2 != null) {
                    C61926c.m72668M(new C11414b(cVar2));
                }
            } else {
                FinderLiveService.f159376d.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                if (!(bVar == null || (cVar = (C11415c) bVar.getController(cls)) == null)) {
                    cVar.mo11424m3();
                }
                Context c3 = mo9306c3();
                if (c3 == null) {
                    c3 = MMApplicationContext.getContext();
                    C87412m.m108593f(c3, "getContext()");
                }
                C3206b2 b2Var = this.f27261e;
                C47378k.m52727a(m5Var, c3, b2Var instanceof C56032b ? (C56032b) b2Var : null);
            }
        }
        if (xq02 != null && (op12 = xq02.f144851h1) != null && (ls02 = op12.f139307e) != null) {
            Log.m105924i("FlashSaleDataController", "join live set flash sale config");
            C50533nf0 nf03 = new C50533nf0();
            C89349b bVar2 = ls02.f137622d;
            byte[] f = bVar2 != null ? bVar2.mo123703f() : null;
            if (f != null) {
                try {
                    nf03.parseFrom(f);
                    nf02 = nf03;
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            ((C54979h1) business(cls2)).mo75945l3(nf02);
        }
    }
}
