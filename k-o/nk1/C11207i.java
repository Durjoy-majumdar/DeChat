package nk1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.xweb.IXWebBroadcastListener;
import d60.C58124b;
import fy3.C32227p;
import gh1.C8313a;
import gy3.C87412m;
import qj1.C62660c;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: nk1.i */
public final class C11207i {
    /* renamed from: a */
    public static C53973z1 m11065a(C62660c cVar, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        C58124b bVar = cVar.f177936g;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return C53895h.m60465c(((C56032b) bVar).getActivityScope(), fVar, p0Var, pVar);
    }

    /* renamed from: b */
    public static C53973z1 m11066b(LiveRoomController liveRoomController, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        C87412m.m108594g(liveRoomController, "<this>");
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        return C53895h.m60465c(liveRoomController.getStore().getLiveRoomData().f123702i, fVar, p0Var, pVar);
    }

    /* renamed from: c */
    public static C53973z1 m11067c(C62660c cVar, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        C58124b bVar = cVar.f177936g;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return C53895h.m60465c(((C56032b) bVar).getBuContext().f123702i, fVar, p0Var, pVar);
    }

    /* renamed from: d */
    public static final C53973z1 m11068d(C56032b bVar, C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(bVar, "<this>");
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        return C53895h.m60465c(bVar.getViewScope(), fVar, p0Var, pVar);
    }

    /* renamed from: e */
    public static final C53973z1 m11069e(C8313a aVar, C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(aVar, "<this>");
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        C3206b2 b2Var = aVar.f27261e;
        C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
        if (bVar != null) {
            return m11068d(bVar, fVar, p0Var, pVar);
        }
        return null;
    }

    /* renamed from: f */
    public static /* synthetic */ C53973z1 m11070f(C56032b bVar, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        return m11068d(bVar, fVar, p0Var, pVar);
    }

    /* renamed from: g */
    public static /* synthetic */ C53973z1 m11071g(C8313a aVar, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        return m11069e(aVar, fVar, p0Var, pVar);
    }

    /* renamed from: h */
    public static C53973z1 m11072h(C62660c cVar, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        C58124b bVar = cVar.f177936g;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return m11068d((C56032b) bVar, fVar, p0Var, pVar);
    }
}
