package fp0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import yq0.C91566l;

/* renamed from: fp0.e */
public final class C87038e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87032c f252585d;

    public C87038e(C87032c cVar) {
        this.f252585d = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ArrayList S = C87032c.m108057S(this.f252585d, false);
        C91566l.C91570c listener = this.f252585d.getListener();
        if (listener != null) {
            C91566l.C91570c.C91571a.m114908a(listener, 2, S, 0, false, 12, (Object) null);
        }
        C87032c cVar = this.f252585d;
        C81879g gVar = cVar.f252576x0;
        if (gVar != null) {
            cVar.mo121452s(gVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("component");
        throw null;
    }
}
