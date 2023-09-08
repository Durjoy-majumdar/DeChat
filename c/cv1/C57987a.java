package cv1;

import android.view.View;
import ev1.C58838a;
import gv1.C59712c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cv1.a */
public final class C57987a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58838a f165923d;

    public C57987a(C58838a aVar) {
        this.f165923d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/forcenotify/convert/BaseMsgCardConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f165923d.mo84039l();
        ArrayList<C58838a> arrayList2 = C59712c.f170575I.mo84705a().f170589q;
        C58838a aVar = this.f165923d;
        int i = 0;
        Iterator<C58838a> it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C87412m.m108589b(it.next().f168434d, aVar.f168434d)) {
                break;
            } else {
                i++;
            }
        }
        if (i != 0 || arrayList2.size() <= 1) {
            C59712c.f170575I.mo84705a().mo84686b(this.f165923d.f168434d);
        } else {
            C59712c.f170575I.mo84705a().mo84699p(i + 1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/forcenotify/convert/BaseMsgCardConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
