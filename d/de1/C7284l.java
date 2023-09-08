package de1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: de1.l */
public final class C7284l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.LayoutManager f25378d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f25379e;

    /* renamed from: f */
    public final /* synthetic */ int f25380f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7284l(RecyclerView.LayoutManager layoutManager, C8478d0 d0Var, int i) {
        super(0);
        this.f25378d = layoutManager;
        this.f25379e = d0Var;
        this.f25380f = i;
    }

    public Object invoke() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f25378d;
        int i = this.f25379e.f27483d;
        int i2 = this.f25380f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$genExitCallback$exitCallback$1$3", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$genExitCallback$exitCallback$1$3", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        return C13598b0.f38549a;
    }
}
