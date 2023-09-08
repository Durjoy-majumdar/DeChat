package bt0;

import android.view.View;
import android.widget.ImageView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;

public final /* synthetic */ class b$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79808b f233909d;

    public /* synthetic */ b$$b(C79808b bVar) {
        this.f233909d = bVar;
    }

    public final void onClick(View view) {
        C79808b bVar = this.f233909d;
        int i = C79808b.f233880H;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", bVar, array);
        b$$h b__h = bVar.f233907z;
        if (b__h != null && !b__h.mo109967b(view)) {
            C79810e eVar = bVar.f233904w;
            ImageView imageView = bVar.f233891g;
            if (!eVar.f233920b.isEmpty()) {
                Iterator<View.OnClickListener> it = eVar.f233920b.iterator();
                while (it.hasNext()) {
                    it.next().onClick(imageView);
                }
            }
        }
        C117292a.m165361g(bVar, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
