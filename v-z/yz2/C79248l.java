package yz2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.l */
public final class C79248l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79239k f232670d;

    public C79248l(C79239k kVar) {
        this.f232670d = kVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$fixLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f232670d.mo109250t();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$fixLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
