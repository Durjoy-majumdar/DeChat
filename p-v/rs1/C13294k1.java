package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: rs1.k1 */
public final class C13294k1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f37730d;

    /* renamed from: e */
    public final /* synthetic */ FinderDescPanelUIC f37731e;

    /* renamed from: f */
    public final /* synthetic */ boolean f37732f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13294k1(C60905o oVar, FinderDescPanelUIC finderDescPanelUIC, boolean z) {
        super(0);
        this.f37730d = oVar;
        this.f37731e = finderDescPanelUIC;
        this.f37732f = z;
    }

    public Object invoke() {
        Object obj = this.f37730d.f173503E;
        View view = null;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            FinderDescPanelUIC finderDescPanelUIC = this.f37731e;
            boolean z = finderDescPanelUIC.f18636w;
            boolean z2 = this.f37732f;
            if (z != z2) {
                finderDescPanelUIC.f18636w = z2;
            }
            if (finderDescPanelUIC.f18636w) {
                ((ArrayList) finderDescPanelUIC.f18638y).clear();
                ((LinkedHashMap) finderDescPanelUIC.f18639z).clear();
                C13180d2 d2Var = (C13180d2) ((C36570n) finderDescPanelUIC.f18631r).getValue();
                if (d2Var != null) {
                    d2Var.f37764d = 0;
                    ((ArrayList) finderDescPanelUIC.f18638y).add(0);
                    C13308kb put = finderDescPanelUIC.f18639z.put(0, d2Var);
                }
                C13181d3 d3Var = (C13181d3) ((C36570n) finderDescPanelUIC.f18632s).getValue();
                if (d3Var != null) {
                    d3Var.f37764d = 1;
                    ((ArrayList) finderDescPanelUIC.f18638y).add(1);
                    C13308kb put2 = finderDescPanelUIC.f18639z.put(1, d3Var);
                }
                C13470u2 u2Var = (C13470u2) ((C36570n) finderDescPanelUIC.f18633t).getValue();
                if (u2Var != null) {
                    u2Var.f37764d = 2;
                    ((ArrayList) finderDescPanelUIC.f18638y).add(2);
                    C13308kb put3 = finderDescPanelUIC.f18639z.put(2, u2Var);
                }
                C13282j2 j2Var = (C13282j2) ((C36570n) this.f37731e.f18634u).getValue();
                if (j2Var != null) {
                    view = j2Var.mo12677c3(this.f37730d);
                }
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescPanelUIC$onBindView$bindCall$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescPanelUIC$onBindView$bindCall$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                finderDescPanelUIC.mo5117d3();
            }
            int i = ((LinkedHashMap) FinderDescPanelUIC.f18610J).get(Long.valueOf(baseFinderFeed.getItemId()));
            if (i == null) {
                i = 0;
            }
            int intValue = ((Number) i).intValue();
            C13308kb kbVar = (C13308kb) ((LinkedHashMap) this.f37731e.f18639z).get(Integer.valueOf(intValue));
            FinderDescPanelUIC finderDescPanelUIC2 = this.f37731e;
            List<Integer> list = finderDescPanelUIC2.f18638y;
            C60905o oVar = this.f37730d;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C13308kb kbVar2 = (C13308kb) ((LinkedHashMap) finderDescPanelUIC2.f18639z).get(Integer.valueOf(((Number) it.next()).intValue()));
                if (kbVar2 != null) {
                    if (kbVar != null) {
                        C87412m.m108594g(oVar, "holder");
                        View c3 = kbVar2.mo12677c3(oVar);
                        if (c3 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view3 = c3;
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "hideWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            c3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "hideWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
            }
            C13308kb kbVar3 = (C13308kb) ((LinkedHashMap) this.f37731e.f18639z).get(Integer.valueOf(intValue));
            if (kbVar3 != null) {
                C60905o oVar2 = this.f37730d;
                C87412m.m108594g(oVar2, "holder");
                View c35 = kbVar3.mo12677c3(oVar2);
                if (c35 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view4 = c35;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "showWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c35.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "showWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        return C13598b0.f38549a;
    }
}
