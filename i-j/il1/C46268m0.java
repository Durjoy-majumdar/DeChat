package il1;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: il1.m0 */
public final class C46268m0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46265l0 f124721d;

    /* renamed from: e */
    public final /* synthetic */ int f124722e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46268m0(C46265l0 l0Var, int i) {
        super(0);
        this.f124721d = l0Var;
        this.f124722e = i;
    }

    public Object invoke() {
        C46265l0 l0Var = this.f124721d;
        l0Var.f124717f = false;
        View view = l0Var.f124716e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicRvWidget$checkLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicRvWidget$checkLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f124721d.f124714c.invoke(Integer.valueOf(this.f124722e));
        return C13598b0.f38549a;
    }
}
