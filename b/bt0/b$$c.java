package bt0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class b$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79808b f233910d;

    public /* synthetic */ b$$c(C79808b bVar) {
        this.f233910d = bVar;
    }

    public final void onClick(View view) {
        C79808b bVar = this.f233910d;
        int i = C79808b.f233880H;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", bVar, array);
        b$$h b__h = bVar.f233907z;
        if (b__h != null) {
            b__h.mo109968c(view);
        }
        C117292a.m165361g(bVar, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
