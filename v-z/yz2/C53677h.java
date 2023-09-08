package yz2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qy2.C47896n;

/* renamed from: yz2.h */
public final class C53677h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53684j f150754d;

    public C53677h(C53684j jVar) {
        this.f150754d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/MMCardDialog$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C53666d0 d0Var = (C53666d0) this.f150754d;
        d0Var.dismiss();
        C47896n nVar = d0Var.f150736g;
        if (nVar != null) {
            ((C79284y) nVar).mo72644p(101);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/MMCardDialog$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
