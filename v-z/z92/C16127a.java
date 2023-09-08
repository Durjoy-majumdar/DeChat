package z92;

import android.view.View;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p92.C117997g;
import rx3.C13598b0;

/* renamed from: z92.a */
public final class C16127a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C117997g> f43313d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16127a(C8479f0<C117997g> f0Var) {
        super(0);
        this.f43313d = f0Var;
    }

    public Object invoke() {
        C117997g gVar = (C117997g) this.f43313d.f27484d;
        View rootView = gVar != null ? gVar.getRootView() : null;
        if (rootView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(rootView, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel$hideUIComponent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rootView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(rootView, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel$hideUIComponent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
