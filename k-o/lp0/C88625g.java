package lp0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lp0.g */
public class C88625g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f255904d;

    /* renamed from: e */
    public final /* synthetic */ C88626h f255905e;

    public C88625g(C88626h hVar, int i) {
        this.f255905e = hVar;
        this.f255904d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/menu/base/SecondaryMenuSheet$SecondaryMenuAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C88624f fVar = this.f255905e.f255907e;
        if (fVar != null) {
            fVar.mo123054a(view, this.f255904d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/menu/base/SecondaryMenuSheet$SecondaryMenuAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
