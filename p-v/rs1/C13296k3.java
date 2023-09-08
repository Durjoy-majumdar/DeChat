package rs1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderWordingLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: rs1.k3 */
public final class C13296k3 extends C87413o implements C32227p<FinderWordingLayout.C3984a, FinderWordingLayout.C3984a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f37734d;

    /* renamed from: e */
    public final /* synthetic */ C13181d3 f37735e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13296k3(C60905o oVar, C13181d3 d3Var) {
        super(2);
        this.f37734d = oVar;
        this.f37735e = d3Var;
    }

    public Object invoke(Object obj, Object obj2) {
        FinderWordingLayout.C3984a aVar = (FinderWordingLayout.C3984a) obj;
        FinderWordingLayout.C3984a aVar2 = (FinderWordingLayout.C3984a) obj2;
        C87412m.m108594g(aVar, "from");
        C87412m.m108594g(aVar2, "to");
        View D = this.f37734d.mo85812D(C0966R.C0970id.edb);
        FinderWordingLayout.C3984a aVar3 = FinderWordingLayout.C3984a.MANAGE;
        if (aVar2 == aVar3) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar4.mo10233c(Float.valueOf(1.0f));
            View view = D;
            C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC$onBindView$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$Mode;Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$Mode;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            D.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC$onBindView$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$Mode;Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$Mode;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            D.animate().alpha(0.0f).setDuration(300).setListener(new C13283j3(D)).start();
            C13181d3 d3Var = this.f37735e;
            C60905o oVar = this.f37734d;
            d3Var.getClass();
            C87412m.m108594g(oVar, "holder");
            FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) ((C36570n) d3Var.f37765e).getValue();
            if (finderDescPanelUIC != null) {
                finderDescPanelUIC.f18628o.removeCallbacksAndMessages((Object) null);
                finderDescPanelUIC.f18622f = false;
            }
        } else {
            String str = "holder";
            if (aVar == aVar3) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar5.mo10233c(Float.valueOf(0.0f));
                View view2 = D;
                C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC$onBindView$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$Mode;Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$Mode;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                D.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC$onBindView$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$Mode;Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$Mode;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                D.setScaleX(1.0f);
                D.setScaleY(1.0f);
                D.animate().alpha(1.0f).setDuration(300).setListener((Animator.AnimatorListener) null).start();
                C13181d3 d3Var2 = this.f37735e;
                C60905o oVar2 = this.f37734d;
                d3Var2.getClass();
                C87412m.m108594g(oVar2, str);
                FinderDescPanelUIC finderDescPanelUIC2 = (FinderDescPanelUIC) ((C36570n) d3Var2.f37765e).getValue();
                if (finderDescPanelUIC2 != null) {
                    finderDescPanelUIC2.f18622f = true;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
