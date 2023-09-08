package yz2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qy2.C47896n;

/* renamed from: yz2.i */
public final class C53680i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53684j f150758d;

    public C53680i(C53684j jVar) {
        this.f150758d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/MMCardDialog$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C53666d0 d0Var = (C53666d0) this.f150758d;
        d0Var.dismiss();
        C47896n nVar = d0Var.f150736g;
        if (nVar != null) {
            ((C79284y) nVar).mo72644p(102);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/MMCardDialog$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
