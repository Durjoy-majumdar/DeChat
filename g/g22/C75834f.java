package g22;

import android.view.View;
import e22.C75529q0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: g22.f */
public class C75834f implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75529q0 f222450d;

    /* renamed from: e */
    public final /* synthetic */ int f222451e;

    /* renamed from: f */
    public final /* synthetic */ C75838j f222452f;

    public C75834f(C75838j jVar, C75529q0 q0Var, int i) {
        this.f222452f = jVar;
        this.f222450d = q0Var;
        this.f222451e = i;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        this.f222452f.f222460A.mo95116W(this.f222450d.f221910B, this.f222451e);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
