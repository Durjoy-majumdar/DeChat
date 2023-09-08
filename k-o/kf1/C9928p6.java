package kf1;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import er1.C58684b;
import fe1.C58969q;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kf1.p6 */
public final class C9928p6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58969q f30564d;

    /* renamed from: e */
    public final /* synthetic */ C9840l6 f30565e;

    public C9928p6(C58969q qVar, C9840l6 l6Var) {
        this.f30564d = qVar;
        this.f30565e = l6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback$refreshHeader$1$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("finder_username", this.f30564d.getUsername());
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(this.f30565e.f30214d, intent);
        C9840l6 l6Var = this.f30565e;
        l6Var.mo10397e1(1, l6Var.f30404C, this.f30564d.getUsername());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback$refreshHeader$1$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
