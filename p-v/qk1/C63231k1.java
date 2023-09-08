package qk1;

import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: qk1.k1 */
public final class C63231k1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f179437d;

    /* renamed from: e */
    public final /* synthetic */ C63221i1 f179438e;

    public C63231k1(int i, C63221i1 i1Var) {
        this.f179437d = i;
        this.f179438e = i1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentInputAdapter$bindInputFastComment$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.QUICK_REPLY, C90364q0.m113148g(new C13604l("button_type", "1"), new C13604l("quick_reply_index", String.valueOf(this.f179437d)), new C13604l("quick_reply_content", this.f179438e.f179401e.get(this.f179437d).f179410a)), (String) null, 4, (Object) null);
        C32226l<? super Integer, C13598b0> lVar = this.f179438e.f179403g;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(this.f179437d));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentInputAdapter$bindInputFastComment$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
