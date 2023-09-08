package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2492u0;
import gy3.C8480h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.q9 */
public final class C13381q9 extends C2492u0 {

    /* renamed from: e */
    public final /* synthetic */ C13146c9 f37904e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13381q9(C13146c9 c9Var) {
        super(false, 1, (C8480h) null);
        this.f37904e = c9Var;
    }

    /* renamed from: a */
    public void mo2472a(C2479n0.C2480a aVar) {
        View view;
        if (aVar != null && (view = this.f37904e.f37425u) != null) {
            int i = aVar.f12908a ? 0 : 8;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$7", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$7", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
