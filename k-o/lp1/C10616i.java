package lp1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lp1.i */
public final class C10616i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10617j f32000d;

    public C10616i(C10617j jVar) {
        this.f32000d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initCover$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C10617j.m10569G3(this.f32000d, 4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initCover$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
