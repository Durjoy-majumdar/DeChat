package tl1;

import android.view.View;
import android.widget.TextView;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: tl1.i0 */
public final class C13983i0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13985j0 f39269d;

    /* renamed from: e */
    public final /* synthetic */ int f39270e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13983i0(C13985j0 j0Var, int i) {
        super(0);
        this.f39269d = j0Var;
        this.f39270e = i;
    }

    public Object invoke() {
        View view = this.f39269d.f39282j;
        if (view != null) {
            int i = this.f39270e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardWinnerListWidget$setFooterTvVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardWinnerListWidget$setFooterTvVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = this.f39269d.f39283k;
        if (textView != null) {
            textView.setVisibility(this.f39270e);
        }
        return C13598b0.f38549a;
    }
}
