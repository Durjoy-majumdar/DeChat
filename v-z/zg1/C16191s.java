package zg1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fh1.C59011e0;
import fj1.C45795b;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.LinkedList;
import o40.C61937h;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C48762au0;
import te3.C52013xs0;
import yg1.C16006g;

/* renamed from: zg1.s */
public final class C16191s extends C16006g {

    /* renamed from: c */
    public final String f43389c = "LiveHotCommentAnimationMsgInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16191s(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C59011e0 e0Var;
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        C8479f0 f0Var = new C8479f0();
        if (xs02 != null) {
            T t = null;
            if (!(xs02.f144906h != null)) {
                xs02 = null;
            }
            if (xs02 != null) {
                T au02 = new C48762au0();
                C89349b bVar = xs02.f144906h;
                byte[] f = bVar != null ? bVar.mo123703f() : null;
                if (f != null) {
                    try {
                        au02.parseFrom(f);
                        t = au02;
                    } catch (Exception e) {
                        Log.printDebugStack("safeParser", "", e);
                    }
                }
                f0Var.f27484d = t;
            }
        }
        C48762au0 au03 = (C48762au0) f0Var.f27484d;
        if (au03 != null) {
            Log.m105924i(this.f43389c, "receive hot comment animation msg:" + C61937h.m72709h(au03));
            FinderLiveService.f159376d.getClass();
            LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
            if (liveRoomControllerStore != null && (e0Var = (C59011e0) liveRoomControllerStore.controller(C59011e0.class)) != null) {
                e0Var.mo84234m3(au03);
            }
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20083};
    }
}
