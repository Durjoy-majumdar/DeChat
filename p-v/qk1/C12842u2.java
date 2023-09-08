package qk1;

import android.view.View;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C64373fs0;

/* renamed from: qk1.u2 */
public final class C12842u2 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12835r2 f36754d;

    public C12842u2(C12835r2 r2Var) {
        this.f36754d = r2Var;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getTag() instanceof C64373fs0) {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAliasInfo");
            C64373fs0 fs02 = (C64373fs0) tag;
            C32227p<? super C64373fs0, ? super View, C13598b0> pVar = this.f36754d.f36734e;
            if (pVar != null) {
                pVar.invoke(fs02, view);
            }
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
