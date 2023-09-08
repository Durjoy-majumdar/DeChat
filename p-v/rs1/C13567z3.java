package rs1;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.z3 */
public final class C13567z3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f38486d;

    /* renamed from: e */
    public final /* synthetic */ C13539y3 f38487e;

    public C13567z3(C60905o oVar, C13539y3 y3Var) {
        this.f38486d = oVar;
        this.f38487e = y3Var;
    }

    public final void run() {
        RecyclerView C = this.f38486d.mo85811C();
        int i = this.f38487e.f38400p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(C, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout$addPreview$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        C.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(C, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout$addPreview$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
