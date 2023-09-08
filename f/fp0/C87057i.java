package fp0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fp0.i */
public final class C87057i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87041h f252633d;

    public C87057i(C87041h hVar) {
        this.f252633d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87041h hVar = this.f252633d;
        int i = C87041h.f252589x0;
        hVar.getOnCancel().invoke();
        hVar.mo121452s(hVar.f252613w);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
