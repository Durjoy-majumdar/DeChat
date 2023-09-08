package jq1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ky2.C10428a;
import te3.C64682rk1;

/* renamed from: jq1.a */
public final class C9488a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9489b f29657d;

    /* renamed from: e */
    public final /* synthetic */ C10428a.C10429a f29658e;

    /* renamed from: f */
    public final /* synthetic */ C64682rk1 f29659f;

    public C9488a(C9489b bVar, C10428a.C10429a aVar, C64682rk1 rk12) {
        this.f29657d = bVar;
        this.f29658e = aVar;
        this.f29659f = rk12;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/teenmode/FinderAuthorizationFiller$fillCellByGuard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9489b.m9169B(this.f29657d, this.f29658e, this.f29659f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/teenmode/FinderAuthorizationFiller$fillCellByGuard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
