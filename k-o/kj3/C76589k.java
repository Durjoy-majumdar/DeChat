package kj3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import kj3.C76593o;

/* renamed from: kj3.k */
public class C76589k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76593o f224170d;

    public C76589k(C76593o oVar) {
        this.f224170d = oVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/appbrand/AppBrandServiceImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76593o.C76594a aVar = this.f224170d.f224185r;
        if (aVar != null) {
            aVar.mo70225a();
        }
        this.f224170d.f224177g.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/ui/appbrand/AppBrandServiceImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
