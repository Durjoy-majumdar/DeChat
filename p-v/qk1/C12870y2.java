package qk1;

import android.view.View;
import android.widget.CheckBox;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C12846x2;
import rx3.C13598b0;

/* renamed from: qk1.y2 */
public final class C12870y2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12846x2.C12848b f36839d;

    /* renamed from: e */
    public final /* synthetic */ C12846x2.C12849c f36840e;

    /* renamed from: f */
    public final /* synthetic */ C12846x2 f36841f;

    public C12870y2(C12846x2.C12848b bVar, C12846x2.C12849c cVar, C12846x2 x2Var) {
        this.f36839d = bVar;
        this.f36840e = cVar;
        this.f36841f = x2Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$bindWhiteListViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12846x2.C12848b bVar = this.f36839d;
        boolean z = true;
        if (bVar != null) {
            bVar.f36762a = bVar != null && !bVar.f36762a;
        }
        CheckBox checkBox = this.f36840e.f36766z;
        if (bVar == null || !bVar.f36762a) {
            z = false;
        }
        checkBox.setChecked(z);
        C32224a<C13598b0> aVar = this.f36841f.f36760d;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$bindWhiteListViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
