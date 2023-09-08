package qk1;

import android.view.View;
import fy3.C32226l;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C64693s21;

/* renamed from: qk1.m0 */
public final class C63237m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63226j0 f179449d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C64693s21> f179450e;

    public C63237m0(C63226j0 j0Var, C8479f0<C64693s21> f0Var) {
        this.f179449d = j0Var;
        this.f179450e = f0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentManagerAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super String, C13598b0> lVar = this.f179449d.f179422d;
        if (lVar != null) {
            lVar.invoke(((C64693s21) this.f179450e.f27484d).f185309d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentManagerAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
