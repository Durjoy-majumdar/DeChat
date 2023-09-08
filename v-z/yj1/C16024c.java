package yj1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import sx3.C64197v;
import yj1.C16025d;

/* renamed from: yj1.c */
public final class C16024c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16025d f43103d;

    /* renamed from: e */
    public final /* synthetic */ int f43104e;

    public C16024c(C16025d dVar, int i) {
        this.f43103d = dVar;
        this.f43104e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeManagerListWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16025d dVar = this.f43103d;
        int i = this.f43104e;
        int i2 = 0;
        for (T next : dVar.f43108n) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                ((C16025d.C16027b) next).f43114b = i2 == i;
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        dVar.f43109o.notifyDataSetChanged();
        dVar.mo9763a();
        dVar.f43105h.invoke(Long.valueOf(dVar.f43108n.get(i).f43113a));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeManagerListWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
