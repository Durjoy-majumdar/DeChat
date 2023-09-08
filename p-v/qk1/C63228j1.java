package qk1;

import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: qk1.j1 */
public final class C63228j1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f179428d;

    /* renamed from: e */
    public final /* synthetic */ C63221i1 f179429e;

    public C63228j1(int i, C63221i1 i1Var) {
        this.f179428d = i;
        this.f179429e = i1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentInputAdapter$bindInputFastComment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.QUICK_REPLY, C90364q0.m113148g(new C13604l("button_type", "0"), new C13604l("quick_reply_index", String.valueOf(this.f179428d)), new C13604l("quick_reply_content", this.f179429e.f179401e.get(this.f179428d).f179410a)), (String) null, 4, (Object) null);
        C32224a<C13598b0> aVar = this.f179429e.f179402f;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentInputAdapter$bindInputFastComment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
