package xd1;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import er1.C58684b;
import fe1.C58969q;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xd1.l */
public final class C15661l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58969q f42333d;

    /* renamed from: e */
    public final /* synthetic */ C15644c f42334e;

    public C15661l(C58969q qVar, C15644c cVar) {
        this.f42333d = qVar;
        this.f42334e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$refreshHeader$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("finder_username", this.f42333d.getUsername());
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(this.f42334e.getContext(), intent);
        C15644c cVar = this.f42334e;
        cVar.mo14393n3(1, cVar.f42298q, this.f42333d.getUsername());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$refreshHeader$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
