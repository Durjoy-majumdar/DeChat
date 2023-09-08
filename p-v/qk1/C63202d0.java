package qk1;

import android.view.View;
import android.widget.CheckBox;
import cj1.C54785k6;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C63199c0;
import rx3.C13598b0;

/* renamed from: qk1.d0 */
public final class C63202d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63199c0 f179323d;

    /* renamed from: e */
    public final /* synthetic */ C63199c0.C63200a f179324e;

    /* renamed from: f */
    public final /* synthetic */ int f179325f;

    /* renamed from: g */
    public final /* synthetic */ C54785k6 f179326g;

    public C63202d0(C63199c0 c0Var, C63199c0.C63200a aVar, int i, C54785k6 k6Var) {
        this.f179323d = c0Var;
        this.f179324e = aVar;
        this.f179325f = i;
        this.f179326g = k6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongEditAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63199c0 c0Var = this.f179323d;
        C63199c0.C63200a aVar = this.f179324e;
        int i = this.f179325f;
        C54785k6 k6Var = this.f179326g;
        c0Var.getClass();
        boolean z = true;
        boolean z2 = !k6Var.f153569d;
        k6Var.f153569d = z2;
        CheckBox checkBox = aVar.f179320z;
        if (!z2) {
            z = false;
        }
        checkBox.setChecked(z);
        C32228q<? super View, ? super Integer, ? super C54785k6, C13598b0> qVar = c0Var.f179315h;
        if (qVar != null) {
            View view2 = aVar.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            qVar.invoke(view2, Integer.valueOf(i), k6Var);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongEditAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
