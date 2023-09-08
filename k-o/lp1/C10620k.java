package lp1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lp1.k */
public final class C10620k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10617j f32009d;

    public C10620k(C10617j jVar) {
        this.f32009d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$refreshDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C10617j.m10569G3(this.f32009d, 4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$refreshDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
