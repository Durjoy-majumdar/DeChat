package bt0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

public class b$$d implements View.OnClickListener {

    /* renamed from: d */
    public long f152926d = 0;

    /* renamed from: e */
    public final /* synthetic */ C79808b f152927e;

    public b$$d(C79808b bVar) {
        this.f152927e = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (System.currentTimeMillis() - this.f152926d < 250) {
            for (C54553a a : this.f152927e.f233883C) {
                a.mo75436a(this.f152927e);
            }
            this.f152926d = 0;
        }
        this.f152926d = System.currentTimeMillis();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
