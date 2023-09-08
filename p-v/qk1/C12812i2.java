package qk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C49098d51;

/* renamed from: qk1.i2 */
public final class C12812i2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12802g2 f36671d;

    /* renamed from: e */
    public final /* synthetic */ C49098d51 f36672e;

    public C12812i2(C12802g2 g2Var, C49098d51 d512) {
        this.f36671d = g2Var;
        this.f36672e = d512;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<C49098d51, C13598b0> lVar = this.f36671d.f36640d;
        if (lVar != null) {
            lVar.invoke(this.f36672e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
