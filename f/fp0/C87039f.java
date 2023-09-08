package fp0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import gt0.C87330d0;
import gt0.C87350h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import yq0.C91566l;

/* renamed from: fp0.f */
public final class C87039f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87032c f252586d;

    public C87039f(C87032c cVar) {
        this.f252586d = cVar;
    }

    public final void onClick(View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87032c cVar = this.f252586d;
        C87350h hVar = cVar.f252551A;
        if (hVar != null) {
            if (!hVar.mo121761b()) {
                z = true;
            } else {
                C87350h hVar2 = cVar.f252551A;
                if (hVar2 != null) {
                    z = hVar2.mo121760a();
                } else {
                    C87412m.m108603p("userAgreementComponent");
                    throw null;
                }
            }
            if (!z) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ArrayList S = C87032c.m108057S(this.f252586d, true);
            C91566l.C91570c listener = this.f252586d.getListener();
            if (listener != null) {
                C87330d0.C87331a T = this.f252586d.getSelectedItem();
                int i = T != null ? T.f253109h : 0;
                C87350h hVar3 = this.f252586d.f252551A;
                if (hVar3 != null) {
                    listener.mo114536a(1, S, i, hVar3.mo121760a());
                } else {
                    C87412m.m108603p("userAgreementComponent");
                    throw null;
                }
            }
            C87032c cVar2 = this.f252586d;
            C81879g gVar = cVar2.f252576x0;
            if (gVar != null) {
                cVar2.mo121452s(gVar);
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("component");
            throw null;
        }
        C87412m.m108603p("userAgreementComponent");
        throw null;
    }
}
