package de1;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: de1.j */
public final class C7282j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.LayoutManager f25372d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f25373e;

    /* renamed from: f */
    public final /* synthetic */ int f25374f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7282j(RecyclerView.LayoutManager layoutManager, C8478d0 d0Var, int i) {
        super(0);
        this.f25372d = layoutManager;
        this.f25373e = d0Var;
        this.f25374f = i;
    }

    public Object invoke() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f25372d;
        int i = this.f25373e.f27483d;
        int i2 = this.f25374f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(gridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$genExitCallback$exitCallback$1$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        gridLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(gridLayoutManager, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$genExitCallback$exitCallback$1$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        return C13598b0.f38549a;
    }
}
