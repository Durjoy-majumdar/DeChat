package g22;

import android.view.View;
import e22.C75529q0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: g22.e */
public class C75833e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75529q0 f222447d;

    /* renamed from: e */
    public final /* synthetic */ int f222448e;

    /* renamed from: f */
    public final /* synthetic */ C75838j f222449f;

    public C75833e(C75838j jVar, C75529q0 q0Var, int i) {
        this.f222449f = jVar;
        this.f222447d = q0Var;
        this.f222448e = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f222449f.f222460A.mo95118b(this.f222447d, this.f222448e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
