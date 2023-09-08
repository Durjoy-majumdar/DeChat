package qk1;

import android.view.View;
import cj1.C54785k6;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: qk1.w2 */
public final class C63272w2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63267v2 f179577d;

    /* renamed from: e */
    public final /* synthetic */ C54785k6 f179578e;

    public C63272w2(C63267v2 v2Var, C54785k6 k6Var) {
        this.f179577d = v2Var;
        this.f179578e = k6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongListAdapter$onBindSingSongHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super C54785k6, C13598b0> lVar = this.f179577d.f179555j;
        if (lVar != null) {
            lVar.invoke(this.f179578e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongListAdapter$onBindSingSongHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
