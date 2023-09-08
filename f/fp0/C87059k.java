package fp0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fp0.k */
public final class C87059k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87041h f252635d;

    public C87059k(C87041h hVar) {
        this.f252635d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f252635d.getOnDeny().invoke();
        C87041h hVar = this.f252635d;
        hVar.mo121452s(hVar.f252613w);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
