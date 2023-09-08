package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: vf1.a5 */
public final class C14725a5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderSharePostUI f40691d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14725a5(FinderSharePostUI finderSharePostUI) {
        super(0);
        this.f40691d = finderSharePostUI;
    }

    public Object invoke() {
        C89779i0 i0Var = this.f40691d.f159032p;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        View view = this.f40691d.f159035s;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI$showTipsDialog$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI$showTipsDialog$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
