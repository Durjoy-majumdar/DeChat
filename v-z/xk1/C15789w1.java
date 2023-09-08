package xk1;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: xk1.w1 */
public final class C15789w1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15794y1 f42550d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15789w1(C15794y1 y1Var) {
        super(0);
        this.f42550d = y1Var;
    }

    public Object invoke() {
        View view = this.f42550d.f42557e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostEditDescUIC$initOuterDescEt$showEdit$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostEditDescUIC$initOuterDescEt$showEdit$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
