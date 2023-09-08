package bt0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;

public class b$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79808b f233912d;

    public b$$f(C79808b bVar) {
        this.f233912d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79810e eVar = this.f233912d.f233904w;
        if (!eVar.f233919a.isEmpty()) {
            Iterator<View.OnClickListener> it = eVar.f233919a.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
