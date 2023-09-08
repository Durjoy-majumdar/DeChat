package qk1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: qk1.o0 */
public final class C63246o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63226j0 f179467d;

    public C63246o0(C63226j0 j0Var) {
        this.f179467d = j0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentManagerAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f179467d.f179424f;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentManagerAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
