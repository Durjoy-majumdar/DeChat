package bl3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import androidx.lifecycle.C39622i0;
import com.tencent.xweb.IXWebBroadcastListener;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: bl3.e */
public class C0317e extends C39622i0 {
    private final C0000n0 lifecycleScope = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));
    private final C0000n0 mainScope = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C58901s.f168555a));

    public static /* synthetic */ C53973z1 launch$default(C0317e eVar, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fVar = C66217g.f190253d;
            }
            if ((i & 2) != 0) {
                p0Var = C53934p0.DEFAULT;
            }
            return eVar.launch(fVar, p0Var, pVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
    }

    public static /* synthetic */ C53973z1 launchUI$default(C0317e eVar, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fVar = C66217g.f190253d;
            }
            if ((i & 2) != 0) {
                p0Var = C53934p0.DEFAULT;
            }
            return eVar.launchUI(fVar, p0Var, pVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchUI");
    }

    public C0000n0 getLifecycleScope() {
        return this.lifecycleScope;
    }

    public C0000n0 getMainScope() {
        return this.mainScope;
    }

    public final C53973z1 launch(C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        return C53895h.m60465c(getLifecycleScope(), fVar, p0Var, pVar);
    }

    public final C53973z1 launchUI(C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        return C53895h.m60465c(getMainScope(), fVar, p0Var, pVar);
    }

    public void onCleared() {
        super.onCleared();
        C0000n0 lifecycleScope2 = getLifecycleScope();
        C53930o0.m60557d(lifecycleScope2, this + " onCleared.", (Throwable) null, 2, (Object) null);
        C0000n0 mainScope2 = getMainScope();
        C53930o0.m60557d(mainScope2, this + " onCleared.", (Throwable) null, 2, (Object) null);
    }
}
