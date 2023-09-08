package yz2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.s */
public final class C79267s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79261r f232712d;

    public C79267s(C79261r rVar) {
        this.f232712d = rVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView$fixLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f232712d.mo109265t();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$fixLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
