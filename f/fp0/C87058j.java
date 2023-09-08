package fp0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import fy3.C32226l;
import gt0.C87350h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import zq0.C79426u;

/* renamed from: fp0.j */
public final class C87058j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87041h f252634d;

    public C87058j(C87041h hVar) {
        this.f252634d = hVar;
    }

    public final void onClick(View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87041h hVar = this.f252634d;
        C87350h hVar2 = hVar.f252601L;
        if (hVar2 != null) {
            if (!hVar2.mo121761b()) {
                z = true;
            } else {
                C87350h hVar3 = hVar.f252601L;
                if (hVar3 != null) {
                    z = hVar3.mo121760a();
                } else {
                    C87412m.m108603p("userAgreementComponent");
                    throw null;
                }
            }
            if (!z) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C32226l<Boolean, C13598b0> onAccept = this.f252634d.getOnAccept();
            C87350h hVar4 = this.f252634d.f252601L;
            if (hVar4 != null) {
                onAccept.invoke(Boolean.valueOf(hVar4.mo121760a()));
                C79426u uVar = this.f252634d.f252600K;
                if (uVar != null) {
                    Iterator<PhoneItem> it = uVar.f232954e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        PhoneItem next = it.next();
                        if (next.f245279o) {
                            this.f252634d.getOnPhoneItemSelect().invoke(next);
                            break;
                        }
                    }
                    C87041h hVar5 = this.f252634d;
                    hVar5.mo121452s(hVar5.f252613w);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("mItemAdapter");
                throw null;
            }
            C87412m.m108603p("userAgreementComponent");
            throw null;
        }
        C87412m.m108603p("userAgreementComponent");
        throw null;
    }
}
